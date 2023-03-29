package employee;

// 従業員の祖先のふるまいとなるインタフェース
public interface EmployeeInterFace {
	// 給与を計算する抽象メソッド
	int calculateSalary();
	
	// 年俸を計算する抽象メソッド
	int calculateAnnualSalary();
	
	// 名前を返却する抽象メソッド
	String getName();

}
