package br.com.ohanacraft.supremeexpansion.gear.basic;

import br.com.ohanacraft.supremeexpansion.resource.Components;
import br.com.ohanacraft.supremeexpansion.resource.CoreNature;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public final class BasicAxe {

    public static final SlimefunItemStack ADAMANTIUM_AXE = new SlimefunItemStack("TOOLS_ADAMANTIUM_AXE",
            Material.DIAMOND_AXE, "&f&lAdamantium Axe", "&f&lA Axe of Adamantium");
    public static final ItemStack[] RECIPE_ADAMANTIUM_AXE = {
            Components.ADAMANTIUM_PLATE,   Components.ADAMANTIUM_PLATE,        null,
            Components.ADAMANTIUM_PLATE,   CoreNature.RESOURCE_CORE_DARK_OAK_LOG,        null,
            null,   CoreNature.RESOURCE_CORE_DARK_OAK_LOG,  null
    };

    public static final SlimefunItemStack AURUM_AXE = new SlimefunItemStack("TOOLS_AURUM_AXE",
            Material.DIAMOND_AXE, "&f&lAurum Axe", "&f&lA Axe of Aurum");
    public static final ItemStack[] RECIPE_AURUM_AXE = {
            Components.AURUM_PLATE,   Components.AURUM_PLATE,        null,
            Components.AURUM_PLATE,   CoreNature.RESOURCE_CORE_ACACIA_LOG,        null,
            null,   CoreNature.RESOURCE_CORE_ACACIA_LOG,  null
    };

    public static final SlimefunItemStack TITANIUM_AXE = new SlimefunItemStack("TOOLS_TITANIUM_AXE",
            Material.DIAMOND_AXE, "&f&lTitanium Axe", "&f&lA Axe of Titanium");
    public static final ItemStack[] RECIPE_TITANIUM_AXE = {
            Components.TITANIUM_PLATE,   Components.TITANIUM_PLATE,        null,
            Components.TITANIUM_PLATE,   CoreNature.RESOURCE_CORE_SPRUCE_LOG,        null,
            null,   CoreNature.RESOURCE_CORE_SPRUCE_LOG,  null
    };

}