import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Player Name:");
		String name = input.nextLine();
		
		System.out.println("Player Hits:");
		int hits = input.nextInt();
		
		System.out.println("Player At Bats:");
		int atBats = input.nextInt();
		
		System.out.println("Player Walks:");
		int walks = input.nextInt();
		
		System.out.println("Player Hits by Pitch:");
		int hitsByPitch = input.nextInt();
		
		System.out.println("Player Sacrifice Flys:");
		int sacrificeFlies = input.nextInt();
		
		System.out.println("Player Doubles:");
		int doubles = input.nextInt();
		
		System.out.println("Player Triples:");
		int triples = input.nextInt();
		
		System.out.println("Player Homeruns:");
		int homeruns = input.nextInt();
		
		BaseballPlayer babeRuth = new BaseballPlayer(hits,atBats,walks,hitsByPitch,sacrificeFlies,doubles,triples,homeruns);
		
		System.out.println(name + " Statistics: ");
		
		System.out.println("Hits: " + hits);
		System.out.println("At bats: " + atBats);
		System.out.println("Walks: " + walks);
		System.out.println(" Hits by Pitch: " + hitsByPitch + " Sacrifice Flies: " + sacrificeFlies + " Doubles: " + doubles + " Triples: " + triples + " Homeruns: " + homeruns);
		
		System.out.println("Batting Average: " + babeRuth.getBA() + " OBP: " + babeRuth.getOBP() + " SLG: " + babeRuth.getSLG() + " OPS: " + babeRuth.getOPS() + " TB: " + babeRuth.getTB());
		
	}

}