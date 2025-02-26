package net.deanf.obsidianremastered.item;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ObsidianRemastered.MOD_ID);

    public static final DeferredItem<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot",
            ()-> new Item((new Item.Properties())));

    public static final DeferredItem<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",() -> new
            SwordItem(ModToolTiers.OBSIDIAN,new Item.Properties().attributes((SwordItem.createAttributes(ModToolTiers.OBSIDIAN,3,-2.4F)))));

    public static final DeferredItem<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",() -> new
            PickaxeItem(ModToolTiers.OBSIDIAN,new Item.Properties().attributes((PickaxeItem.createAttributes(ModToolTiers.OBSIDIAN,1.0F,-2.8F)))));

    public static final DeferredItem<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",() -> new
            AxeItem(ModToolTiers.OBSIDIAN,new Item.Properties().attributes((SwordItem.createAttributes(ModToolTiers.OBSIDIAN,6,-3.2F)))));

    public static final DeferredItem<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",() -> new
            ShovelItem(ModToolTiers.OBSIDIAN,new Item.Properties().attributes((ShovelItem.createAttributes(ModToolTiers.OBSIDIAN,1.5F,-3.0F)))));

    public static final DeferredItem<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",() -> new
            HoeItem(ModToolTiers.OBSIDIAN,new Item.Properties().attributes((HoeItem.createAttributes(ModToolTiers.OBSIDIAN,0F,-3.0F)))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
