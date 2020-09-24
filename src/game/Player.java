package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<HitPoint> ammo;
	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
		this.ammo = new ArrayList<HitPoint>();
		this.score = 0;
	}

	public List<HitPoint> getAmmo() {
		return ammo;
	}

	public void setAmmo(List<HitPoint> ammo) {
		this.ammo = ammo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void describe() {
		System.out.println("Player name: " + this.name);

		for (HitPoint hp : ammo) {
			hp.describe();
		}
	}

	public HitPoint attack() {
		return ammo.remove(0);
	}

	public void draw(Strength strength) {
		HitPoint hp = strength.draw();
		ammo.add(hp);
	}

	public void incrementScore() {
		score += 1;
	}
}
