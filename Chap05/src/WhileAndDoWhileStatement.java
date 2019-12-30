
public class WhileAndDoWhileStatement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("whileループの開始");
		int i = 1;
		while(i < 0) {
			System.out.println("i= " + i);
		}
		System.out.println("whileループ終了");

		System.out.println("do-whileループの開始");
		int j = 1;
		do {
			System.out.println("j = " + j);
		}
		while(j < 0);
		System.out.println("do-whileループ終了");

	}

}
