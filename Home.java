import java.util.*;


public class Home extends User
{
	public static void main (String[] args){
		try{
			User U=new User();
			int choice;
			char a='n';
			Scanner scan=new Scanner(System.in);
			System.out.println("-----------------------------------------");
			System.out.println("			WELCOME        			     ");
			System.out.println("	    TO THE BANK PROGRAM				 ");
			System.out.println("-----------------------------------------");
			do
			{
				a='n';
				System.out.println("Please enter your choice");
				System.out.println("1. Create a new account");
				System.out.println("2. Existing account");
				System.out.println("3.Exit");
				choice=scan.nextInt();
				System.out.println("------------------------------------------------------------------------");
				
				if (choice>3||choice<1)
				{
					System.out.println("\n OOPS! You have entered wrong information");
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Do you wish to continue? [Y/N]");
					a=scan.next().charAt(0);
					System.out.println("-----------------------------------------------------------------------");
				}
			}while(a=='Y'||a=='y');
			
			switch(choice)
			{
				case 1: U.NewUser();
						break;
				case 2: U.ExistingUser();
						break;
				case 3: System.out.println("THANK YOU FOR VISITING! WE WISH TO SEE YOU AGAIN!");
						break;
				default: System.out.println("Invalid choice");
			}
		}
		catch (InputMismatchException a)
		{
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("                         ERROR! WRONG INPUT                                ");
			System.out.println("---------------------------------------------------------------------------");
		}
		catch(Exception e){}
	}
}
						
				