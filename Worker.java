
public abstract class Worker 
{
	
	public Worker(String aName, double aRate)
	{
		name = aName;
		
		rate = aRate;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Double getRate()
	{
		return rate;
	}
	
	public abstract double computePay(int hours);
	
	private String name;
	
	private Double rate;
}
