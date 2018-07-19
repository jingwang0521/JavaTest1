package com.hand;

public class PeopleUpMoney {

	//单例模式
	private static PeopleUpMoney singleton=null;

	private PeopleUpMoney() {}

	public static PeopleUpMoney getSingleton() {
		if (singleton==null) {
			singleton=new PeopleUpMoney();
		}
		return singleton;
	}

	int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public   void upMoney(int money){
		int storeMoney=money-3500;
		double  sumUpMoney=0;
				if (storeMoney <= 1500){
					sumUpMoney = storeMoney * 0.03;
				} else if (storeMoney <=4500) {
					sumUpMoney = (storeMoney * 0.10) - 105;
				}else if (storeMoney <=9000) {
					sumUpMoney = (storeMoney * 0.20) - 555;
				}else if (storeMoney <=35000) {
					sumUpMoney = (storeMoney * 0.25) - 1005;
				}else if (storeMoney <=55000) {
					sumUpMoney = (storeMoney * 0.30) - 2755;
				}else if (storeMoney <=80000) {
					sumUpMoney = (storeMoney * 0.35) - 5505;
				}else if (storeMoney > 80000) {
					sumUpMoney = (storeMoney * 0.45) - 13505;
				}else{
					System.out.print("不需要缴纳个人所得税。");
				}
				System.out.println("需要缴的个人所得税为：" + (int)(sumUpMoney * 100) / 100.0);
			}
}



