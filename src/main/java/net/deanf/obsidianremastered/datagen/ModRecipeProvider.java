package net.deanf.obsidianremastered.datagen;

import net.deanf.obsidianremastered.item.ModItems;
import net.deanf.obsidianremastered.block.ModBlocks;
import net.deanf.obsidianremastered.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSIDIAN_INGOT.get())
                .pattern("OOO")
                .pattern("OII")
                .pattern("IIB")
                .define('O', Items.OBSIDIAN)
                .define('I', Items.IRON_INGOT)
                .define('B', Items.BLAZE_POWDER)
                .unlockedBy("has_obsidian", has(Items.OBSIDIAN)) // Unlock when player has Obsidian
                .save(recipeOutput);

            // Pickaxe Recipe
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_PICKAXE.get())
                    .pattern("OOO")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('O', ModItems.OBSIDIAN_INGOT.get()) // Your custom material
                    .define('S', Items.STICK)
                    .unlockedBy("has_obsidian_ingot", has(ModItems.OBSIDIAN_INGOT.get()))
                    .save(recipeOutput);

            // Axe Recipe
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_AXE.get())
                    .pattern("OO ")
                    .pattern("OS ")
                    .pattern(" S ")
                    .define('O', ModItems.OBSIDIAN_INGOT.get())
                    .define('S', Items.STICK)
                    .unlockedBy("has_obsidian_ingot", has(ModItems.OBSIDIAN_INGOT.get()))
                    .save(recipeOutput);

            // Shovel Recipe
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SHOVEL.get())
                    .pattern(" O ")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('O', ModItems.OBSIDIAN_INGOT.get())
                    .define('S', Items.STICK)
                    .unlockedBy("has_obsidian_ingot", has(ModItems.OBSIDIAN_INGOT.get()))
                    .save(recipeOutput);

            // Hoe Recipe
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HOE.get())
                    .pattern("OO ")
                    .pattern(" S ")
                    .pattern(" S ")
                    .define('O', ModItems.OBSIDIAN_INGOT.get())
                    .define('S', Items.STICK)
                    .unlockedBy("has_obsidian_ingot", has(ModItems.OBSIDIAN_INGOT.get()))
                    .save(recipeOutput);

            // Sword Recipe
            ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SWORD.get())
                    .pattern(" O ")
                    .pattern(" O ")
                    .pattern(" S ")
                    .define('O', ModItems.OBSIDIAN_INGOT.get())
                    .define('S', Items.STICK)
                    .unlockedBy("has_obsidian_ingot", has(ModItems.OBSIDIAN_INGOT.get()))
                    .save(recipeOutput);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_STAIRS.get(), 4)
                    .pattern("O  ")
                    .pattern("OO ")
                     .pattern("OOO")
                    .define('O', Items.OBSIDIAN)
                    .unlockedBy("has_obsidian", has(Items.OBSIDIAN))
                    .save(recipeOutput);

            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_SLAB.get(), 6)
                    .pattern("OOO")
                    .define('O', Items.OBSIDIAN)
                    .unlockedBy("has_obsidian", has(Items.OBSIDIAN))
                    .save(recipeOutput);








    }
}
