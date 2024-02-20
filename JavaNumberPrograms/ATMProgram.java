// ATM Program
// You Can Deposit,Withdrawl And Check Balance
import java.util.Scanner;
class ATMProgram{
		public static int amount = 10_000;
		public static void Deposit(){
			Scanner sc = new Scanner(System.in);
			System.out.println("*** DEPOSIT ***");
			System.out.print("Enter Amount : ");
			int amt = sc.nextInt();
			ATMProgram.amount=ATMProgram.amount+amt;
			System.out.println("Deposit Success!");
		}
		public static void Withdrawl(){
			Scanner sc = new Scanner(System.in);
			System.out.println("*** WITHDRAWL ***");
			System.out.print("Enter Amount : ");
			int amt = sc.nextInt();
			if(amt<ATMProgram.amount){
				ATMProgram.amount=ATMProgram.amount-amt;
				System.out.println("Withdrawl Sucess!");
			}else
				System.out.println("Insufficient Balance");
		}
		public static void CheckBal(){
			System.out.println("*** CHECK BALANCE ***");
			System.out.println("AVL. BALANCE : "+ATMProgram.amount);
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("\n****************");
			System.out.println("1. To Deposit");
			System.out.println("2. To Withdrawl");
			System.out.println("3. To Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter Choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1: ATMProgram.Deposit(); break;
				case 2: ATMProgram.Withdrawl(); break;
				case 3: ATMProgram.CheckBal(); break;
				case 4: 
				System.out.println("Bye-Bye");
				System.exit(0);
				default:
				System.out.println("Wrong Choice!\n");
			}
		}
	}
}