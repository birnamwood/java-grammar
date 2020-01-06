
public class SumAllArrays {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] list1 = {4, 5, 84, 7, 1, 15};
		int[] list2 = {54, 47, 5, 358, 2};
		int[] list3 = {5, 87, 8, 11, 41};

		int sum1 = getSumArray(list1);
		int sum2 = getSumArray(list2);
		int sum3 = getSumArray(list3);

		System.out.println("配列1内の合計：" + sum1);
		System.out.println("配列2内の合計：" + sum2);
		System.out.println("配列3内の合計：" + sum3);

		int total = sum1 + sum2 + sum3;
		System.out.println("全配列の合計：" + total);

	}

	public static int getSumArray(int[] array) {
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		return sum;
	}

}
