package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Employee, Integer> treeMap = new TreeMap<>();
//		Map<Employee, Integer> treeMap = new HashMap<>();

		String[] employeeName = { "Naveen", "Hemant", "Sachin", "Kunal", "Priya", "Anajan" };

		for (int i = 1; i < employeeName.length; i++) {
			Employee emp = new Employee();
			emp.setName(employeeName[i - 1]);
			int index = new Random().nextInt(5);
			System.out.println(index);
			emp.setId(index);
			treeMap.put(emp, i);
		}

		treeMap.forEach((k, v) -> {
			System.out.println(k.getId() + " " + k.getName()  + " " + v);
		});

	}

}

class Employee implements Comparable<Employee> {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id - o.id != 0) {
			return this.getId() - o.getId();
		} else {
			return this.getName().compareTo(o.getName());
		}
//		return 0;
	}

}