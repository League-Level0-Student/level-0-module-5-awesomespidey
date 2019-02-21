
public class PrimeOrNot {
public static void main(String[] args) {
	

 System.out.println(primeOrNot (1378676556));
}
static boolean primeOrNot (int num) {
	for(int i = 2; i< num;i++){
	
	if (num % i == 0){
		
	return false; 	
	}
	}
	return true;

}
}
