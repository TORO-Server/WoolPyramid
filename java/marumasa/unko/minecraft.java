package marumasa.unko;

import org.bukkit.plugin.java.JavaPlugin;

public final class minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("/unko").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
