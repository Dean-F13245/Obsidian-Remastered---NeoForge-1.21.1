package net.deanf.obsidianremastered.item;

import net.deanf.obsidianremastered.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier OBSIDIAN = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL,
            1913, 8.5F,3.5F,13, () -> Ingredient.of(ModItems.OBSIDIAN_INGOT));
}

