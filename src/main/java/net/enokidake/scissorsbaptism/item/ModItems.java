package net.enokidake.scissorsbaptism.item;

import net.enokidake.scissorsbaptism.ScissorsBaptism;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ScissorsBaptism.MOD_ID);
    public static final DeferredItem<SwordItem> SIZATOOLS = ITEMS.register("scissorsword",
            () -> new SwordItem(ModToolTiers.SIZATOOLS, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SIZATOOLS, 3, -2.4f))));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
