package Subscription;

import java.util.Scanner;

public class InputUtil {
	private static final Scanner scanner = new Scanner(System.in);

	public static String str(String msg) {
		while (true) {
			System.out.println(msg);
			String val = scanner.nextLine();
			if (val.trim().length() == 0) {
				System.out.println("[エラー]何も入力されていません。入力してください。");
			} else {
				return val;
			}
		}
	}

	public static int num(String msg) {
		System.out.println(msg);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("[エラー]数値を入力:");
		}
		int val = scanner.nextInt();
		scanner.nextLine();
		return val;
	}

	public static int num(String msg, int min, int max) {
		while (true) {
			int val = num(msg);
			if (val < min || val > max) {
				System.out.println("[エラー]" + min + "~" + max + "の範囲で入力してください。");
			} else {
				return val;
			}
		}
	}
}