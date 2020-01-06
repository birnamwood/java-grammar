import setter.ArrayOperationsWithSetter;

public class UseArrayOperationsWithSetter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] list = {4, 5, 84, 7, 1, 15};

		ArrayOperationsWithSetter arrayOpe = new ArrayOperationsWithSetter();

		arrayOpe.setArray(list);
		int sum = arrayOpe.getSumArray();
		double ave = arrayOpe.getAverage();
		System.out.println("配列内の合計：" + sum + "平均：" + ave);

	}

}
