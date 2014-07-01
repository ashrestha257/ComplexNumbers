import java.util.Scanner;
public class ComplexNumberDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the real value for first complex number: ");
		double realOne = scan.nextDouble();
		System.out.println("Enter the imaginary value for first complex number:");
		double imagOne = scan.nextDouble();
		// Create two complex number objects
		
		ComplexNum complexOne = new ComplexNum(realOne, imagOne);
		System.out.println("Enter the real value for next complex number:");
		int realTwo = scan.nextInt();
		System.out.println("Enter the imag value for next complex number:");
		int imagTwo = scan.nextInt();
		
		ComplexNum complexTwo = new ComplexNum(realTwo,imagTwo);
		// Addition of two complex numbers
		System.out.println("The addition of ComplexOne and ComplexTwo: "+ complexOne.add(complexTwo));
		
		//Subtraction of two complex numbers
		System.out.println("The subtraction of ComplexOne and ComplexTwo: "+ complexOne.sub(complexTwo) );
		
		//Multiplication of two complex numbers
		System.out.println("The multiplication of ComplexOne and ComplexTwo: "+ complexOne.mul(complexTwo));
		
		//Division of two complex numbers
		System.out.println("The divison of ComplexOne and ComplexTwo: "+ complexOne.div(complexTwo));
	}
	

}
