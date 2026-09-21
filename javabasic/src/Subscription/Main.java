package Subscription;

public class Main {
	public static void main(String[] args) {
		Service service = new Service();

		while (true) {
			Menu.Menu();
			int choice = InputUtil.num("");

			switch (choice) {
			case 1:
				String name = InputUtil.str("サブスク名: ");
				String category = InputUtil.str("ジャンル: ");
				int price = InputUtil.num("月額料金: ");
				int paymentDay = InputUtil.num("決済日(1~31): ", 1, 31);
				service.create(name, category, price, paymentDay);
				break;

			case 2:
				service.readAll();
				break;

			case 3:
				int id = InputUtil.num("変更するID: ");
				if (service.findById(id) == null) {
					System.out.println("該当のIDがありません。");
				} else {
					String newName = InputUtil.str("名前を入力してください: ");
					String newCategory = InputUtil.str("ジャンルを入力してください: ");
					int newPrice = InputUtil.num("料金を入力してください: ");
					int newPaymentDay = InputUtil.num("決済日(1~31): ", 1, 31);
					if (service.update(id, newName, newCategory, newPrice, newPaymentDay)) {
						System.out.println("更新しました。");
					}
				}
				break;

			case 4:
				int deleteId = InputUtil.num("削除するID: ");
				if (service.delete(deleteId)) {
					System.out.println("削除完了");
				} else {
					System.out.println("該当のIDがありませんでした。");
				}
				break;

			case 5:
				System.out.println("終了。");
				return;

			default:
				System.out.println("正しい番号を入力してください。");
			}
		}
	}
}
