package com.enokidake1997.scissorsbaptism.util;

import com.enokidake1997.scissorsbaptism.ScissorsBaptism;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> SCISSORS_TOOLS = createTag("scissors_tools");
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ScissorsBaptism.MOD_ID, name));
        }
    }

}
