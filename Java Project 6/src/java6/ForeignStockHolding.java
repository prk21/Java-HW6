package java6;

public class ForeignStockHolding extends StockHolding {
	
	float conversionRate;
	
	ForeignStockHolding()
	{
		//Calling super class constructor 
		super();
		conversionRate=1;
	}
	ForeignStockHolding(float psc,float csp,int nos,String cn,float cr)
	{
		//Calling super class constructor with arguments
		super(psc,csp,nos,cn);
		conversionRate=cr;
	}
	public float getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(float conversionRate) {
		this.conversionRate = conversionRate;
	}
	
	float valueInDollars()
	{
		
		return(currentSharePrice * numberOfShares* conversionRate);
	}

	float costInDollars()
	{
		return (purchaseSharePrice * numberOfShares * conversionRate);
	}

}
