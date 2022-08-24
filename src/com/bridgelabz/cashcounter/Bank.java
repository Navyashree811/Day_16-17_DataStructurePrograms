package com.bridgelabz.cashcounter;

import com.bridgelabz.datastructure.Queue;

public class Bank {
	private String name;

	long totalBankBalance;

	Queue<Customer> customerQueue = new Queue<>();

	void addCustomerToQueue(Customer customer) {
		customerQueue.enqueue(customer);
	}

	Customer removeCustomerFromQueue() {
		Customer customer = customerQueue.dequeue();
		System.out.println("Customer Removed => " + customer);
		return customer;
	}

	void depositOrWithdraw() {
		while (!customerQueue.isEmpty()) {
			Customer customer = removeCustomerFromQueue();
			System.out.println(customer);
			if (Constants.Operation.DEPOSIT.equals(customer.getOperationType())) {
				customer.setCashBalance(customer.getCashBalance() + customer.getAmount());
				totalBankBalance += customer.getAmount();
			} else {
				customer.setCashBalance(customer.getCashBalance() - customer.getAmount());
				totalBankBalance -= customer.getAmount();
			}
			System.out.println("Cash Balance after deposit => " + customer.getCashBalance());
			System.out.println("Total Bank Balance " + totalBankBalance);
		}
		System.out.println();
	}

//	    void depositOrWithdraw(){
////	        Customer customer = removeCustomerFromQueue();
//	        LinkedList<Customer> customerList = customerQueue.queue;
//	        MyNode<Customer> temp = customerList.head;
//	        while (temp != null) {
//	            Customer customer = temp.getKey();
//	            System.out.println(customer + " ");
//	            if(Constants.Operation.DEPOSIT.equals(customer.getOperationType())){
//	                customer.setCashBalance(customer.getCashBalance() +customer.getAmount());
//	                totalBankBalance+=customer.getAmount();
//	            }
//	            else{
//	                customer.setCashBalance(customer.getCashBalance() - customer.getAmount());
//	                totalBankBalance-=customer.getAmount();
//	            }
//	            temp = (MyNode<Customer>) temp.getNext();
//	        }
	//
//	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
