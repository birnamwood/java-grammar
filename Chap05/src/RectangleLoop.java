
public class RectangleLoop {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int width = (int) (10 * Math.random()) + 1;
		int height = (int)(10 * Math.random()) + 1;
		System.out.println("底辺は" + width + "です。");
		System.out.println("高さは" + height + "です。");
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
