package javaapi;

public class UseStringMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String csvStr = "Java,PHP,Ruby,C#,Python";
		String[] csvArray = csvStr.split(",");

		for(String element : csvArray) {
			System.out.println(element);
		}

	}

}
