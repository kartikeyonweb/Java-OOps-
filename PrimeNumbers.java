package loops;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	boolean isPrime=true;
	
	for(int i=2;i<=n;i++) {
		if(n%i==0)
		{
			System.out.println(" non prime");
			
		}
		else
			System.out.println(" prime");
		break;
	}
	if(n<=1) {
		System.out.println("Cannot determine");
	}
	}

}
