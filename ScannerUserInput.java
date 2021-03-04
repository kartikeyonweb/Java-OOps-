package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	System.out.println("To find simple intrest");
	int principle=sc.nextInt();
	float rate=sc.nextFloat();
	int year=sc.nextInt();
	float simpleIntrest=principle*rate*year/100;
	System.out.println(simpleIntrest);
	
	}
	

}
