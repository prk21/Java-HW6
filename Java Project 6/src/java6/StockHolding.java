package java6;

public class StockHolding {
 float purchaseSharePrice=0;
float currentSharePrice=0;
 int numberOfShares=0 ;
 String companyName="";
StockHolding()
{
	//Default constructor
 purchaseSharePrice=0;
 currentSharePrice=0;
 numberOfShares=0 ;
 companyName="";
	
}
StockHolding(float psc,float csp,int nos,String cn)
{
	//Parameterized Constructor
 purchaseSharePrice=psc;
 currentSharePrice=csp;
 numberOfShares=nos ;
 companyName=cn;
	
}
public float getPurchaseSharePrice() {
	return purchaseSharePrice;
}

public void setPurchaseSharePrice(float purchaseSharePrice) {
	this.purchaseSharePrice = purchaseSharePrice;
}

public float getCurrentSharePrice() {
	return currentSharePrice;
}

public void setCurrentSharePrice(float currentSharePrice) {
	this.currentSharePrice = currentSharePrice;
}

public int getNumberOfShares() {
	return numberOfShares;
}

public void setNumberOfShares(int numberOfShares) {
	this.numberOfShares = numberOfShares;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

float valueInDollars()
{
	return(currentSharePrice * numberOfShares);
}

float costInDollars()
{
	return (purchaseSharePrice * numberOfShares);
}

}
