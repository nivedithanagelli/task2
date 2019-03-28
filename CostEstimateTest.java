package Housecost_Estimator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimateTest {
	CostEstimation e=new CostEstimation();

	@Test
	public void estimate_test() {
		assertEquals(3600,e.Estimate("high standard",2));
		assertEquals(4800,e.Estimate("standard",4));
	}

}
