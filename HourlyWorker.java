
public class HourlyWorker extends Worker
{
	
	public HourlyWorker(String aName, Double aRate) 
	{
		super(aName, aRate);
		
		rate = aRate;
	}

	public double computePay(int hours)
	{
		
		double pay = 0;
		
		if(hours<=40)
		{
			
			pay = hours * rate;
			
		}
		
		if(hours>40)
		{
			
			pay = (40 * rate) + ((hours-40) * rate)/2;
			
		}
		
		return pay;
		
	}
	
	private double rate;
	
}
