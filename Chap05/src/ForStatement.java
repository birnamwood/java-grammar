
public class ForStatement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 8;
		System.out.println("ループを開始します。");
		for(int rand = (int)(10 + Math.random()) + 1; rand != num; rand = (int)(10 * Math.random()) + 1) {
			System.out.println("randの値：" + rand);
		}
		System.out.println("ループが終了しました。");

	}

}
