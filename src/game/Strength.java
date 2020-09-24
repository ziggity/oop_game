package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Strength {
	private List<HitPoint> hitPoints;
	
	public Strength() {
		hitPoints = new ArrayList<HitPoint>();
		
		HitPoint h1 = new HitPoint();
		h1.setHitPoint(5);
		h1.setHitPointName("H5");
		hitPoints.add(h1);

		HitPoint h2 = new HitPoint();
		h2.setHitPoint(10);
		h2.setHitPointName("H10");
		hitPoints.add(h2);

		HitPoint h3 = new HitPoint();
		h3.setHitPoint(15);
		h3.setHitPointName("H15");
		hitPoints.add(h3);

		HitPoint h4 = new HitPoint();
		h4.setHitPoint(20);
		h4.setHitPointName("H20");
		hitPoints.add(h4);
	}

	public List<HitPoint> getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(List<HitPoint> hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void shuffle() {
		//Collections.shuffle(hitPoints);
		
//		Fisher-Yates shuffle
		Random random = new Random();
		
//		for(int i = 0; i < hitPoints.size(); i++) {
//			0 1 2 3 4 .......
//		}
		for(int i = hitPoints.size() - 1; i > 0; i--) {
//			9 8 7 6 5 .......
			int j = random.nextInt(i + 1);
			
			HitPoint hitPointAtIndexI = hitPoints.get(i);
			HitPoint hitPointAtIndexJ = hitPoints.get(j);
			
			hitPoints.set(i, hitPointAtIndexJ);
			hitPoints.set(j, hitPointAtIndexI);
		}
	}

	public HitPoint draw() {
		return hitPoints.remove(0);
	}
}
