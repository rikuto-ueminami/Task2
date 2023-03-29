package employee;

// EmployeeInterFaceを実装する抽象クラス
public abstract class BaseEmployee implements EmployeeInterFace {
	// このクラスはname, age, monthlySalaryを保持するフィールドを持つ
	// 外部からアクセスできないようにアクセス修飾子privateに設定
	private String name;
	private int age;
	protected int monthlySalary;
	
	// インスタンス化したときに属性を初期化できるようにコンストラクタを作成
	public BaseEmployee(String name, int age, int monthlySalary) {
		this.name = name;
		this.age = age;
		this.monthlySalary = monthlySalary;
	}
	
	// EmployeeInterFaceのcalculateSalary()を実装する
	// monthlySalaryから税金10%を差し引いた給与を返却する
	public int calculateSalary() {
		// 控除額の変数にmonthlySalaryから税金10%をかける
		double taxDeducted = this.monthlySalary * 0.1;
		// 月額給与を計算（monthlySalaryから税金10%を差し引いた数）
		int salary = (int)(this.monthlySalary - taxDeducted);
		return salary;
	}
	
	// EmployeeInterFaceのgetName()を実装する
	// 名前を返却する
	public String getName() {
		return this.name;
	}
	
	// 新しく賞与を計算する抽象メソッドを追加
	public abstract int calculateBonus();
	

}
