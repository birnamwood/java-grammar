
public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numes = new int[5];
		int[] donomis = new int[5];
		for(int i = 0; i < 5; i++) {
			numes[i] = (int) (10 * Math.random());
			donomis[i] = (int) (10 * Math.random());
		}

		for(int donomi : donomis) {
			System.out.println("--分母の値：" + donomi);
			if(donomi == 0) {
				System.out.println("0で割り算はできません。処理を中止します。");
				break;
			}
			for(int nume : numes) {
				System.out.println("分子の値：" + nume);
				if(nume == 0) {
					System.out.print("\n分子0の答え0ですので処理を飛ばします。");
					continue;
				}
				double ans = (double) nume / donomi;
				System.out.println("\n割り算の答え：" + ans);
			}
		}

	}

}
