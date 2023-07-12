package me.codecraft.steelmod.item;

import io.github.codecraftplugin.registrylib.utils.Registry;
import me.codecraft.steelmod.SteelMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class SteelModItems {
    public static final Item STEEL_INGOT = Registry.registerItems("steel_ingot",SteelMod.MOD_ID,new Item(new FabricItemSettings()), ItemGroups.INGREDIENTS);
//    public static final Item CARBON = Registry.registerItems("carbon",SteelMod.MOD_ID,new Item(new FabricItemSettings()), ItemGroups.INGREDIENTS);
    public static void registerItems(){
        SteelMod.LOGGER.info("Loaded Items "+ SteelMod.MOD_ID);
    }
}