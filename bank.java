import java.util.*;
class Bank
{
	public static void main(String[] args)
	{
		int choice;
		Scanner o = new Scanner(System.in);
		System.out.println("********************************************************************************");
		System.out.println("                           Welcome to the JAVA banking facility");
		System.out.println("********************************************************************************");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                        Select one of our services--------");
		System.out.println(" ");
		System.out.println("        1)     Deposition ( Desposite money into your account )");
		System.out.println(" ");
		System.out.println("        2)     Withdrawl ( Withdraw money from your account )");
		System.out.println(" ");
		System.out.println("        3)     Balance Check ( Check current balance of your account )");
		System.out.println(" ");
		System.out.println("                 *********SELECT OUT OF 1 , 2 OR 3******************");
        choice = o.nextInt();
        Bank obj1 = new Bank();
        if (choice == 1) {
        	obj1.deposit();
        }

        else if(choice == 2) {
        	obj1.withdraw();
        }

        else if(choice == 3) {
        	obj1.balcheck();
        }

        else {
        	System.out.println("You entered a wrong/invalid choice....");
        }

}

	void deposit()
	{
		int ac_no , dep_value , with_value, cur_bal = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.println("          Enter your account number");
		System.out.println(" ");
		System.out.println(" ");
		ac_no = sc.nextInt();

		System.out.println("          Logging into account number: " +ac_no);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("*******************************************************************************");
		System.out.println("              You Selected the depositing Services of JAVA Bank");
		System.out.println("*******************************************************************************");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("             Enter the amount you want to deposit in your Bank ----");
		System.out.println(" ");
		dep_value = sc.nextInt();
		System.out.println("           Your request for the deposition of amount " + dep_value+ " is being processed....");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("       Deposition succesful. You succesfully deposited Rs." + dep_value + " in your account. Total balance in your account: " +(cur_bal + dep_value));
	}

	void withdraw()
	{
		int ac_no , dep_value , with_value, cur_bal = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number....");
		System.out.println(" ");
		System.out.println(" ");
		ac_no = sc.nextInt();
		System.out.println("          Logging into account number: " +ac_no);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("*****************************************************************************************");
		System.out.println("                   You Selected the Withdrawl Services of JAVA Bank");
		System.out.println("*****************************************************************************************");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("          Enter the amount you want to withdraw from your Bank ");
		System.out.println(" ");
		with_value = sc.nextInt();
		System.out.println("          Your request for the withdrawl of amount " + with_value+ " is being processed....");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("          Withdrawl succesful. You have succesfully withdrawn Rs." + with_value + " from your account. Remaining balance in your account: " +(cur_bal - with_value));
	}

	void balcheck()
	{
		int ac_no , dep_value , with_value, cur_bal = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.println("          Enter your account number ");
		System.out.println(" ");
		System.out.println(" ");
		ac_no = sc.nextInt();
		System.out.println("          Logging into account number: " +ac_no);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("*******************************************************************************************");
		System.out.println("                         Balance Check services of JAVA Bank");
		System.out.println("*******************************************************************************************");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("          The current balance of your account is " +cur_bal);

	}
}
