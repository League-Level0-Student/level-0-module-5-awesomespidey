
public class AllABoutForLoops {
public static void main(String[] args) {

	
	
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}

	for (int i =100 ; i >0; i--) {
		System.out.println(i);
	}

	for (int i = 2; i < 101; i+=2) {
		System.out.println(i);
	}

	for (int i = 1; i < 100; i+=2) {
		System.out.println(i);
	}

	for (int i = 1; i < 501; i++) {
		if (i%2==0) {
		System.out.println("even");
		}
		else {
		
		System.out.println("odd");		}
	}

	for (int i = 0; i < 778; i++) {
		if (i%7==0)
		{		System.out.println(i);
		}
	}
	for (int i = 2007; i < 2020; i++) {
		System.out.println("In " + i + ", I was " + (i - 2007) + " years old.");
	}
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		System.out.println(i+""+j);
		}
	}

	for (int i = 0; i < 7; i+=3) {
		for (int j = 1; j < 4; j++) {
		System.out.print(i+j);
		}
		System.out.println();
	}

	for (int i = 0; i < 91 ; i++) {
		for (int j = 1; j < 10; j++) {
		System.out.print(i+j);
		}
		System.out.println();
	}


}

}
