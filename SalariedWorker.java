
public class SalariedWorker extends Worker
{
	
	public SalariedWorker(String aName, Double aRate) 
	{
		super(aName, aRate);
		rate = aRate;
	}

	public double computePay(int hours)
	{
		
		double pay = rate * 40;
		return pay;
		
	}
	
	private double rate;
	
}
