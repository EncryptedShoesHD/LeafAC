package me.TheBizii.LeafAC;

import me.TheBizii.LeafAC.module.Step;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {

    ConsoleCommandSender console = getServer().getConsoleSender();
    List<Listener> listeners = new ArrayList<>();

    @Override
    public void onEnable() {
        try {
            registerListeners();
            console.sendMessage("§a§lLeafAC §8> §r§7Plugin enabled");
        }catch(Exception ex) {
            console.sendMessage("§a§lLeafAC §8> §r§cSomething went wrong while enabling the plugin. (§4" + ex.getMessage() + "§c)");
        }
    }

    @Override
    public void onDisable() {
        console.sendMessage("§a§lLeafAC §8> §r§7Plugin enabled");
    }

    private void registerListeners() {
        PluginManager pm = getServer().getPluginManager();

        listeners.add(new Step(this));

        for(Listener l : listeners) {
            pm.registerEvents(l, this);
        }
    }

    public ConsoleCommandSender getConsole() {
        return console;
    }
}
