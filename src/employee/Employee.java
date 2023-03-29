package employee;

// BaseEmployeeクラスを継承した部下クラスEmployeeクラスを定義
public class Employee extends BaseEmployee {
	// インスタンス化したときに属性を初期化できるようにコンストラクタを作成
	public Employee(String name, int age, int monthlySalary) {
		super(name, age, monthlySalary);
	}

	// 抽象クラスBaseEmployeeの抽象メソッド
	// 新しく賞与を計算する抽象メソッドcalculateBonus()を実装する
	// 2ヶ月分の月額給与を賞与として返却する
	public int calculateBonus() {
		int bonus = this.calculateSalary() * 2;
		return bonus;

	}

	// 抽象クラスBaseEmployeeの抽象メソッドcalculateAnnualSalary()を実装する
	// 年俸を計算するメソッド
	// 12ヶ月分の月額給与とcalculateBonus()で計算した賞与を加えた金額を返却する
	public int calculateAnnualSalary() {
		// 12ヶ月分の月額給与の計算
		int allMonthSalary = this.calculateSalary() * 12;
		// calculateBonus()で計算した賞与を加える
		int annualSalary = allMonthSalary + this.calculateBonus();
		// 12ヶ月分の月額給与とcalculateBonus()で計算した賞与を加えた金額を返却する
		return annualSalary;

	}

}
