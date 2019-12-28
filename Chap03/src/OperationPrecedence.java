
public class OperationPrecedence {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "計算結果";
		int num1 = 123;
		int num2 = 456;

		String ans1 = str + num1 + num2;
		String ans2 = str + (num1 + num2);

		System.out.println(ans1);
		System.out.println(ans2);

	}

}
