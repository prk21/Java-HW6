package java6;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args)
	{

			System.out.println("Enter number of Stocks (Constraint:8)");
			
          // Using scanner class object to take input from user
			Scanner input=new Scanner(System.in);
			
			//Assignng value to the required variable
			int num=input.nextInt();
			
			//creating an array as done previously
			StockHolding arr[]=new StockHolding[num];
			
			int type;
			//Running loop so as to take info. of all stocks
			for(int i=0;i<num;i++)
			{
			System.out.println("Enter type of stock");
			System.out.println("0- StockHolding ");
			System.out.println("1- ForeignStockHolding ");
			
			 type=input.nextInt();
			 //Function to create objects
			 arr[i]=objectType(type);
			}
			
			// Displaying lowest value .
				
			System.out.println("Displaying Stock with lowest value(Company name): \n"+lowestValueStock(arr,num));
			System.out.println("*****************************************************************************************************************");
					
			
		// Displaying highest value .
		
			System.out.println("Highest Value Stock : \n"+highestValueStock(arr,num));
		    System.out.println("*****************************************************************************************************************");
		
		//Displaying Most Profitable Stock
		
		     System.out.println("Most Profitable Stock :\n"+ mostProfitableStock(arr,num));
		     System.out.println("*****************************************************************************************************************");
		
		//Displaying Least Profitable Stock
		
		    System.out.println("Least  Profitable Stock :\n"+ leastProfitableStock(arr,num));
		    System.out.println("*****************************************************************************************************************");
		
		// Sorting array on basis of company name
		
		sortCompany(arr,num);
		System.out.println("Sorting Stocks According to Company Names :\n");
		
		for(int i=0;i<num;i++) {
			System.out.println("Stock "+(i+1)+"\n"+arr[i].getCompanyName());
		}
		System.out.println("*****************************************************************************************************************");
		
		// Sorting on basis of value;
		
		sortValue(arr,num);
		System.out.println("Sorting Stocks According to Values :\n");
		
		for(int i=0;i<num;i++) {
			System.out.println("Stock "+(i+1)+"\n"+arr[i]);
		}
		System.out.println("*****************************************************************************************************************");

		input.close();
	}
	public static StockHolding objectType(int type)
	{
		float psc;float csp;int nos;String cn;
		System.out.println("Enter the following , Purchase Share Price , Number of Shares ,Current Share Price, Company name ");
		Scanner input2=new Scanner(System.in);
		psc=input2.nextFloat();
		csp=input2.nextFloat();
		nos=input2.nextInt();
		cn=input2.next();
		if(type==0)
		{
			StockHolding obj=new StockHolding(psc, csp, nos, cn);
			input2.close();
			return obj;
		}
		else
		{
			System.out.println("Enter Conversion rate");
			float cr=input2.nextFloat();
			ForeignStockHolding obj2=new ForeignStockHolding(psc, csp, nos, cn, cr);
			input2.close();
			return obj2;
			
		}
		
	}
	public static String lowestValueStock(StockHolding arr[],int num)
	{
		StockHolding temp=arr[0];
		for(int i=1;i<num;i++)
		{float a=temp.valueInDollars();
			float b=arr[i].valueInDollars();
		       if(b<a)
		       {
		    	   temp=arr[i];
		       }
		    	   
		}
		String str="Company name: "+temp.getCompanyName()+" Purchase Share Price"+temp.getPurchaseSharePrice() +" Number of Shares "+temp.getNumberOfShares()+" Current Share Price "+temp.getCurrentSharePrice();
		return str;		
	}
	public static String highestValueStock(StockHolding arr[],int num)
	{
		StockHolding temp=arr[0];
		for(int i=1;i<num;i++)
		{float a=temp.valueInDollars();
			float b=arr[i].valueInDollars();
		       if(b>a)
		       {
		    	   temp=arr[i];
		       }
		    	   
		}
		String str="Company name: "+temp.getCompanyName()+" Purchase Share Price"+temp.getPurchaseSharePrice() +" Number of Shares "+temp.getNumberOfShares()+" Current Share Price "+temp.getCurrentSharePrice();
		return str;		
	}
	public static String mostProfitableStock(StockHolding arr[],int num)
	{
		StockHolding temp=arr[0];
		for(int i=1;i<num;i++)
		{float a=temp.valueInDollars()-temp.costInDollars();
			float b=arr[i].valueInDollars()-arr[i].costInDollars();
		       if(b>a)
		       {
		    	   temp=arr[i];
		       }
		    	   
		}
		String str="Company name: "+temp.getCompanyName()+" Purchase Share Price: "+temp.getPurchaseSharePrice() +" Number of Shares: "+temp.getNumberOfShares()+" Current Share Price: "+temp.getCurrentSharePrice();
		return str;		
	}
	public static String leastProfitableStock(StockHolding arr[],int num)
	{
		StockHolding temp=arr[0];
		for(int i=1;i<num;i++)
		{
			float a=temp.valueInDollars()-temp.costInDollars();
			float b=arr[i].valueInDollars()-arr[i].costInDollars();
		
			if(b<a)
		       {
		    	   temp=arr[i];
		       }
		    	   
		}
		String str="Company name: "+temp.getCompanyName()+" Purchase Share Price: "+temp.getPurchaseSharePrice() +" Number of Shares: "+temp.getNumberOfShares()+" Current Share Price: "+temp.getCurrentSharePrice();
		return str;		
	}
	
	public static void sortCompany(StockHolding arr[],int n)
	{
		for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-1;j++)
			 {
				 String a=arr[j].getCompanyName();
				 String b=arr[j+1].getCompanyName();
				 if(a.compareTo(b)>0)
				 {
					 //swap
					 StockHolding temp=new StockHolding();
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
	}
	public static void sortValue(StockHolding arr[],int n)
	{
		for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n-1;j++)
			 {
				 float a=arr[j].valueInDollars();
				 float b=arr[j+1].valueInDollars();
				 if(a>b)
				 {
					 //swap
					 StockHolding temp=new StockHolding();
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
	}
	
}
