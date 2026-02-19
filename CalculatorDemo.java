import java.util.Scanner;

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        double realSum = c1.getReal() + c2.getReal();
        double imaginarySum = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(realSum, imaginarySum);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

      
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();

        int intSum = calc.add(int1, int2);
        System.out.println("Sum of integers: " + intSum);

       
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();

        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();

        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = scanner.nextDouble();

        ComplexNumber c1 = new ComplexNumber(real1, imag1);
        ComplexNumber c2 = new ComplexNumber(real2, imag2);
        ComplexNumber complexSum = calc.add(c1, c2);

        System.out.print("Sum of complex numbers: ");
        complexSum.display();

        scanner.close(); 
    }
}
