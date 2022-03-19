import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Money {
	Random r = new Random();
	public static Money money = new Money();
	final double cokeCost = .75;
	final double dietCokeCost = .75;
	final double spriteCost = 1.25;
	final double dpCost = 1.00;
	final double monsterCost = 2.25;
	double machineBalance = r.nextDouble(400);
	double userBalance;
	static final DecimalFormat df = new DecimalFormat("0.00");
	public void addMoney(){
		
		int moneyChoice = 0;
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		while(moneyChoice != 5){
			System.out.println("Menu: ");
			System.out.println("Current Balance: $" + df.format(userBalance));
			System.out.println("1. Insert Dollar. ");
			System.out.println("2. Insert Quarter. ");
			System.out.println("3. Insert Dime. ");
			System.out.println("4. Insert Nickel. ");
			System.out.println("5. Go back to main menu.");
			moneyChoice = input2.nextInt();
			System.out.println("Choice: " + moneyChoice);
			if(moneyChoice == 1) {
				addDollar();
			}
			else if(moneyChoice == 2) {
				addQuarter();
			}
			else if(moneyChoice == 3) {
				addDime();
			}
			else if(moneyChoice == 4) {
				addNickel();
			}
			else if(moneyChoice == 5) {
				break;
			}
		}
    }
	
	public void addDollar(){
		userBalance += 1.00;
	}
	public void addQuarter(){
		userBalance += .25;
	}
	public void addDime(){
		userBalance += .10;
	}
	public void addNickel(){
		userBalance += .05;
	}
	public void getChange() {
		double myBalance = getUserBalance();
		System.out.println("$" + df.format(myBalance) + " has been returned.");
		userBalance = 0;
	}
	public double getMachineBalance() {
		return machineBalance;
	}
	public double getUserBalance() {
		return userBalance;
	}
	public double getCokeCost() {
		return cokeCost;
	}
	public double getDietCokeCost() {
		return dietCokeCost;
	}
	public double getSpriteCost() {
		return spriteCost;
	}
	public double getDrPepperCost() {
		return dpCost;
	}
	public double getMonsterCost() {
		return monsterCost;
	}	
}
