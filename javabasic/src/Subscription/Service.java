package Subscription;

import java.util.ArrayList;
import java.util.List;

public class Service {

	private final List<Subscription> subscriptions = new ArrayList<>();
	private int currentId = 1;

	public void create(String name, String category, int price, int paymentDay) {
		subscriptions.add(new Subscription(currentId, name, category, price, paymentDay));
		currentId++;
		System.out.println("「" + name + "」を登録しました。");
	}

	public void readAll() {
		if (subscriptions.isEmpty()) {
			System.out.println("登録されているサブスクはありません。");
			return;
		}
		int total = 0;
		for (Subscription sub : subscriptions) {
			System.out.println(sub);
			total += sub.getPrice();
		}
		System.out.printf("----------------------------------%n月額利用総額: %,d円%n", total);
	}

	public boolean update(int id, String name, String category, int price, int paymentDay) {
		for (int i = 0; i < subscriptions.size(); i++) {
			if (subscriptions.get(i).getId() == id) {
				subscriptions.set(i, new Subscription(id, name, category, price, paymentDay));
				return true;
			}
		}
		return false;
	}

	public boolean delete(int id) {
		for (int i = 0; i < subscriptions.size(); i++) {
			if (subscriptions.get(i).getId() == id) {
				subscriptions.remove(i);
				return true;
			}
		}
		return false;
	}

	public Subscription findById(int id) {
		for (Subscription sub : subscriptions) {
			if (sub.getId() == id) {
				return sub;
			}
		}
		return null;
	}
}
