package employee;

import java.util.ArrayList;
import java.util.List;

//BaseEmployeeクラスを継承した上司クラスManagerクラスを定義
public class Manager extends BaseEmployee {
	// 新しく部下の従業員のリスト（subordinates）を保持するフィールドを持つ。
	private List<Employee> subordinates;

	// インスタンス化したときに属性を初期化できるようにコンストラクタを作成
	public Manager(String name, int age, int monthlySalary) {
		super(name, age, monthlySalary);
		// ここでArrayListを初期化する
		this.subordinates = new ArrayList<Employee>();
	}

	// 抽象クラスBaseEmployeeの抽象メソッド
	// 新しく賞与を計算する抽象メソッドcalculateBonus()を実装する
	// 部下全員の給与合計の20%を賞与として計算し返却する
	public int calculateBonus() {
		// 部下全員の給与合計を足した数を保持しておく変数bonusを０で初期化
		int bonus = 0;

		// 配列に入ってる要素の数までfor文で繰り返すように定義する
		for (int i = 0; i < subordinates.size(); i++) {

			// sumMoneyに従業員1人1人の給与を代入していく
			bonus += subordinates.get(i).calculateSalary();

		}
		// このメソッドの初めに定義した変数bonusに部下全員の給与合計の20%を代入する
		bonus = (int) (bonus * 0.2);

		// 部下全員の給与合計の20%をが格納された変数bonusを返却する
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

	// 部下を追加するメソッド
	// インタフェースを引数にしたほうが保守性が上がる
	public void addSubordinate(Employee e) {
		this.subordinates.add(e);
	}

	// 部下のリストを返却するメソッド
	public void getSubordinates() {
		final String FORMAT = "↳部下： %s 　給与：\\ %,d 　年俸：\\ %,d";

		// 上司が持ってる部下のリストを1人ずつ取り出して名前：給与：年俸：を出力する
		// リストを返すだけなのに勝手に自分色に染めてはいけない
		for (Employee e : this.subordinates) {
			//System.out.println("ト部下：" + e.getName() + "　給与：\\" + e.calculateSalary() + "　年俸：\\" + e.calculateAnnualSalary());
			String s = String.format(FORMAT, e.getName(), e.calculateSalary(), e.calculateAnnualSalary());
			System.out.println(s);
		}

		System.out.println("===============================================================");
	}

}
