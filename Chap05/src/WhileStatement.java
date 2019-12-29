
public class WhileStatement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 8;
		int rand = (int) (10 * Math.random()) + 1;
		System.out.println("ループを開始します。");

		while(rand != num) {
			System.out.println("randの値：" + rand);
			rand = (int)(10 * Math.random()) + 1;
		}
		System.out.println("ループが終了しました。");

	}

}
