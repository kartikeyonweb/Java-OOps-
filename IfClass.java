package conditional;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("This program checks that are you enable for voting");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	if(x<18) {
		System.out.println("No u cant");}
	
		else {
			System.out.println("yes u can");
	}
	
			
	}}
