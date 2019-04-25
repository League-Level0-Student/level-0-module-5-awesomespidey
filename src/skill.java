import java.util.Random;

import javax.swing.JOptionPane;

public class skill {
	
		public static void main(String[] args) {

		skill skills = new skill();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
//			 String input = JOptionPane.showInputDialog("How many dimes do you have");
//			 int cents = Integer.parseInt(input);
//			 
//			 
//
//
//		// Tell them how many cents they have (hint multiply by 10)
//			int total = cents*10;
//					System.out.println("you have a total of "+total+" cents! ");



		// Ask the user how tall they are (inches)
	String inputlife = JOptionPane.showInputDialog("how tall are you in inches");
	int inches = Integer.parseInt(inputlife);
	
if (inches<60) {
	JOptionPane.showMessageDialog(null,"You need to eat your wheaties boi u short");
	
}
else {
	JOptionPane.showMessageDialog(null,"u gucci");
}

		// If they are shorter than 36 inches, tell them to eat their Wheaties
		}

		void skill2() { // Write a for loop to print every third number between 1 and 30 to the console 

			for (int i = 0; i < 31; i+=3) {
				System.out.println(i);
			}
		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 
				Random luna = new Random ();
				int num = luna.nextInt (21);
					JOptionPane.showMessageDialog(null,num," remember this number",0);
		// Get another random number that is less than 10 and print it to the console 
				Random jeff = new Random ();				
				int number = jeff.nextInt(11);
					JOptionPane.showMessageDialog(null,number, "remember this number too",0);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
					JOptionPane.showMessageDialog(null,number-num ,"message, this is the sum of the two numbers",0);
		}

		void skill4() { // In a pop-up, ask the user for the city they live in 
	String input =	JOptionPane.showInputDialog("What city do you live in");

		// If they answered "San Diego", tell them they live in America's Finest City 
				if (input.equals( "San Diego")) {
					JOptionPane.showMessageDialog(null," U live in America's Finest City");
				}
				else {
					JOptionPane.showMessageDialog(null," U should move to San Diego");
				}

		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. 
				int Cars = 4;
		
		// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
				if (Cars==0) {
					JOptionPane.showMessageDialog(null," I bet that you use public transprotaion to get around the world or just for going to the store so yeah ");
				}
				else if (Cars==1) {
					JOptionPane.showMessageDialog(null," You should buy the brand Mercy");
				}
				else if(Cars>1){
					JOptionPane.showMessageDialog(null,"that is a good amount of cars ");
				}
		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 
	String input =  JOptionPane.showInputDialog("What is the name of your school");


// In another pop-up, tell the user, that their school is a fantastic school. 
		JOptionPane.showMessageDialog(null,input + " is a fantastic school ya know");
	
	// You must include the name of the school in the message. 
	


		}


}
