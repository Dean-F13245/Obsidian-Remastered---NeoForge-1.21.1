package net.deanf.obsidianremastered.block;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ObsidianRemastered.MOD_ID);


    //private static <T extends Block> DeferredBlock<T>, registerBlock(String name, Supplier<T> block) {
    //    DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, block);
    //    registerBlockItem(name, toReturn);
    //    return toReturn;

  // }



}