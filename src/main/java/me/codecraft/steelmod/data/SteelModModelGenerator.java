package me.codecraft.steelmod.data;

import me.codecraft.steelmod.item.SteelModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class SteelModModelGenerator extends FabricModelProvider {
    public SteelModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(SteelModItems.STEEL_INGOT, Models.GENERATED);
//        itemModelGenerator.register(SteelModItems.CARBON, Models.GENERATED);
    }
}
