package com.hand;

/**
 * @author WANGJING
 */
public class Exam2 {
	public static void main(String[] args) {
		PeopleUpMoney peopleUpMoney=PeopleUpMoney.getSingleton();

		System.out.print("UserA");peopleUpMoney.upMoney(5000);
		System.out.print("UserB");peopleUpMoney.upMoney(10000);
		System.out.print("UserC");peopleUpMoney.upMoney(15000);
		System.out.print("UserD");peopleUpMoney.upMoney(60000);

	}

}
