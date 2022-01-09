package me.Juanma__.helloworld.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.Juanma__.helloworld.utils.Utils;

public class TestUI {
	
	public static Inventory inv;
	public static String inventory_name;
	public static int inv_rows = 4 * 9;
	
	public static void initialize() {
		inventory_name = Utils.chat("&6&lTest GUI");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p) {
		
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);
		
		Utils.createItem(inv, 4, 1, 1, "&cTest Item", "&7Esta es una linea lore 1", "&bSegunda linea de lore", "&3Tercera linea");
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
		if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cTest item"))) {
			p.setDisplayName(Utils.chat("&8[&6*&8] &6&lHas hecho exitosamente una GUI!"));
		}
	}
}
