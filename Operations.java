
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;

public class Operations
{
	float damt=0.0f,wamt=0.0f,bal=0.0f;
	String data;
	char fbal[]=new char[20];
	char user[]=new char[20];
	char account[]=new char[20];
	int l=0;
	Scanner scan=new Scanner(System.in);
	
	public void deposit(String userpass)
	{
		
		String oldFileName="userdetails.txt";
		String tmpFileName="out.txt";
		BufferedReader ins=null;
		BufferedWriter outs=null;
		
		try
		{
			ins=new BufferedReader(new FileReader(oldFileName));
			outs=new BufferedWriter(new FileWriter(tmpFileName));
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Asus\\Desktop\\bank\\statement.txt",true));
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
						System.out.println("Kindly enter your amount");
						String dm=scan.next();
						damt=Float.parseFloat(dm);
						
						if(damt<100.0f)
						{
							System.out.println("\nAmount should be greater than or equal to 100");
							System.out.println("---------------------------------------------------------------");
						}
						else
						{
							bal=bal+damt;
							System.out.println("\nTransaction completed successfully");
							System.out.println("\nTotal Balance= "+bal);
							System.out.println("---------------------------------------------------------------");
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
						System.out.println("Wrong input entered");
						System.out.println("--------------------------------------------------");
					}
				}
				outs.write(data);
				outs.newLine();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have enetered wrong info");
			System.out.println("-----------------------------------------------------------");
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
		          String oldFileName="userdetails.txt";
				  String tmpFileName="out.txt";
				  BufferedReader ins=null;
				  BufferedWriter outs=null;
				  try
				  {
					  ins=new BufferedReader(new FileReader(oldFileName));
					  outs=new BufferedWriter(new FileWriter(tmpFileName));
					  BufferedWriter bw=new BufferedWriter(new FileWriter("statement.txt",true));
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
						System.out.println("Kindly enter your withdrawal amount");
						String wt=scan.next();
						wamt=Float.parseFloat(wt);
						float less=bal-wamt;
						if(wamt<100.0f)
						{
							System.out.println("Amount should be greater than 100");
							System.out.println("--------------------------------------------------------");
						}
						else if(less<1000.0f)
						{
							System.out.println("Insufficient balance");
							System.out.println("--------------------------------------------------------------");
						}
						else{
							bal=bal-wamt;
							System.out.println("Transaction completed successfully");
							System.out.println("Total balance is "+bal);
							System.out.println("---------------------------------------------------------------");
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
						System.out.println("Wrong input entered");
						System.out.println("--------------------------------------------------");
					}
				}
				outs.write(data);
				outs.newLine();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("You have enetered wrong info");
			System.out.println("-----------------------------------------------------------");
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
			
			BufferedReader ins=new BufferedReader(new FileReader("userdetails.txt"));
			while((data=ins.readLine())!=null)
			{
				if(data.contains(nmpass))
				{
					l=data.length();
					data.getChars(32,l-1,fbal,0);
					String b=String.valueOf(fbal).trim();
					
					bal=Float.parseFloat(b);
					
					System.out.println("\nTotal balance is "+bal);
					System.out.println("------------------------------------------------------------------");
					break;
				}
			}
			ins.close();
		}
		catch (Exception e){}
	}
}