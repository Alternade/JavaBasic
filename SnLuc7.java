package SnakesAndLadders;
import java.util.Random;

public class SnLuc7 {
	final static int min = 1;
	final static int max = 6;
	
	public static void main(String[] args) {

		int CurrentPosition = 0;
		int count=0;
		while(CurrentPosition != 100) {		
			String Player1 = new String("Player1");
			int die_roll = (int)Math.floor(Math.random()*(max-min+1)+min);
			System.out.println("Player 1 have rolled "+ " " + die_roll );				
			CurrentPosition = CurrentPosition + die_roll;
			int tile = 0;
			Random random = new Random();
			while (true){
				tile = random.nextInt(4);
				
				if(tile !=0) break;
				else break;
			}
			if(CurrentPosition <= 100){
				if (tile==2) {
					System.out.println("You stepped in ladder");
					CurrentPosition = CurrentPosition + 10;
					int die_roll1 = (int)Math.floor(Math.random()*(max-min+1)+min);
					System.out.println("Player 1 have rolled "+ " " + die_roll1 );				
					CurrentPosition = CurrentPosition + die_roll1;
				}
				else if(tile==3) {
					System.out.println("You stepped in snake");
					CurrentPosition = CurrentPosition - 5 ;	
				}
				else {
					System.out.println("You stepped in Normal tile");
					CurrentPosition = CurrentPosition;
					
				}
				System.out.println("Current Tile is "+ CurrentPosition );
			}	
			else {
				CurrentPosition = CurrentPosition-die_roll;
				System.out.println("Current Tile is "+ CurrentPosition );
			}
			count++;
		}
		System.out.println("Number of Dice Rolls"+ count );
	}
}
