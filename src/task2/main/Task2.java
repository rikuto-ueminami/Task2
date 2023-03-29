package task2.main;

import employee.Employee;
import employee.Manager;


public class Task2 {

	public static void main(String[] args) {
		final String FORMAT = "部長： %s 　給与：\\ %,d 　年俸：\\ %,d";
		
		// 上司の生成　※2名
		Manager manager1 = new Manager("上司１", 30, 160000);
		Manager manager2 = new Manager("上司２", 40, 200000);
		
		// 部下の生成　※4名　のちに2名ずつそれぞれの上司に属する
		Employee employee1 = new Employee("部下１", 18, 130000);
		Employee employee2 = new Employee("部下２", 19, 140000);
		Employee employee3 = new Employee("部下３", 20, 150000);
		Employee employee4 = new Employee("部下４", 21, 160000);
		
		
		// 上司1に部下１，４を属させる
		manager1.addSubordinate(employee1);
		manager1.addSubordinate(employee4);
		
		// 上司2に部下２，３を属させる
		manager2.addSubordinate(employee2);
		manager2.addSubordinate(employee3);
		
		// それぞれの上司と該当部下の情報を標準出力する
		// System.out.println("部長：" + manager1.getName() + "　給与：\\" + manager1.calculateSalary() + "　年俸：\\" + manager1.calculateAnnualSalary());
		// String boss1 = String.format(FORMAT, manager1.getName(), manager1.calculateSalary(), manager1.calculateAnnualSalary());
		System.out.println(String.format(FORMAT, manager1.getName(), manager1.calculateSalary(), manager1.calculateAnnualSalary()));
		manager1.getSubordinates();
		
		// System.out.println("部長：" + manager2.getName() + "　給与：\\" + manager2.calculateSalary() + "　年俸：\\" + manager2.calculateAnnualSalary());
		// String boss2 = String.format(FORMAT, manager2.getName(), manager2.calculateSalary(), manager2.calculateAnnualSalary());
		System.out.println(String.format(FORMAT, manager2.getName(), manager2.calculateSalary(), manager2.calculateAnnualSalary()));
		manager2.getSubordinates();
	}

}
