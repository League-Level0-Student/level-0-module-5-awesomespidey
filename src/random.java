import java.util.Random;

import javax.swing.JOptionPane;

public class random {
public static void main(String[] args) {
	//ask the user for two numbers 
	
	//convert them to ints 
	
	//call the random method below 
String input = JOptionPane.showInputDialog(" give me number");
String in = JOptionPane.showInputDialog(" give me another number higher than the last one ");
	int num = Integer.parseInt(input);
	int number = Integer.parseInt(in);
	random(num,number);
}

public static void random(int low, int high) {
	Random fere = new Random();
	//create an instance of Random 
	int number = fere.nextInt((high-low)+1)+low;  
	//use nextInt to get a random number between a and b 
	JOptionPane.showMessageDialog(null,number);
	//print your random number! 
	JOptionPane.showMessageDialog(null,"here is your random number");
}
}