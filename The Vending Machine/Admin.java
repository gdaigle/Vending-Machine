import java.util.Scanner;
public class Admin {
	public void restock(){
		@SuppressWarnings("resource")
		Scanner admin = new Scanner(System.in);
		String username = " ";
		String password = " ";
		System.out.println("Please enter your username");
		username = admin.nextLine();
		System.out.println(username);
		System.out.println("\nPlease enter your password");
		password = admin.nextLine();
		if(username.equals("admin") && password.equals("pass") ){
			VendingMachine.machine.cokeCount = VendingMachine.machine.maxCoke;
			VendingMachine.machine.dietCokeCount = VendingMachine.machine.maxDietCoke;
			VendingMachine.machine.spriteCount = VendingMachine.machine.maxSprite;
			VendingMachine.machine.dpCount = VendingMachine.machine.maxDP;
			VendingMachine.machine.monsterCount = VendingMachine.machine.maxMonster;
			System.out.println("\n$" + Money.df.format(Money.money.machineBalance) + " has been collected from the machine.");
			Money.money.userBalance += Money.money.machineBalance;
			Money.money.machineBalance = 0;
			System.out.println("This Vending Machine has been restocked.\n");	
		}
		else {
			System.out.println("\nThe username or password is incorrect.");
			System.out.println("This option is reserved for authorized personnel only.\n");
		}
	}

}
