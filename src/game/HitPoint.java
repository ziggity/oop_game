package game;

public class HitPoint {
	private int hitPoint;
	private String hitPointName;

	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}

	public String getHitPointName() {
		return hitPointName;
	}

	public void setHitPointName(String hitPointName) {
		this.hitPointName = hitPointName;
	}
	
	public void describe() {
		System.out.println("Hit Point: " + hitPointName + ", has strength of " + hitPoint + "HP");
	}
}
