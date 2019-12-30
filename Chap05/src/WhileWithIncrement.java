
public class WhileWithIncrement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = 0;
		int i = 1;
		while(i <= 100) {
			ans += i;
			i++;
		}
		System.out.println("答え：" + ans);
		System.out.println("ループ終了後のiの値：" + i);

	}

}
