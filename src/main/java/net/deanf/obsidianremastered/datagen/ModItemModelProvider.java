package net.deanf.obsidianremastered.datagen;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.deanf.obsidianremastered.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ObsidianRemastered.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.OBSIDIAN_INGOT.get());
        basicItem(ModItems.OBSIDIAN_SWORD.get());
        basicItem(ModItems.OBSIDIAN_PICKAXE.get());
        basicItem(ModItems.OBSIDIAN_AXE.get());
        basicItem(ModItems.OBSIDIAN_SHOVEL.get());
        basicItem(ModItems.OBSIDIAN_HOE.get());


    }
}
