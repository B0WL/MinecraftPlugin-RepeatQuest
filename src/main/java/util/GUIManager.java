package util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class GUIManager {

	public static void setButton(Inventory inventory, Material icon, String name, int slot) {
		ItemStack button = new ItemStack( icon);
		ItemMeta meta = button.getItemMeta();
		meta.setDisplayName(name);
		button.setItemMeta(meta);

		inventory.setItem(slot, button);
	}
	
	public static void basicButtons(Inventory inventory) {
		backButton(inventory);
		exitButton(inventory);
	}
	
	public static int smallBackSlot = 18;
	public static int smallExitSlot = 26;

	public static int largeBackSlot = 45;
	public static int largeExitSlot = 53;

	public static void backButton(Inventory inventory) {
		if (inventory.getSize() > 27) {// big
			GUIManager.setButton(inventory, Material.SLIME_BALL, "Back", largeBackSlot);
		} else {// small
			GUIManager.setButton(inventory, Material.SLIME_BALL, "Back", smallBackSlot);
		}
	}

	public static void exitButton(Inventory inventory) {
		if (inventory.getSize() > 27) {// big
			GUIManager.setButton(inventory, Material.TNT, ChatColor.RED + "Exit", largeExitSlot);
		} else {// small
			GUIManager.setButton(inventory, Material.TNT, ChatColor.RED + "Exit", smallExitSlot);
		}
	}
	
	
	public static int smallPageBackSlot = 21;
	public static int smallPageSlot = 22;
	public static int smallPageNextSlot = 23;

	public static int largePageBackSlot = 48;
	public static int largePageSlot = 49;
	public static int largePageNextSlot = 50;
	
	static void pageBasicButtons(Inventory inventory, int page) {
		if (inventory.getSize() > 27) {
			GUIManager.setButton(inventory, Material.SLIME_BALL, ChatColor.RED + "Back Page", largePageBackSlot);
			GUIManager.setButton(inventory, Material.EGG, Integer.toString(page), largePageSlot);
			GUIManager.setButton(inventory, Material.SLIME_BALL, ChatColor.GREEN + "Next Page", largePageNextSlot);
		}else {
			GUIManager.setButton(inventory, Material.SLIME_BALL, ChatColor.RED + "Back Page", smallPageBackSlot);
			GUIManager.setButton(inventory, Material.EGG, Integer.toString(page), smallPageSlot);
			GUIManager.setButton(inventory, Material.SLIME_BALL, ChatColor.GREEN + "Next Page", smallPageNextSlot);
		}
	}
	


	
	
}
