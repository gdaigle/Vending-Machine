import java.util.Random;

public class VendingMachine {
	public static VendingMachine machine = new VendingMachine();
	Random random = new Random();
	final int maxCoke = random.nextInt(1,20);   
	final int maxDietCoke = random.nextInt(1,20);   
	final int maxSprite = random.nextInt(1,20);   
	final int maxDP = random.nextInt(1,20);   
	final int maxMonster = random.nextInt(1,20);   
	int cokeCount;
	int dietCokeCount;
	int spriteCount;
	int dpCount;
	int monsterCount;
	public VendingMachine(){
		//Sets up the vending machine 
		cokeCount = maxCoke;
		dietCokeCount = maxDietCoke;
		spriteCount = maxSprite;
		dpCount = maxDP;
		monsterCount = maxMonster;
	}
	public static void main(String[] args) {
		newMachine();
	}
	private static void newMachine() {
		Menu start = new Menu();
		start.menu();
	}
	public int getCokeCount() {
		return cokeCount;
	}
	public int getDietCokeCount() {
		return dietCokeCount;
	}
	public int getSpriteCount() {
		return spriteCount;
	}
	
	public int getDrPepperCount() {
		return dpCount;
	}
	
	public int getMonsterCount() {
		return monsterCount;
	}

	
	
	public int getMaxCoke() {
		return maxCoke;
	}
	public int getMaxDietCoke() {
		return maxDietCoke;
	}
	public int getMaxSprite() {
		return maxSprite;
	}
	
	public int getMaxDrPepper() {
		return maxDP;
	}
	
	public int getMaxMonster() {
		return maxMonster;
	}

}

