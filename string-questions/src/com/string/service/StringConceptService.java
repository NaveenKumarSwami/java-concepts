package com.string.service;

public class StringConceptService {

	public static void main(String[] args) {

		// 1)when we use string literal i.e double quotes("") to create string then it
		// store in string
		// pool (String pool is the pool of strings there store many string in heap
		// memory)
		// 2) when we create string using new operator then it will create new object in
		// heap memory and store value in string pool. it always create new object in heap memory if we use new
		// operator.
		// So, here comes intern() method, it will check string into string pool.

		String s1 = "Naveen"; // id = 17
		String s2 = new String("Naveen"); // id = 18

		// == it checks reference
		System.out.println("s1 == s2 : " + (s1 == s2)); // false => (s1.id == s2.id) -> 17 is not equal to 18
		System.out.println("s1.equals(s2) : " + (s1.equals(s2))); // true => it checks value at references

		// so you check that above s1 == s2 return false. it is because s1 is in string
		// pool and s2 is in heap memory
		// to move s2 into string pool we use intern method. after that they both refer
		// to same reference

		String sIntern = s2.intern();// id = 17;
		System.out.println("s1 == sIntern " + (s1 == sIntern)); // true => (s1.id == s2.id) -> 17 is equal to 18 both
																// have same reference

		System.out.println("--------------------------------------------------------------------");
    
		String name1 = "Naveen";
		String name2 = "NaVeEn";
		
		System.out.println(name1 == name2);
	}
}
