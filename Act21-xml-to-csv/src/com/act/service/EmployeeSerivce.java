package com.act.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.act.pojo.Employee;
import com.act.pojo.Fraud;
import com.act.pojo.TransType;
import com.act.pojo.Transaction;

public class EmployeeSerivce {

	public List<Map<String, String>> getEmployeeOutput(List<Employee> employeeList, List<Transaction> transactionList,
			List<Fraud> fraudList, String category) {
		List<Map<String, String>> employeeOutputList = new LinkedList<>();

		for (Employee employee : employeeList) {

			Map<String, String> empAmountMap = new HashMap<String, String>();
			String employeeId = String.valueOf(employee.getEmpId());
			String employeeName = employee.getEmpName();
			String location = employee.getLocation();
			empAmountMap.put("employeeId", employeeId);
			empAmountMap.put("employeeName", employeeName);
			empAmountMap.put("location", location);
			Double amount = 0.0;
			Set<Transaction> transactionSet = employee.getTransactionSet();
			boolean isEmployeeFraud = isEmployeeFraud(fraudList, employee);
			if (!isEmployeeFraud) {
				for (Transaction transaction : transactionSet) {
					if (!transaction.getTansType().equals(TransType.CANCEL)) {
						amount += transaction.getTransAmount();
						amount += new IncentiveService().getIncentiveByLocation(location);
					}
				}
			}
			empAmountMap.put("amount", String.valueOf(amount));

		}

		return employeeOutputList;
	}

	private boolean isEmployeeFraud(List<Fraud> fraudList, Employee employee) {

		return fraudList.stream().allMatch(it -> it.getEmployee().equals(employee));
	}
}
