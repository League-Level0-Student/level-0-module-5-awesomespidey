import javax.swing.JOptionPane;

public class mainMethods {
  public static void main(String[] args) {
	sayHello();
	sayHello2("joy");
}
public static void sayHello(){
JOptionPane.showMessageDialog(null,"Hello");
}

public static void sayHello2(String name){
System.out.println("hello" + name);
}



}


