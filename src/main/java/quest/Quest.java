package quest;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Quest {

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Map<String, Object>> getOrders() {
		return orders;
	}

	public void setOrders(List<Map<String, Object>> orders) {
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

	private String category;
	private List<Map<String, Object>> orders;

	private Float rewardMoney;
	private int rewardExp;
	private List<String> rewardItems;

	public Quest(String category, List<Map<String, Object>> orderList, Float rewardMoney, int rewardExp, List<String> rewardItems) {
		this.category = category;
		this.orders = orderList;
		this.rewardMoney = rewardMoney;
		this.rewardExp = rewardExp;
		this.rewardItems = rewardItems;
	}

	public Map<String, Object> serialize() {
		Map<String, Object> mappedObject = new LinkedHashMap<String, Object>();
		mappedObject.put("category", category);
		mappedObject.put("orders", orders);
		mappedObject.put("rewardMoney", rewardMoney);
		mappedObject.put("rewardExp", rewardExp);
		mappedObject.put("rewardItems", rewardItems);
		return mappedObject;
	}
	
	public Quest(Map<String, Object> quest) {
		this.category = (String) quest.get("category");
		this.orders = (List<Map<String, Object>>) quest.get("orders");
		this.rewardMoney = (Float) quest.get("rewardMoney");
		this.rewardExp = (int) quest.get("rewardExp");
		this.rewardItems = (List<String>) quest.get("rewardItems");
	}

	public static Quest deserialize(Map<String, Object> quest) { // note that is static
		return new Quest((String) quest.get("category"), (List<Map<String, Object>>) quest.get("orders"),
				(Float) quest.get("rewardMoney"), (int) quest.get("rewardExp"),
				(List<String>) quest.get("rewardItems"));
	}
}
