
public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = (int)(100 * Math.random()) + 1;
		if((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("num=" + num + "は2の倍数で、しかも3の倍数です。");
		}
		else {
			System.out.println("残念ながらnum=" + num + "はそれ以外です。");
		}

	}

}
