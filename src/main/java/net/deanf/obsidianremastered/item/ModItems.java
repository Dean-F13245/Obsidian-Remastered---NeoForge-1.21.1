package net.deanf.obsidianremastered.item;

import net.deanf.obsidianremastered.ObsidianRemastered;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ObsidianRemastered.MOD_ID);

    public static final DeferredItem<Item> OBSIDIANINGOT = ITEMS.register("obsidian_ingot",
            ()-> new Item((new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
