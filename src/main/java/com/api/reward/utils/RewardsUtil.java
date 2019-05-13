package com.api.reward.utils;

import java.math.BigDecimal;

public class RewardsUtil{

	public static Integer calcRewards(Double amt) {
		int rewardPoint = 0;
		BigDecimal b1, b2, val;
		b1 = new BigDecimal(50);
		b2 = new BigDecimal(100);
		val = new BigDecimal(amt);
		rewardPoint = (int) ((val.compareTo(b2) == 1) ? (int) 2 * (amt - 100) + (1 * 50)
				: (val.compareTo(b1) == 1) ? (1 * (amt - 50)) : 0);
		return rewardPoint;
	}
	
}
