package me.TheBizii.LeafAC.module;

import me.TheBizii.LeafAC.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Flight implements Listener {

    Main main;

    public Flight(Main plugin) {
        main  = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
    }
}
