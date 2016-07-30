package firstEx;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FirstExample {

	public FirstExample(int x, int y) {
		// TODO Auto-generated constructor stub
		System.out.println("Costructor loaded");

		System.out.println("\tsum of constructor by value\t" + (x + y));
	}

	public FirstExample(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		System.out.println("\tmultiplication by three values\t" + x * y * z);
	}

	public void sum(int a, int b) {
		System.out.println("Sum of two number:" + (a + b));

	}

	public void sum(int a, int b, int c) {
		System.out.println(" Sum of three numbers: " + (a + b + c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int temp = 1;

		FirstExample obj = new FirstExample(54, 66);
		FirstExample obj1 = new FirstExample(54, 66, 2);
		obj.sum(5, 6);
		obj.sum(5, 6, 7);

		System.out.println("Hi, This is first program");

		// temp = 1;

		//
		// for ( int i=1;i<=10;i++)
		// {
		// for ( int j=1;j<=10;j++)
		// {
		// temp = i*j;
		// System.out.println( i +" * "+j+" = "+temp);
		// }
		// System.out.println("\n");
		// }
		//
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Starting of two dimensional array: Enter the dimensions\n");
		System.out.println(" No.of rows");
		int x = sc.nextInt();
		System.out.println("no.of columns");
		int y = sc.nextInt();

		String Elections[][] = new String[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {

				System.out.println(" Enter the democratic party count");
				Elections[i][j] = sc.next();
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				
				System.out.printf("|  "+Elections[i][j]+"  |");

			}
			System.out.println('\n');

		}

	}

}
