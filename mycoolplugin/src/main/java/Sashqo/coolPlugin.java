package Sashqo;

import org.bukkit.plugin.java.JavaPlugin;

public class coolPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MyListener(), this);
        getLogger().info("onEnable is called!");
    }
}
