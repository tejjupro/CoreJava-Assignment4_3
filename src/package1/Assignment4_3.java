package package1;     //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

/*
 * This assignment helped me to master the concept of final keyword and methods to use it.
 */


final class finalClass       //Declaring class as final, It means now, this class can not be inherited.
{
	final int finalVariable;        //Declaring the int variable as a final.
	
	/*
	 * This class is final, So by default all the methods inside this class is final methods.
	 */
	
	public finalClass(int finalVariable)      //Creating constructor.
	{
		//NOTE THAT....
		/*
		 * constructor can never be inherited. So you can't need to use final keyword. No Constructors can NEVER be declared as final. 
		 * Your compiler will always give an error of the type "modifier final not allowed".
		 */
		
		this.finalVariable=finalVariable;       //Initialization of final variable.Now, value of this variable can not be changed, it will remains same.
	}
	
	public final void display()      //Creating final method display to print the final variable of class.
	{
		/*
		 * In fact, if we are not explicitly defining this method as final, it will be automatically be final method.
		 * Because this method is inside the final class, And we know that all the methods inside the final class are by default final.
		 * Methods which are final can not be overridden in the sub class. 
		 */
		
		System.out.println("The value of final variable of class is "+this.finalVariable);     //Printing value of final variable.
		
	}
	
}     //End of final class.





public class Assignment4_3    //Class declaration containing main method.
{
	public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function. 
	{
		final int parameterToPass;       //Initializing int variable as final.
		System.out.println("Enter the number which you want to store as final variable of class");
		// asking value of parameterToPass from the user.
        // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		
		//Now we want to take input of the value of parameterToPass from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		parameterToPass=sc.nextInt();      //Initializing the value of final variable, The value of this variable can not be changed after this.
		
		finalClass objFinalClass=new finalClass(parameterToPass);
		     /*
		      * Creating the object of final class, and we passed the value of parameterToPass variable to initialize the final variable 
		      * of class in the constructor of the function. 
		      */
		
		objFinalClass.display();     //Calling display() method of object of finalClass.
		
		sc.close();        //Closing the object of Scanner class.
	}
}