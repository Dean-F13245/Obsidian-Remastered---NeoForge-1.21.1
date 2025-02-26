package net.deanf.obsidianremastered.util;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

   public static class Blocks {
       public static final TagKey<Block> NEEDS_OBSIDIAN_TOOL = createTag( "needs_obsidian_tool");
       public static final TagKey<Block> INCORRECT_FOR_OBSIDIAN_TOOL = createTag( "incorrect_for_obsidian_tool");


       private static TagKey<Block> createTag(String name) {
           return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ObsidianRemastered.MOD_ID,name));
       }


   }

    public static class Items {

    }



}
