package net.deanf.obsidianremastered.datagen;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.deanf.obsidianremastered.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ObsidianRemastered.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TEST_BLOCK);

        stairsBlock(ModBlocks.OBSIDIAN_STAIRS.get(),blockTexture(ModBlocks.OBSIDIAN_STAIRS.get()));

        slabBlock(ModBlocks.OBSIDIAN_SLAB.get(),blockTexture(ModBlocks.OBSIDIAN_SLAB.get()), blockTexture(ModBlocks.OBSIDIAN_SLAB.get()));

        blockItem(ModBlocks.OBSIDIAN_STAIRS);
        blockItem(ModBlocks.OBSIDIAN_SLAB);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("obsidianremastered:block/" + deferredBlock.getId().getPath()));
    }
}
