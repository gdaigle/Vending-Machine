
public class Vend {	
	public void vendCoke() {
		if (VendingMachine.machine.cokeCount > 0) {
			if (Money.money.userBalance >= Money.money.cokeCost) {
				VendingMachine.machine.cokeCount--;
				Money.money.userBalance = Money.money.userBalance - Money.money.cokeCost;
				Money.money.machineBalance += Money.money.cokeCost;
				System.out.println("Your Coke has been despenced. Enjoy!");
			}
			else {
				System.out.println("You do not have enough money to make this purchase.");
			}
		}
		else {
			System.out.println("Coke is out of stock.");
		}
	}
	
	public void vendDietCoke() {
		if (VendingMachine.machine.dietCokeCount > 0) {
			if (Money.money.userBalance >= Money.money.dietCokeCost) {
				VendingMachine.machine.dietCokeCount--;
				Money.money.userBalance = Money.money.userBalance - Money.money.dietCokeCost;
				Money.money.machineBalance += Money.money.dietCokeCost;
				System.out.println("Your Diet Coke has been despenced. Enjoy!");
			}
			else {
				System.out.println("You do not have enough money to make this purchase.");
			}
		}
		else {
			System.out.println("Diet Coke is out of stock.");
		}
	}
	
	public void vendSprite() {
		if (VendingMachine.machine.spriteCount > 0) {
			if (Money.money.userBalance >= Money.money.spriteCost) {
				VendingMachine.machine.spriteCount--;
				Money.money.userBalance = Money.money.userBalance - Money.money.spriteCost;
				Money.money.machineBalance += Money.money.spriteCost;
				System.out.println("Your Sprite has been despenced. Enjoy!");
			}
			else {
				System.out.println("You do not have enough money to make this purchase.");
			}
		}
		else {
			System.out.println("Sprite is out of stock.");
		}
	}
	public void vendDrPepper() {
		if (VendingMachine.machine.dpCount > 0) {
			if (Money.money.userBalance >= Money.money.dpCost) {
				VendingMachine.machine.dpCount--;
				Money.money.userBalance = Money.money.userBalance - Money.money.dpCost;
				Money.money.machineBalance += Money.money.dpCost;
				System.out.println("Your Dr Pepper has been despenced. Enjoy!");
			}
			else {
				System.out.println("You do not have enough money to make this purchase.");
			}
		}
		else {
			System.out.println("Dr Pepper is out of stock.");
		}
	}
	public void vendMonster() {
		if (VendingMachine.machine.monsterCount > 0) {
			if (Money.money.userBalance >= Money.money.monsterCost) {
				VendingMachine.machine.monsterCount--;
				Money.money.userBalance = Money.money.userBalance - Money.money.monsterCost;
				Money.money.machineBalance += Money.money.monsterCost;
				System.out.println("Your Monster has been despenced. Enjoy!");
			}
			else {
				System.out.println("You do not have enough money to make this purchase.");
			}
		}
		else {
			System.out.println("Monster is out of stock.");
		}
	}
}
