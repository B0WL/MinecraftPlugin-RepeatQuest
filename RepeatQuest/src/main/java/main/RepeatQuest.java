package main;

import org.bukkit.plugin.java.JavaPlugin;

import util.RecordManager;

public class RepeatQuest extends JavaPlugin{
	public static RepeatQuest instance;
	@Override
	public void onEnable() {
		instance = this;
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();
		
		RecordManager.record("debug", "RecordManager On");
		
		getLogger().info("onEnable has been invoked!");
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
