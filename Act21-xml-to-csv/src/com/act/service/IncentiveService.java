package com.act.service;

import com.act.pojo.Incentive;

public class IncentiveService {

	public Double getIncentiveByLocation(String location) {

		switch (location) {
		case "Delhi":
		case "Punjab":
		case "Maharashtra":
			return 10.0;
		case "Haryana":
		case "Gujarat":
			return 5.0;
		default:
			return 0.0;
		}
	}
}
