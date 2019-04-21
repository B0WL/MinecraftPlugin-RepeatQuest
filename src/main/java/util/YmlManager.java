package util;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import main.Quest;
import main.RepeatQuest;

public class YmlManager {

	static JavaPlugin plugin = RepeatQuest.instance;

	
	
	public static Quest getQuest(String questName) {
		File file = new File(plugin.getDataFolder() + "/quest.yml");

		if (!file.exists()) {

			FileConfiguration config = new YamlConfiguration();
			try {
				config.load(file);

			} catch (Exception e) {
				return null;
			}
			
			String category = config.getString("Category");
						
			
			
			
		}
		
		return null;
	}
}
