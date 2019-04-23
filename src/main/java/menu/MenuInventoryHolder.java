package menu;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class MenuInventoryHolder implements InventoryHolder  {

public static enum MenuHolder{
	NULL,MAIN,CATEGORY
}
private MenuHolder holder;

private Inventory backInventory;

	@Override	
	public Inventory getInventory() {
		return null;
	}	
	
	public MenuInventoryHolder() {
		this.holder = MenuHolder.NULL;
	}
	public MenuInventoryHolder(MenuHolder holder) {
		this.holder = holder;
		this.backInventory = null;
	}
	public MenuInventoryHolder(MenuHolder holder, Inventory backInventory) {
		this.holder = holder;
		this.backInventory = backInventory;
	}
	
	public MenuHolder getHolder() {
		return this.holder;
	}
	
	public Inventory getBackInventory() {
		return this.backInventory;
	}
}
