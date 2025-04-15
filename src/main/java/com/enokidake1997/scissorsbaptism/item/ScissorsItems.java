package com.enokidake1997.scissorsbaptism.item;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ScissorsItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ScissorsBaptism.MOD_ID);

    public static final DeferredItem<SwordItem> SCISSORS_SWORD = ITEMS.register("scissorsword",
            () -> new SwordItem(ScissorsToolTiers.SCISSORS_TIER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ScissorsToolTiers.SCISSORS_TIER, 3, 5F))
                    .rarity(Rarity.RARE)
            ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
