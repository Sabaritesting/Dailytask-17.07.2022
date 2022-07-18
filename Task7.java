package Tasks;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int a=sc.nextInt();
for(int i=0;i<10;i++) {
	System.out.println(a + " x " + (i+1) + " = " + 
		     (a * (i+1)));
}
}

}
