package test_project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		System.out.println();

		int radius = 5;
		double pi = 3.142;
		double area = 0;
		
		while (area <= 500) {
			area = pi * (radius * radius);
			if (area > 500) {
				System.out.println("Area " + area + " is greater than 500");
			} else {
				System.out.println("Area " + area + " is less than 500");
			}
			++radius;
		}
		
		for (double i=2.5; i<=5000; i=i*10) {
			System.out.println(i);
		}
		
		int n = 10;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=n-1; i>0; i--) {
			
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		boolean t = true;
		boolean f = false;
		
		System.out.println("true AND false: " + (t && f));
		System.out.println("false AND true: " + (f && t));
		System.out.println("true AND true: " + (t && t));
		System.out.println("false AND false: " + (f && f));
		System.out.println("true OR false: " + (t || f));
		System.out.println("false OR true: " + (f || t));
		System.out.println("true OR true: " + (t || t));
		System.out.println("false OR false: " + (f || f));
		
		int[] a = new int[5];
		
		for (int i=0; i<5; i++) {
			a[i] = i+1;
			System.out.println(a[i]);
		}
		
		int[] b = new int[5];
		int[] c = new int[5];
		int[] d = new int[5];
		
		for (int i=0; i<5; i++) {
			b[i] = i;
		}
		
		int num = 5;

		for (int i=0; i<5; i++) {
			c[i] = num;
			++num;
		}
		
		for (int i=0; i<5; i++) {
			d[i] = add(b[i], c[i]);
		}
		
		System.out.print("Values of 1st array: ");
		for (int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.print("\nValues of 2nd array: ");
		for (int i=0; i<5; i++) {
			System.out.print(c[i] + " ");
		}
		
		System.out.print("\nValues of 3rd array: ");
		for (int i=0; i<5; i++) {
			System.out.print(d[i] + " ");
		}
		
		int[][] e = new int[3][3];
		int number = 1;
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				e[i][j] = number;
				++number;
			}
		}
		
		System.out.print("\nValues of two-dimensional array: ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(e[i][j] + " ");
			}
			System.out.print("  ");
			
		}
		
		Test obj = new Test();
		int x = 10;
		int y = 15;
		
		int result = obj.subtract(x, y);
		System.out.println("\nSubtraction result: "+ result);
		
		swapFunction(25, 28);
		
		int l = 10;
		int w = 20;
		int r = 7;
		
		System.out.println("Area of the rectangle is: " + obj.area(l, w));
		System.out.println("Area of the circle is: " + obj.area(r));


	}
	
	public static void intro() {
		System.out.println("JAVA PROGRAMMING BASICS");
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping, a = " + a + " b = " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("After swapping, a = " + a + " b " + b);
	}
	
//	Method overloading
	
	public int area(int n1, int n2) {
		return n1*n2;
	}
	
	public float area(int n) {
		return 3.14f*n*n;
	}

}
