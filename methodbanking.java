/* This java doc is entirely based on Methods and their calling.

It is only for learning purpose

It depicts how several methods are called inside a class using objects


@Author: Enrique Miguel   */  


import java.util.*;       /* The packages are imported here. We are using all packages denoted with a (*) */
class abc    /* Our main class name goes here */
{
	int newamount;
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);    /* here we are creating an object for taking user input */
		System.out.println("Welcome to JAVA Banking. The most wasiest banking of the World!! \n \n");
        abc obj1 = new abc();
        obj1.intro();

		        choice = sc.nextInt();

        if( choice == 1) {
        	System.out.println("\t \t Welcome to new account creation System !! \n \n");
            obj1.newacc();
         }

        else if( choice == 2) {
        	System.out.println("\t \t Welcome to Deposition Chamber !!! \n \n");
            obj1.depositbank();

        }

        else if( choice == 3) {
        	System.out.println("\t \t Welcome to Withdrawl Chamber !! \n \n");
            obj1.withdrawbank();

        }

        else if( choice == 4) {
        	System.out.println("\t \t Thankyou for your visit at JAVA Banking. Hava a nice day!!");
           
        }

        else {
        	System.out.println("\t \t ERROR: Seems like you inputted a wrong choice \n \n");
        	obj1.intro();
        }

        
	}
    void someerror()
    {
        System.out.println("\t ERROR: Something was not properly verified. Ending the process now !!!! \n \n");
    }

    void success()
    {
        System.out.println("\t SUCCESS: Process successfully ended. Ending setup now \n \n");
    }

	void intro()
        {
           System.out.println("What will you like to do !! \n \n Press 1 for a new account \n \n Press 2 for depositing in current account \n \n Press 3 for withdrawl from current account \n \n Press 4 to EXIT!! \n \n");
        }

     void newacc()
     {
     	String name;
     	int age;
     	String resaddress;
        
     	Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

     	System.out.println("Please fill out the following details correctly. If you feel something went wrong Press 4 to EXIT account creation!! \n \n");
        System.out.println("ENTER YOU FULL NAME");
        name = sc1.nextLine();
        System.out.println("ENTER YOUR AGE");
        age = sc1.nextInt();

        System.out.println("ENTER YOUR FULL ADDRESS");
        resaddress = sc2.nextLine();

        if(age >= 18) {
            System.out.println("Age verification completed!!");
             System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT!!");
        newamount = sc1.nextInt();
        System.out.println("\t  Sucess \n \n");
        
        System.out.println("Registration completed. Congratulations on being a part of JAVA Banking \n Your information related to your account are below - \n \n");
        System.out.println("Username: " +name);
        System.out.println("Age: " +age);
        System.out.println("Residential Address: " +resaddress);
        System.out.println("Base amount: " +newamount);

        }
        else {
            System.out.println("You are not old enough to make an account!!");
            someerror();

        }
       
    }

    void depositbank()
    {
        int basemoney = 2000;
        Scanner choiceobj = new Scanner(System.in);
        int choice2; int accno2; String namedeposition; int amtdeposit;
        Scanner takename = new Scanner(System.in);
        System.out.println("If you are already a member Press 1 else Press 2 \n \n");
        choice2 = choiceobj.nextInt();

        if(choice2 == 1) {
            System.out.println("Enter your account number");
            accno2 = choiceobj.nextInt();


            System.out.println("Enter your name");
            namedeposition = takename.nextLine();

            System.out.println("Enter the amount to be deposited");
            amtdeposit = choiceobj.nextInt();
            System.out.println("\n \n \n \n"); /* This is just for some spacing */

            System.out.println("Completing your money deposition. . . .\n \n");
            System.out.println("Deposition succesful. You deposited Rs." +amtdeposit+ " Your balance: " +(basemoney + amtdeposit)+ "\n \n");
            success();
            
         }

         else if(choice2 == 2) {
            newacc();
         }

         else {
            System.out.println("Please Enter a valid choice. Try again later");
            someerror();
         }

    }

    void withdrawbank()
    {
                int basemoney = 2000;

         Scanner choiceobj = new Scanner(System.in);
        int choice2; int accno2; String namedeposition; int amtdeposit;
        Scanner takename = new Scanner(System.in);
        System.out.println("If you are already a member Press 1 else Press 2 \n \n");
        choice2 = choiceobj.nextInt();

        if(choice2 == 1) {
            System.out.println("Enter your account number");
            accno2 = choiceobj.nextInt();


            System.out.println("Enter your name");
            namedeposition = takename.nextLine();

            System.out.println("Enter the amount to be withdrawn");
            amtdeposit = choiceobj.nextInt();
            System.out.println("\n \n \n \n"); /* This is just for some spacing */

            System.out.println("Completing your money transaction. . . .\n \n");
            System.out.println("Withdrawl succesful. You have withdrawn Rs." +amtdeposit+ " Left Balance: " +(basemoney - amtdeposit)+ "\n \n");
            success();
            
         }

         else if(choice2 == 2) {
            newacc();
         }

         else {
            System.out.println("Please Enter a valid choice. Try again later");
            someerror();
         }


    }
}
