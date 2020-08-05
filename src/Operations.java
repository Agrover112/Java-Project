
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane; 
public class Operations
{
    float damt=0.0f,wamt=0.0f,bal=0.0f;
    String data=" ";
    char fbal[]=new char[20];
    char user[]=new char[20];
    char account[]=new char[20];
    int l=0;
    Scanner scan=new Scanner(System.in);
    public void deposit(String userpass)
    {
        String oldFileName="C:\\Users\\hmang\\Desktop\\Chayan\\userdetails.txt";
        String tmpFileName="C:\\Users\\hmang\\Desktop\\Chayan\\out.txt";
        BufferedReader ins=null;
        BufferedWriter outs=null;

        try
        {
            ins=new BufferedReader(new FileReader(oldFileName));
            outs=new BufferedWriter(new FileWriter(tmpFileName));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\hmang\\Desktop\\Chayan\\statement.txt",true));

            while((data=ins.readLine())!=null)
            {
                if(data.contains(userpass))
                {
                    l=data.length();
                    data.getChars(32,l-1,fbal,0);
                    String b=String.valueOf(fbal).trim();
                    bal=Float.parseFloat(b);
                    data.getChars(0,4,user,0);
                    String u=String.valueOf(user).trim();
                    data.getChars(11,18,account,0);
                    String ac=String.valueOf(account).trim();
                    try{
                        //System.out.println("Kindly enter your amount");
                        String dam=JOptionPane.showInputDialog("Kindly enter your amount:");
                        //String dm=scan.next();
                        damt=Float.parseFloat(dam);

                        if(damt<100.0f)
                        {
                            //System.out.println("\nAmount should be greater than or equal to 100");
                            JOptionPane.showMessageDialog(null, "\nAmount should be greater than or equal to 100");
                            //System.out.println("---------------------------------------------------------------");
                        }
                        else
                        {
                            bal=bal+damt;
                            //System.out.println("\nTransaction completed successfully");
                            JOptionPane.showMessageDialog(null, "\nTransaction completed successfully");
                            JOptionPane.showMessageDialog(null, "\nTotal Balance: "+bal);
                            //System.out.println("\nTotal Balance= "+bal);
                            //System.out.println("---------------------------------------------------------------");
                            String c= String.valueOf(bal);
                            data=data.replace(b,c);

                            SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
                            String date=sdf.format(new Date());
                            bw.write(u+"  "+ac+"  "+damt+"  deposit"+"  "+bal+"  "+date);
                            bw.newLine();
                            bw.close();
                        }
                    }
                    catch (NumberFormatException ioe)
                    {
                        JOptionPane.showMessageDialog(null, "\nWrong input entered :(");
                        //System.out.println("Wrong input entered");
                        //System.out.println("--------------------------------------------------");
                    }
                }
                outs.write(data);
                outs.newLine();
            }
        }
        catch(InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null, "\nYou have entered wrong info");
            //System.out.println("You have enetered wrong info");
            //System.out.println("-----------------------------------------------------------");
        }
        catch (Exception e)
        {
            return;
        }
        finally
        {

            try{
                if(ins!=null)
                    ins.close();
            }
            catch (IOException e)
            {}
            try{
                if(outs!=null)
                    outs.close();
            }
            catch (IOException e)
            {}
        }
        File oldFile=new File(oldFileName);
        oldFile.delete();
        File newFile= new File(tmpFileName);
        newFile.renameTo(oldFile);

    }

    /****************************************************************************/

    public void withdraw(String nmpass)
    {
        String oldFileName="C:\\Users\\hmang\\Desktop\\Chayan\\userdetails.txt";
        String tmpFileName="C:\\Users\\hmang\\Desktop\\Chayan\\out.txt";
        BufferedReader ins=null;
        BufferedWriter outs=null;
        try
        {
            ins=new BufferedReader(new FileReader(oldFileName));
            outs=new BufferedWriter(new FileWriter(tmpFileName));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\hmang\\Desktop\\Chayan\\statement.txt",true));
            while((data=ins.readLine())!=null)
            {
                if(data.contains(nmpass))
                {
                    l=data.length();
                    data.getChars(32,l-1,fbal,0);
                    String b=String.valueOf(fbal).trim();

                    bal=Float.parseFloat(b);

                    data.getChars(0,4,user,0);
                    String u=String.valueOf(user).trim();
                    data.getChars(11,18,account,0);
                    String ac=String.valueOf(account).trim();
                    try{
                        String val="";
                        JOptionPane.showMessageDialog(null, "\nAvailable Medicines :\n1.Evista------->Rs1000\n2.Tamoxifen Citrate------->Rs200\n3.5-FU------->Rs300\n4.Exemstane------->Rs400\n5.Docetaxel------->Rs50");
                        //System.out.println("Kindly enter your choice :");
                        String sch=JOptionPane.showInputDialog("Kindly enter your choice:");
                        //String sch=scan.next();
                        char ch=sch.charAt(0);
                        switch(ch)
                        {
                            case '1':val="1000";break;
                            case '2':val="200";break;
                            case '3':val="300";break;
                            case '4':val="400";break;
                            case '5':val="50";break;
                            default: JOptionPane.showMessageDialog(null,"Wrong choice");System.exit(0);//System.out.println("Wrong choice");
                        }
                        wamt=Float.parseFloat(val);
                        float less=bal-wamt;
                        if(less<50.0f)
                        {
                            JOptionPane.showMessageDialog(null,"Insufficient balance");
                            //System.out.println("Insufficient balance");
                            //System.out.println("--------------------------------------------------------------");
                        }
                        else{
                            bal=bal-wamt;
                            //System.out.println("Transaction completed successfully");
                            JOptionPane.showMessageDialog(null,"Transaction completed successfully\nTotal balance is :"+bal+"");
                            //System.out.println("Total balance is "+bal);
                            //System.out.println("---------------------------------------------------------------");
                            String c=String.valueOf(bal);

                            data=data.replace(b,c);
                            SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
                            String date=sdf.format(new Date());
                            bw.write(u+"  "+ac+"  "+wamt+"  withdraw"+"  "+bal+"  "+date);
                            bw.newLine();
                            bw.close();
                        }
                    }
                    catch (NumberFormatException ioe)
                    {
                        JOptionPane.showMessageDialog(null,"Wrong input entered");
                    }
                }
                outs.write(data);
                outs.newLine();
            }
        }
        catch(InputMismatchException e)
        {
            JOptionPane.showMessageDialog(null,"You have entered wrong input");
        }
        catch (Exception e)
        {}
        finally
        {

            try{
                if(ins!=null)
                    ins.close();
            }
            catch (IOException e)
            {}
            try{
                if(outs!=null)
                    outs.close();
            }
            catch (IOException e)
            {}
        }
        File oldFile=new File(oldFileName);
        oldFile.delete();
        File newFile= new File(tmpFileName);
        newFile.renameTo(oldFile);

    }

    /********************************************************************************************/
    public void inquery(String nmpass)
    {
        try{

            BufferedReader ins=new BufferedReader(new FileReader("C:\\Users\\hmang\\Desktop\\Chayan\\userdetails.txt"));
            while((data=ins.readLine())!=null)
            {
                if(data.contains(nmpass))
                {
                    l=data.length();
                    data.getChars(32,l-1,fbal,0);
                    String b=String.valueOf(fbal).trim();
                    bal=Float.parseFloat(b);

                    JOptionPane.showMessageDialog(null,"Balance is :"+bal);
                    break;
                }
            }
            ins.close();
        }
        catch (Exception e){}
    }
}
