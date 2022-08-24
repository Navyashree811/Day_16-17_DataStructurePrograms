/*
 * The Stack Abstract Data Type
 * Q4. Simulate Banking Cash Counter.
 */
package com.bridgelabz.cashcounter;

public class CashCounterMain {
	public static void main(String[] args) {

		Bank sbiBank = new Bank();
		sbiBank.setName("SBI");
		sbiBank.totalBankBalance = 10000000;

		Customer customer1 = new Customer();
		customer1.setAccountNumber(123456);
		customer1.setAmount(40000);
		customer1.setCashBalance(30000);
		customer1.setName("Amit");
		customer1.setOperationType(Constants.Operation.DEPOSIT);

		Customer customer2 = new Customer();
		customer2.setAccountNumber(123457);
		customer2.setAmount(4000);
		customer2.setCashBalance(50000);
		customer2.setName("Neha");
		customer2.setOperationType(Constants.Operation.WITHDRAW);

		Customer customer3 = new Customer();
		customer3.setAccountNumber(123457);
		customer3.setAmount(4000);
		customer3.setCashBalance(50000);
		customer3.setName("Arun");
		customer3.setOperationType(Constants.Operation.DEPOSIT);

		sbiBank.addCustomerToQueue(customer1);
		sbiBank.addCustomerToQueue(customer2);
		sbiBank.addCustomerToQueue(customer3);

		System.out.println();
		System.out.println(sbiBank.customerQueue);
		System.out.println("Before " + sbiBank.totalBankBalance);
		System.out.println();
		sbiBank.depositOrWithdraw();
		System.out.println("After " + sbiBank.totalBankBalance);

	}

}
