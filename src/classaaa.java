import java.util.Scanner;

public class classaaa {
	
	public classaaa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args) {
		
		System.out.println("ENTER YOUR NAME:");
		
		Scanner input = new Scanner(System.in);
		
		String s= input.nextLine();
		
		System.out.println("Welcome  "+s);
	}
}
