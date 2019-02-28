package extra;

public class fib {
public static void main(String[] args) {

int temp= 27;
int high = 1;
int low = 0;


for (int i = 0; i < 120; i++) {
	

	temp =low;
	low=high;	
	high=temp+low;
System.out.println(high);

}

}
}
