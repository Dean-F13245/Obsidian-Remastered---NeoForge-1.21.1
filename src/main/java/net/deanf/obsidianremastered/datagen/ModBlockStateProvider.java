package net.deanf.obsidianremastered.datagen;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ObsidianRemastered.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    //private void blockWithItem(DeferredRegister<?> deferredBlock ) {
   //     simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));

   // }
}
