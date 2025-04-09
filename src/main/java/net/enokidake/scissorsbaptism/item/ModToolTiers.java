package net.enokidake.scissorsbaptism.item;

import net.enokidake.scissorsbaptism.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {

    public static final Tier SIZATOOLS = new SimpleTier(ModTags.BlockTags.INCORRECT_FOR_SIZATOOL,
            2031, 9.0F, 4.0F, 15, () -> Ingredient.of(ModItems.SIZATOOLS));

}
