import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane; 
import javax.swing.*;
import java.awt.*;

public class User extends Operations
{
    String name=" ", actype, ac, contact, pass, amnt;
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
        //System.out.println("\t Enter your details \n");
        //System.out.println("----------------------------------------------------------------------------");
        try
        {
            FileWriter outs=new FileWriter("C:\\Users\\hmang\\Desktop\\Chayan\\userdetails.txt",true);
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\hmang\\Desktop\\Chayan\\statement.txt",true));

            do
            {
                c=0;
                name= JOptionPane.showInputDialog("Enter name:");
                name=name.trim();

                //System.out.println("Please Enter your full name");
                //name=scanner.nextLine().trim();

                if(name.length()<1)
                {
                    //System.out.println("Name should be greater than 1 character");
                    JOptionPane.showMessageDialog(null, "Name should be greater than 1 character");
                    c++;
                }

            }while (c==1);
            // System.out.println("----------------------------------------------------------------------------");
            do
            {
                c=0;
                contact= JOptionPane.showInputDialog("Enter contact number:");
                //System.out.println("Enter your contact number");
                //contact=scanner.next();
                //System.out.println(contact);
                if (contact.length()!=10)
                {
                    c++;
                    //System.out.println("\n Contact number should be of 10 digits");
                    JOptionPane.showMessageDialog(null, "Contact number should be of 10 digits");
                }

            }while(c==1);
            //System.out.println("------------------------------------------------------------------------------------");
            do{
                c=0;
                amnt=JOptionPane.showInputDialog("Enter your intial amount:");
                //System.out.println("Enter your initial amount");
                //amnt=scanner.next();

                amount=Float.parseFloat(amnt);
                if(amount<1000) 
                {
                    JOptionPane.showMessageDialog(null, "Contact number should be of 10 digits");
                    //System.out.println("Initial amount should be greater than 1000");
                    c++;
                }

            }while (c==1);
            //System.out.println("-------------------------------------------------------------------------");
            do{
                //System.out.println("Enter your account type(Savings or Current!");
                ac=JOptionPane.showInputDialog("Enter your account type:");
                //ac=scanner.next();
                actype=ac.toLowerCase();
                if(!(actype.equals("savings")||actype.equals("current")))
                {
                    JOptionPane.showMessageDialog(null, "Account type should be savings or current");
                    //System.out.println("\n Account type should be savings or current");
                }
            }while(!(actype.equals("savings")||actype.equals("current")));

            if (actype.equals("savings"))
            {
                actype="savings";
            }
            //System.out.println("Enter a 4 digit pin");
            pass=JOptionPane.showInputDialog("Enter your 4 digi pin:");
            //pass=scanner.next();
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
            //System.out.println("Account Created successfully");
            //System.out.println("--------------------------------------------------------------------------------");

            String username;
            name.getChars(0,3,nm,0);
            username=String.valueOf(nm).trim();
            JOptionPane.showMessageDialog(null, "\nUsername :" +username+"\nPin Number:" +pass+"\nInitial Balance:" +amount);
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
            /*System.out.println("\nUsername :" +username);
            System.out.println("Pin Number:" +pass);
            System.out.println("Initial Balance:" +amount);
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Thank you for Banking");
            System.out.println("------------------------------------------------------------------------------------------");

             */ 
            JOptionPane.showMessageDialog(null, "\n Thank you for visiting us");
        }
        catch(InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null, "You have entered wrong information");
            //System.out.println("You have inserted wrong information!");
            //System.out.println("-----------------------------------------------------------------------------------");
        }
        catch(Exception a){}
    }
    /***********************************************************************************************************/

    char account[]=new char[6];
    public void ExistingUser()
    {
        //Scanner scan=new Scanner(System.in);
        int count=0;
        String name=null, pass=null, amt=null, cont=null, actype=null;
        //System.out.println("Enter User Name: ");
        //String uname=scan.next();
        String uname= JOptionPane.showInputDialog("Enter your name:");
        //System.out.println("Enter your pin number: ");
        //String upass=scan.next();

        String upass= JOptionPane.showInputDialog("Enter your pin number :");

        String userpass=uname+"  "+upass;
        char cnt;
        int choice;
        String line, line2, fullname;
        char full[]=new char[100];

        try 
        {
            BufferedReader ins=new BufferedReader(new FileReader("C:\\Users\\hmang\\Desktop\\Chayan\\userdetails.txt"));
            while((line=ins.readLine())!=null)
            {
                if(line.contains(userpass))
                {
                    //System.out.println("Logged in successfully");
                    JOptionPane.showMessageDialog(null, "Logged in Successfully");
                    //System.out.println("---------------------------------------------------------------------------------");
                    BufferedReader nmf=new BufferedReader(new FileReader("C:\\Users\\hmang\\Desktop\\Chayan\\name.txt"));

                    while((line2=nmf.readLine())!=null)
                    {
                        if(line2.contains(userpass))
                        {
                            line2.getChars(11,line2.length(),full,0);
                            fullname=String.valueOf(full).trim();
                            //System.out.println("\n Welcome Dear, "+fullname);
                            JOptionPane.showMessageDialog(null, "Welcome Dear,"+fullname);
                        }
                    }
                    nmf.close();

                    do{
                        ///System.out.println("--------------------------------------------------------");
                        //System.out.println("\nPlease enter your choice:");
                        //JOptionPane.showMessageDialog(null, "\n 1.Deposit \n 2.Withdraw \n 3.Balance Enquiry \n");
                        String num= JOptionPane.showInputDialog("\n1.Deposit \n2.Buy Medicines \n3.Balance Enquiry \nEnter your choice:");
                        choice=Integer.parseInt(num);

                        //System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.Balance Enquiry \n");
                        //choice=scan.nextInt();
                        //System.out.println("----------------------------------------------------------");

                        switch(choice)
                        {
                            case 1: ins.close();
                            deposit(userpass);
                            break;
                            case 2: ins.close();
                            withdraw(userpass);
                            break;
                            case 3: ins.close();
                            inquery(userpass);
                            break;
                            default:  System.out.println("Not a valid option selected");
                            break;
                        } String ch= JOptionPane.showInputDialog("Do you want to continue[Y/n]? :");
                        cnt=ch.charAt(0);

                    }while(cnt=='y'||cnt=='Y');
                    if(cnt!='y'||cnt!='Y')
                    {
                        //System.out.println("---------------------------------------------------------------------");
                        //System.out.println("                      Thaank you for banking                          ");
                        //System.out.println("----------------------------------------------------------------------");
                        JOptionPane.showMessageDialog(null, "Thank you for visiting us");
                    }
                    count=1;
                    break;
                }
            }
            if (count==0)
            {
                JOptionPane.showMessageDialog(null, "You have entered wrong username and password  :( ");
                //System.out.println("You have enetered wrong username and password");
                //System.out.println("-------------------------------------------------------------------");
            }
            ins.close();

        }catch (InputMismatchException e)
        {
            //System.out.println("You have entered wrong input");
            //System.out.println("-----------------------------------------------------------");
            JOptionPane.showMessageDialog(null, "You have entered wrong input :( ");
        }
        catch (Exception e)
        {}
    }
}

              
                           
               
    
	
