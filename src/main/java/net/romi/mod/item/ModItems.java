package net.romi.mod.item;

import net.romi.mod.RomiMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RomiMod.MOD_ID);

    public static final DeferredItem<Item> ATHERIUM_INGOT = ITEMS.register("atherium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ATHERIUM_NUGGET = ITEMS.register("atherium_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
