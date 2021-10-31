
public class Elephant {

	public static void main(String[] args)
	throws java.io.IOException //captures any errors that java might come across
	{
	
	 char input; //Declaring the variable where we will store the input
	 
	 System.out.println ("The capital of Kenya is Nairobi? (Answer T or F):");//Asking the user to enter input
	 
	     /*
		 * The value input will be the same as what is accepted from the keyboard.
		 * In order for java to be able to read the input as a char we need to covert "in" found in System.in.read to char by using (char)
		 */
	 
	 input = (char) System.in.read();//read character from the keyboard, intended for single character input
	
	 //Using logic statements OR
	 if((input == 'T') || (input =='t')) 
			 System.out.println("Correct"); //if 'T' entered
	 if((input == 'F') || (input =='f'))
			 System.out.println("Incorrect");//if 'F' entered
	
	
	

	}

}
