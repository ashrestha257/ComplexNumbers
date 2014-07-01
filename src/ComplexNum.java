/**
 * @author Archana Shrestha 
 * Program Description: This program executes all the possible complex
 * number operation.
 * For Example:(ComplexNumberDriver.java)
 * Enter the real value for first complex number: 12
 * Enter the imaginary value for first complex number: 13
 * Enter the real value for next complex number:44
 * Enter the imag value for next complex number:66
 * The addition of ComplexOne and ComplexTwo: 56.0+79.0i
 * The subtraction of ComplexOne and ComplexTwo: -32.0-53.0i
 * The multiplication of ComplexOne and ComplexTwo: -330.0+1386.0i
 * The divison of ComplexOne and ComplexTwo: 0.2202797202797203-0.03496503496503497i
 **/
import java.util.Scanner;
public class ComplexNum {
private double real;//Class variable(Real number)
private double imag;//Class variable(Imaginary number)

	/*
	 * Create Constructor for Complex number take real and imaginary numbers as
	 * parameters.
	 */

	public ComplexNum(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	/*
	 * String representation of complex numbers
	 */
	public String toString() {
		if (this.imag < 0) {
			return (this.real + "-" + -1 * this.imag + "i");
		}
		if (this.imag > 0) {
			return (this.real + "+" + this.imag + "i");
		}
		if (this.imag == 0) {
			return (this.real + "");
		}
		return real + "+" + imag + "i";

	}

	/*
	 * This method returns addition of two complex numbers Add two reals and two
	 * imaginaries
	 */
	public ComplexNum add(ComplexNum newComplex) {
		double newValue = this.real + newComplex.real;
		double anoNewValue = this.imag + newComplex.imag;
		return new ComplexNum(newValue, anoNewValue);
	}

	/*
	 * This method returns subtraction of two complex numbers 
	 */
	public ComplexNum sub(ComplexNum newComplex) {
		double newValue = this.real - newComplex.real;
		double anoNewValue = this.imag - newComplex.imag;
		return new ComplexNum(newValue, anoNewValue);
	}

	/*
	 * This method returns multiplication of two complex numbers
	 */
	public ComplexNum mul(ComplexNum newComplex) {
		double newValue = this.real * newComplex.real - this.imag
				* newComplex.imag;
		double anoNewValue = this.imag * newComplex.imag + this.real
				* newComplex.real;
		return new ComplexNum(newValue, anoNewValue);
	}
	/*
	 * This method returns division of two complex numbers
	 */
	public ComplexNum div(ComplexNum newComplex) {
		double newValue = ((this.real * newComplex.real) + (this.imag * newComplex.imag))
				/ ((Math.pow(newComplex.real, 2)) + (Math.pow(newComplex.imag,
						2)));
		double anoNewValue = ((this.imag * newComplex.real) - (this.real * newComplex.imag))
				/ ((Math.pow(newComplex.real, 2)) + (Math.pow(newComplex.imag,
						2)));
		return new ComplexNum(newValue, anoNewValue);
	}

}
