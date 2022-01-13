import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		int input=0;
		int num1,num2,num3;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		input=Integer.parseInt(sc.nextLine());
		
		int number=input;
		int counter=0;
		while(number>0) {
			int t=number%10;
			System.out.println("cube of" +t +" is"+(t*t*t));
			counter=counter+1;
			number=number/10;
		}
	}

	
	}


