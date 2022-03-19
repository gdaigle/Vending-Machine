import java.util.Scanner;

public class Menu {
	public void menu() {
		Vend vend = new Vend();
		Admin admin = new Admin();
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);  
	    System.out.println("Welcome to the best Vending Machine Ever!\n"); 
		int choice = 0;
		while (choice != 9) {
			System.out.print("Current Balance: ");
			System.out.println("$" + Money.df.format(Money.money.getUserBalance()));
			System.out.println("Menu:\n");
			System.out.println("1. Add Money");
			System.out.println("2. Coke:----------$" + Money.df.format(Money.money.getCokeCost()));
		    System.out.println("3. Diet Coke:-----$" + Money.df.format(Money.money.getDietCokeCost()));
	 	    System.out.println("4. Sprite:--------$" + Money.df.format(Money.money.getSpriteCost()));
		    System.out.println("5. Dr Pepper:-----$" + Money.df.format(Money.money.getDrPepperCost()));
		    System.out.println("6. Monster:-------$" + Money.df.format(Money.money.getMonsterCost()));
		    System.out.println("7. Get Change back ");
		    System.out.println("8. Restock Machine ");
		    System.out.println("9. Exit Machine");
		   
			choice = input.nextInt();
				
			System.out.println("");
			switch (choice){
			//add money
			case 1:
				Money.money.addMoney();
				break;
			//Coke
			case 2:
				vend.vendCoke();
				break;
			//Diet Coke
			case 3: 
				vend.vendDietCoke();
				break;
			//Sprite
			case 4: 
				vend.vendSprite();
				break;
			//Dr Pepper
			case 5: 
				vend.vendDrPepper();
				break;
			//Monster
			case 6: 
				vend.vendMonster();
				break;
			case 7:
				Money.money.getChange();
				break;
			case 8: 
				admin.restock();
				break;
			case 9:
				break;
			default: 
			System.out.println("Incorrect Input. Enter a number 1-9.");
			System.out.println("");
			break;
			}
		}
	}
}
