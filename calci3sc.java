package calci3;

import java.util.Scanner;

public class calci3sc {

	public static void main(String[] args) {
		System.out.print("This is just a simple calculator \n");
		Scanner scanner = new Scanner(System.in);
        double alpa = 0.0, beta =0.0, gamma = 0.0;
        for (int flog=0; flog!=1;) {
        	System.out.print("Enter the first number \n");
        	for (int flag=0; flag!=1;) {
        		if (alpa==0.0) {
        			alpa = scanner.nextDouble();
        			System.out.print("Enter another number  \n");
        			beta = scanner.nextDouble();
        		 
        			System.out.print("What you want? | + | - | * | / | % |\n");
        			char op = scanner.next().charAt(0);
        			gamma = cnt(alpa, beta, op);
        			if (yn(alpa, beta, op, gamma)==1) {
        				break;
        			}
        			System.out.print("Enter another number  \n");
        			alpa=gamma;
        		}	
        		else {
        			alpa=gamma;
       		 		beta = scanner.nextDouble();
       		 		System.out.print("What you want? | + | - | * | / | % | \n");
       		 		char op = scanner.next().charAt(0);
       		 		gamma = cnt(alpa, beta, op);
       		 		if (yn(alpa, beta, op, gamma)==1) {
       		 			break;
       		 		}
       		 		System.out.print("Enter another number  \n");
        		}
        	}
        	System.out.print("Want reset? | y | n | \n");
        	char reset = scanner.next().charAt(0);
        	if(reset=='n') {
        		break;
     		}
        	else if(reset=='y') {
        		alpa=0;
     		}
        }
	}
        
	public static double cnt(double a, double b, char op) {
		double c=0.0, d=0.0;
		if (op == '+') {
        	c = a + b;}
        else if (op == '-') {
        	c = a - b;}
        else if (op == '*')	{
        	c = a * b;}
        else if (op == '/') {
        	c = a / b;}
        else if (op == '%') {
        	c = a % b;}
		System.out.println(a + " " + op + " " + b + " = " + c);
		return c;
	}
	public static double yn(double a, double b, char op, double c){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is it enough? | y | n |\n");
		char yn = scanner.next().charAt(0);
		double d=0;
		if(yn=='y') {
		   System.out.println("Your last value is: " + c + "\n");  
		   d=1;
		}
		else if(yn =='n') {
			d=0;
		}
		return d;
		}
	}