package Subscriptions.java;

public class Subscription {
	private final int id;
	private final String name;
	private final String category;
	private final int price;
	private final int paymentDay;

	public Subscription(int id, String name, String category, int price, int paymentDay) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.paymentDay = paymentDay;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public int getPaymentDay() {
		return paymentDay;
	}

	@Override
	public String toString() {
		return String.format("ID: %-3d | 名前: %-15s | ジャンル: %-8s | 料金: %, 6d円 | 毎月%2d日決済", id, name, category, price,
				paymentDay);
	}
}
