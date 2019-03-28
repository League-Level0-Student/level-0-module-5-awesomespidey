import javax.swing.JOptionPane;

public class mainMethods {
  public static void main(String[] args) {
	sayHello();
	sayHello2("Joy");
	evenOrOdd(24);
	add(45,56);
}
public static void sayHello(){
JOptionPane.showMessageDialog(null,"Hello");
}

public static void sayHello2(String name){
System.out.println("hello " + name);
}

public static void evenOrOdd (int a) {

	if (a%2==0) {
System.out.println("even");
}
	else {	
System.out.println("odd");
}
}

public static void add(int a, int b ) {
    System.out.println(a+b);
}
}


