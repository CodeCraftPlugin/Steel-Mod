package me.codecraft.steelmod;

import me.codecraft.steelmod.item.SteelModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteelMod implements ModInitializer {
    public static final String MOD_ID = "steel-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        SteelModItems.registerItems();
    }
}
