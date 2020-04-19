package me.kenny.info;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Info extends JavaPlugin implements CommandExecutor {
    @Override
    public void onEnable() {
        getCommand("info").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
        sender.sendMessage(ChatColor.GREEN + "This server is running " + Bukkit.getName() + " " + version + ".");
        sender.sendMessage(ChatColor.GREEN + Bukkit.getVersion() + ".");
        return true;
    }
}

