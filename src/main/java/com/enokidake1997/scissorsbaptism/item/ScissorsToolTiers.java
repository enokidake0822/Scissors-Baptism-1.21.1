package com.enokidake1997.scissorsbaptism.item;

import com.enokidake1997.scissorsbaptism.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ScissorsToolTiers {

    public static final Tier SCISSORS_TIER = new SimpleTier(ModTags.Blocks.SCISSORS_TOOLS,
            2031, 9.0F, 4.0F, 28, () -> Ingredient.of());

}
