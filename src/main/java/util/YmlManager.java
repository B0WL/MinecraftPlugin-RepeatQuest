package util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import main.RepeatQuest;
import quest.Order;
import quest.Quest;

public class YmlManager {

	static JavaPlugin plugin = RepeatQuest.instance;
	
	public static boolean test() {
		File file = new File(plugin.getDataFolder(),"test.yml");
		
		if(!file.exists()) {			
		}else {
			file.mkdirs();
		}

		Order order1 = new Order("Collect", Material.STONE.name(), 10);
		Order order2 = new Order("Collect", Material.IRON_BARS.name(), 10);
		List<Map<String,Object>> orderList = new ArrayList<>();
		orderList.add(order1.serialize());
		orderList.add(order2.serialize());
		
	  List<String> itemList = new ArrayList<String>();
	  itemList.add(Material.IRON_BARS.name()+" "+ 24);
	  itemList.add(Material.GOLD_BLOCK.name()+" " + 12);
		
		Quest quest1 = new Quest("Daily", orderList, 100.0f, 10, itemList);
		
		Map<String,Object> questListMap = new HashMap<String,Object>();
		questListMap.put("Quest1",  quest1.serialize());
		
		YamlConfiguration questConfig =new YamlConfiguration();
		questConfig.set("Quests", questListMap);
	
		try {
			questConfig.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}

	
	
	public static Map<String,Object> getQuests(String questName) {
		File file = new File(plugin.getDataFolder() , "test.yml");
		FileConfiguration questConfig = YamlConfiguration.loadConfiguration(file);

		MemorySection memSec = (MemorySection) questConfig.get("Quests");
		Map<String, Object> quests = memSec.getValues(true);
		
		return quests;
	}






















}
