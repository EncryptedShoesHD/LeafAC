package me.TheBizii.LeafAC.module;

import me.TheBizii.LeafAC.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MovementChecks implements Listener {

    Main main;

    public MovementChecks(Main plugin) {
        main = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Location from = e.getFrom();
        Location to = e.getTo();
        if(from.getY() != to.getY()) {
            double diff = to.getY() - from.getY();
            //Step cheat detected. This also detects HighJump.
            if(diff >= 1) {
                e.setCancelled(true);
            }
        }
    }
}
