# Java-calculator
import java.util.*;

public class Calculator {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int mod = a % b;
		
		int div = 0;
                if (b != 0) {
               	 div = a / b;
      	        } else {
          	  System.out.println("Error: Division by zero");
       		 }
		
		System.out.println("enter choice");
		int button = sc.nextInt();
		switch(button) {
			case 1: System.out.println(sum);
			break;
			case 2: System.out.println(sub);
			break;
			case 3: System.out.println(mul);
			break;
			case 4: System.out.println(div);
			break;
			default: System.out.println(mod);
		}
	}
}
