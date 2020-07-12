import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;



public class User extends Operations
{
	String name, actype, ac, contact, pass, amnt;
	float amount;
	Scanner scanner=new Scanner(System.in);
	char acnumber[]=new char[6];
	char pin[]=new char[6];
	  
	  
	  
	  public void NewUser()
	  {
		  int c=0;
		  String line;
		  String lread;
		  char nm[]=new char[6];
		  System.out.println("\t Enter your details \n");
		  System.out.println("----------------------------------------------------------------------------");
		  try
		  {
			  FileWriter outs=new FileWriter("C:\\Users\\Asus\\Desktop\\bank\\userdetails.txt",true);
			  BufferedWriter bw=new BufferedWriter(new FileWriter("statement.txt",true));
			  
			  do
			  {
				  c=0;
				  System.out.println("Please Enter your full name");
				  name=scanner.nextLine().trim();
				  
				  if(name.length()<1)
				  {
					  System.out.println("Name should be greater than 1 character");
					  c++;
				  }
				  
				  
			  }while (c==1);
			  
			  System.out.println("----------------------------------------------------------------------------");
			  do
			  {
				  c=0;
				  System.out.println("Enter your contact number");
				  contact=scanner.next();
				  System.out.println(contact);
				if (contact.length()!=10)
				{
					c++;
					System.out.println("\n Contact number should be of 10 digits");
				}
				
		  }while(c==1);
		  System.out.println("------------------------------------------------------------------------------------");
		  do{
			  c=0;
			  System.out.println("Enter your initial amount");
			  amnt=scanner.next();
			  
				  amount=Float.parseFloat(amnt);
				  if(amount<1000) 
				  {
					  System.out.println("Initial amount should be greater than 1000");
					  c++;
				  }
			  
		  }while (c==1);
		  System.out.println("-------------------------------------------------------------------------");
		   do{
			   System.out.println("Enter your account type(Savings or Current!");
			   ac=scanner.next();
			   actype=ac.toLowerCase();
			   if(!(actype.equals("savings")||actype.equals("current")))
			   {
				   System.out.println("\n Account type should be savings or current");
			   }
		   }while(!(actype.equals("savings")||actype.equals("current")));
			   
			   if (actype.equals("savings"))
			   {
				   actype="savings";
			   }
			   System.out.println("Enter a 4 digit pin");
			   pass=scanner.next();
			   
			   System.out.println("Account Created successfully");
			   System.out.println("--------------------------------------------------------------------------------");
			   
			   
			   String username;
			   name.getChars(0,3,nm,0);
			   username=String.valueOf(nm).trim();
			   System.out.println("\nUsername :" +username);
			   System.out.println("Pin Number:" +pass);
			   System.out.println("Initial Balance:" +amount);
			   System.out.println("------------------------------------------------------------------------------------");
			   
			   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
			   String date=sdf.format(new Date());
			   
			   bw.write(username+" "+amount+"  initial"+"  "+amount+"  "+date);
			   
			   bw.newLine();
			   bw.close();
			   outs.write(username+"  "+pass+"  "+actype+"  "+contact+"  "+amount);
				outs.append("\r\n");
				outs.close();
			   
			   
			   BufferedWriter wr=new BufferedWriter(new FileWriter("name.txt",true));
			   wr.write(username+"  "+pass+"  "+name);
			   wr.newLine();
			   wr.close();
			   
			    System.out.println("Thank you for Banking");
				 System.out.println("------------------------------------------------------------------------------------------");
				 
				
		   }
		   catch(InputMismatchException e)
		   {
			    System.out.println("You have inserted wrong information!");
				 System.out.println("-----------------------------------------------------------------------------------");
		   }
		   catch(Exception a){}
		  }
	  /***********************************************************************************************************/
	  

}
		  
		  /************************************************************************************/
		 
				  
					  
				  
						  
			  
							
			
		   
						   
						   
				   
			   
			   
			   
				
					  
	
	