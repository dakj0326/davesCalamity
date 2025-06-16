package net.dave.davesCalamity.util;

import net.dave.davesCalamity.DavesCalamity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_WOOD_TOOL = createTag("needs_wood_tool");
        public static final TagKey<Block> INCORRECT_FOR_WOOD_TOOL = createTag("incorrect_for_wood_tool");
        public static final TagKey<Block> NEEDS_STONE_TOOL = createTag("needs_stone_tool");
        public static final TagKey<Block> INCORRECT_FOR_STONE_TOOL = createTag("incorrect_for_stone_tool");
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");
        public static final TagKey<Block> NEEDS_STRONG_BRONZE_TOOL = createTag("needs_strong_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_STRONG_BRONZE_TOOL = createTag("incorrect_for_strong_bronze_tool");
        public static final TagKey<Block> NEEDS_IRON_TOOL = createTag("needs_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_IRON_TOOL = createTag("incorrect_for_iron_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");
        public static final TagKey<Block> NEEDS_DIAMOND_TOOL = createTag("needs_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_DIAMOND_TOOL = createTag("incorrect_for_diamond_tool");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_TOOL = createTag("incorrect_for_netherite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(DavesCalamity.MOD_ID, name));
        }
    }
}
