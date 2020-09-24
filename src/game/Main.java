package game;

public class Main {

	public static void main(String[] args) {
//		HitPoint
//		Strength
//		Player
		Strength strength = new Strength();
		Player dartVader = new Player("Darth Vader");
		Player obiWanKenobi = new Player("Obi Wan Kenobi");
		strength.shuffle();

		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				dartVader.draw(strength);
			} else {
				obiWanKenobi.draw(strength);
			}
		}
		
		for (int i = 1; i < 3; i++) {
			HitPoint darthVaderHP = dartVader.attack();
			HitPoint obiWanKenobiHP = obiWanKenobi.attack();
			
			if(darthVaderHP.getHitPoint() > obiWanKenobiHP.getHitPoint()) {
				
				dartVader.incrementScore();
				
			} else if (darthVaderHP.getHitPoint() < obiWanKenobiHP.getHitPoint()) {
				
				obiWanKenobi.incrementScore();
				
			} else {
				dartVader.incrementScore();
				obiWanKenobi.incrementScore();
			}
		}
		
		int darthVaderScore = dartVader.getScore();
		int obiWanKenobiScore = obiWanKenobi.getScore();
		
		if (darthVaderScore == obiWanKenobiScore) {
			
			System.out.println("The fight was drawn between " + dartVader.getName() + " and " + obiWanKenobi.getName());
			
		} else if (darthVaderScore > obiWanKenobiScore) {
			
			System.out.println(dartVader.getName() + " won!");
			
		} else {
			
			System.out.println(obiWanKenobi.getName() + " won!");
			
		}
	}
}
