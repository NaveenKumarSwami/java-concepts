package com.star.pattern.service;

public class StarPatternService {
//	
//	        * 
//	      * # * 
//	    * # * # * 
//	  * # * # * # * 
//	* # * # * # * # * 
//	  * # * # * # * 
//	    * # * # * 
//	      * # * 
//	        * 
	
	public static void printStarPattern(int n) {

		for (int i = 1; i <= n; i++) {
			boolean star = true;
			int z = 0;
			for (int j = n; j >= 1; j--) {
				if (i < j) {
					System.out.print("  ");
				} else {
				if(star) {
						System.out.print("* ");
				} else {
					System.out.print("# ");
				}
					star  = !star;
					z++;
				}
			}
			for(int j = 1; j < z; j++) {
		    if(star) {
					System.out.print("* ");
			} else {
				System.out.print("# ");
			}
				star  = !star;
			}
			
			System.out.println();
		}
		
		for (int i = n-1; i >= 1 ; i--) {
			boolean star = true;
			int z = 0;
			for (int j = n; j >= 1; j--) {
				if (i < j) {
					System.out.print("  ");
				} else {
				if(star) {
						System.out.print("* ");
				} else {
					System.out.print("# ");
				}
					star  = !star;
					z++;
				}
			}
			for(int j = 1; j < z; j++) {
		    if(star) {
					System.out.print("* ");
			} else {
				System.out.print("# ");
			}
				star  = !star;
			}
			
			System.out.println();
		}

	}

}
