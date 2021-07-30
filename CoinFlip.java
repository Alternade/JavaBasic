package concept;
import java.util.*;

public class CoinFlip {
	
	public static void main(String[] args) { 
		float n1 = 0;
		float n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of time you want to toss");
		int n = sc.nextInt();
		sc.close();			
		for (int i = 0; i<=n;i++)
		{
			if (Math.random() < 0.5){
				System.out.println("Heads");
				n1++;
			}	
			else{
				System.out.println("Tails");
				n2++;
			}
		}
		System.out.println("Percentage of Heads " + (n1/(n1+n2)*100));
		System.out.println("Percentage of tails " + (n2/(n1+n2)*100));
		
	}
}

