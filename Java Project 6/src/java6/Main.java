package java6;

public class Main {
	public static void main(String[] args)
	{
		//Making an array of instances of the class StockHolding
	 StockHolding NSMutablearray[]= new StockHolding[10];
	 
	 //Assigning values manually
	 NSMutablearray[0]=new StockHolding();
	 NSMutablearray[0].setCompanyName("Dell");
	 NSMutablearray[0].setCurrentSharePrice(4.50f); //to convert double to float attach an f at the end!! 
	 NSMutablearray[0].setNumberOfShares(40);
	 NSMutablearray[0].setPurchaseSharePrice(2.30f);
	 
	 NSMutablearray[1]=new StockHolding();
	 NSMutablearray[1].setCompanyName("Acer");
	 NSMutablearray[1].setCurrentSharePrice(10.56f); //to convert double to float attach an f at the end!! 
	 NSMutablearray[1].setNumberOfShares(90);
	 NSMutablearray[1].setPurchaseSharePrice(12.19f);
	 
	 NSMutablearray[2]=new StockHolding();
	 NSMutablearray[2].setCompanyName("Lenovo");
	 NSMutablearray[2].setCurrentSharePrice(49.51f); //to convert double to float attach an f at the end!! 
	 NSMutablearray[2].setNumberOfShares(210);
	 NSMutablearray[2].setPurchaseSharePrice(45.10f);

	 System.out.println("Checkpoint 1: ");
	 int n=3;//for 3 instances
	 //Implementing  Bubble Sort
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n-1;j++)
		 {
			 String a=NSMutablearray[j].getCompanyName();
			 String b=NSMutablearray[j+1].getCompanyName();
			 if(a.compareTo(b)>0)
			 {
				 //swap
				 StockHolding temp=new StockHolding();
				 temp=NSMutablearray[j];
				 NSMutablearray[j]=NSMutablearray[j+1];
				 NSMutablearray[j+1]=temp;
			 }
		 }
	 }
	 //Displaying results according to ascending order of names
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("Company name: "+NSMutablearray[i].getCompanyName());
		 System.out.println("Purchase Share Price: "+NSMutablearray[i].getPurchaseSharePrice());
		 System.out.println("Number of Shares: "+NSMutablearray[i].getNumberOfShares());
		 System.out.println("Current Share Price: "+NSMutablearray[i].getCurrentSharePrice() );
		 System.out.println();
	 }
	 
	

	 //Checkpoint 2
	 
	 //Extended Classes to be used
	 System.out.println("Checkpoint 2: ");

	 //Assigning values using Constructors
	 NSMutablearray[3]=new ForeignStockHolding(25.20f,89.51f,580,"Jaypee",1.2f);
	 
	 NSMutablearray[4]=new ForeignStockHolding(85.20f,23.54f,158,"Hero",2.01f);
		 
	 
	 
	  n=5;//for 5 instances
	 //Implementing  Bubble Sort
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n-1;j++)
		 {
			 String a=NSMutablearray[j].getCompanyName();
			 String b=NSMutablearray[j+1].getCompanyName();
			 if(a.compareTo(b)>0)
			 {
				 //swap
				 StockHolding temp=new StockHolding();
				 temp=NSMutablearray[j];
				 NSMutablearray[j]=NSMutablearray[j+1];
				 NSMutablearray[j+1]=temp;
			 }
		 }
	 }
	 //Displaying results according to ascending order of names
	 for(int i=0;i<n;i++)
	 {
		 System.out.println("Company name: "+NSMutablearray[i].getCompanyName());
		 System.out.println("Purchase Share Price: "+NSMutablearray[i].getPurchaseSharePrice());
		 System.out.println("Number of Shares: "+NSMutablearray[i].getNumberOfShares());
		 System.out.println("Current Share Price: "+NSMutablearray[i].getCurrentSharePrice() );
		 System.out.println();
	 }
	 
	}
	
	 

	 


}
