package main;

import java.util.List;

public class Quest {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Float getRewardMoney() {
		return rewardMoney;
	}
	public void setRewardMoney(Float rewardMoney) {
		this.rewardMoney = rewardMoney;
	}
	public int getRewardExp() {
		return rewardExp;
	}
	public void setRewardExp(int rewardExp) {
		this.rewardExp = rewardExp;
	}
	public List<String> getRewardItems() {
		return rewardItems;
	}
	public void setRewardItems(List<String> rewardItems) {
		this.rewardItems = rewardItems;
	}

	private String name;
	private Category category;
	private List<Order> orders;
	
	private Float rewardMoney;
	private int rewardExp;
	private List<String> rewardItems;
	
	public Quest(String name, Category category, List<Order> orders
			, Float rewardMoney, int rewardExp, List<String> rewardItems) {
		this.name = name;
		this.category = category;
		this.orders = orders;
		this.rewardMoney = rewardMoney;
		this.rewardExp = rewardExp;
		this.rewardItems = rewardItems;
	}
}

class Order {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	private String name;
	private Type type;
	private String target;
	private int amount;

	public Order(String name, Type type, String target, int amount) {
		this.name = name;
		this.type = type;
		this.target = target;
		this.amount = amount;
	}
}
