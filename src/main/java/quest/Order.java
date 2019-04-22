package quest;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;

public class Order implements ConfigurationSerializable {

	public String getType() {
		return type;
	}
	public void setType(String type) {
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
	
	private String type;
	private String target;
	private int amount;

	public Order(String type, String target, int amount) {
		this.type = type;
		this.target = target;
		this.amount = amount;
	}
	@Override
	public Map<String, Object> serialize() {
		Map<String, Object> mappedObject = new LinkedHashMap<String, Object>();
		mappedObject.put("type", type);
		mappedObject.put("target", target);
		mappedObject.put("amount", amount);
		return mappedObject;
	}

	public static Order deserialize(Map<String, Object> quest) { // note that is static
		return new Order((String) quest.get("type"), (String) quest.get("target"), (int) quest.get("amount"));
	}
}
