package com.oracle;

import java.util.Scanner;

public class StringQues {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	}
	
	public static String zigZag(String str, int k) {
      String zigzag = "";
      
      // 01234567 
      // abcdefgh and k = 3
      
//      a   e
//      b d f h
//      c   g
//      
//      if k = 4
////    
//     if k = 3 then aebdfhcg
//     if k = 4 then agbfhced
      
//      a     g
//      b   f h
//      c e
//      d
//      
      
      String[] strPart = new String[k];
      
      int val = 0;
      boolean flag = false;
      for(int i = 1; i<= str.length(); i++) {
    	  if(val % k < k && flag) {
    		  val--;
    	  } else if(!flag) {
    		  
    	  }
    	  strPart[val] += str.charAt(i -1);
    	  val++;
      }
      
      
      return zigzag;
	}
}

