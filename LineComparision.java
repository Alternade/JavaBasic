import java.util.*;

public class LineComparision {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter x1 ");  
		int x1= sc.nextInt();
		System.out.print("Enter y1 ");  
		int y1= sc.nextInt();
		System.out.print("Enter x2 ");  
		int x2= sc.nextInt();
		System.out.print("Enter y2 ");  
		int y2= sc.nextInt();
		System.out.print("Enter x3 ");  
		int x3= sc.nextInt();
		System.out.print("Enter y3 ");  
		int y3= sc.nextInt();
		System.out.print("Enter x4 ");  
		int x4= sc.nextInt();
		System.out.print("Enter y4 ");  
		int y4= sc.nextInt();
		double line1 = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		double line2 = Math.sqrt((x4-x3)^2+(y4-y3)^2);
		if(line1==line2) {
			System.out.print("Length of line is same ");
		}
		else if(line1 > line2) {
			System.out.print("Length of line1 is bigger ");			
		}
		else {
			System.out.print("Length of line2 is bigger ");
		}
		// TODO Auto-generated method stub
	}
}
