package menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import menu.MenuInventoryHolder.MenuHolder;
import net.milkbowl.vault.economy.Economy;
import util.GUIManager;

public class MenuInventory {	
	public static final int mainListSlot = 12;
	public static final int mainLogSlot = 14;

	public static void onMain(Player player, Inventory backInventory) {
		Inventory inventory = Bukkit.createInventory(new MenuInventoryHolder(MenuHolder.MAIN, backInventory), 27,
				"Quest : Main");

		GUIManager.setButton(inventory, Material.BOOK, ChatColor.GOLD + "Quest List", mainListSlot);
		GUIManager.setButton(inventory, Material.BOOKSHELF, ChatColor.WHITE + "Quest Logs", mainLogSlot);

		GUIManager.exitButton(inventory);
		player.openInventory(inventory);

	}

	public static void onMain(Player player) {
		onMain(player, null);
	}
	
	
	public static void onCategory(Player player, Inventory backInventory) {
		Inventory inventory = Bukkit.createInventory(new MenuInventoryHolder(MenuHolder.CATEGORY, backInventory), 27,
				"Quest : Category");
		
		
		//plugin.getConfig().getBoolean("debug"
		
		
		
		
		GUIManager.basicButtons(inventory);
		player.openInventory(inventory);

	}

	public static void onCategory(Player player) {
		onCategory(player, null);
	}

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
