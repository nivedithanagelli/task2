package Housecost_Estimator;

public class CostEstimation {
	public float Estimate(String standard,float area) {
		float c=0;
		if(standard.equals("standard"))
		{
			c=1200*area;
		}
		else if(standard.equals("above standard")) {
			c=1500*area;
		}
		else if(standard.equals("high standard")) {
			c=1800*area;
		}
		else
			c=area*2500;
		return c;
	}

}
