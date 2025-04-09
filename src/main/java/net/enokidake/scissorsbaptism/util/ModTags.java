package net.enokidake.scissorsbaptism.util;

import net.enokidake.scissorsbaptism.ScissorsBaptism;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public final class BlockTags {

        public static final TagKey<Block> INCORRECT_FOR_SIZATOOL = createTag("incorrect_for_sizatool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ScissorsBaptism.MOD_ID, name));
        }

    }

}