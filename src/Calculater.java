import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1 = input_num1.getNumber(scanner);
		String op = OperatorInput.getOperator(scanner);
		double num2 = input_num2.getNumber(scanner);

		double result = 0;

		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("エラー: 0で割ることはできません。");
				scanner.close();
				return;
			}
			break;
		default:
			System.out.println("エラー: 無効な演算子です。");
			scanner.close();
			return;
		}

		System.out.println("計算結果: " + result);
		scanner.close();
	}
}
