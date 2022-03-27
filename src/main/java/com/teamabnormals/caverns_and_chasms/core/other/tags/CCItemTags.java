package com.teamabnormals.caverns_and_chasms.core.other.tags;

import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.caverns_and_chasms.core.CavernsAndChasms;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CCItemTags {
	public static final TagKey<Item> IGNORE_RAIL_PLACEMENT = itemTag("ignore_rail_placement");
	public static final TagKey<Item> CUPRIC_FIRE_BASE_ITEMS = itemTag("cupric_fire_base_items");
	public static final TagKey<Item> AFFLICTION_ITEMS = itemTag("affliction_items");
	public static final TagKey<Item> EXPERIENCE_BOOST_ITEMS = itemTag("experience_boost_items");
	public static final TagKey<Item> SILVER_ORES = itemTag("silver_ores");
	public static final TagKey<Item> SPINEL_ORES = itemTag("spinel_ores");
	public static final TagKey<Item> SILVER_GEAR = itemTag("silver_gear");
	public static final TagKey<Item> NECROMIUM_GEAR = itemTag("necromium_gear");
	public static final TagKey<Item> AZALEA_LOGS = itemTag("azalea_logs");

	public static final TagKey<Item> RAT_FOOD = itemTag("rat_food");
	public static final TagKey<Item> RAT_TAME_ITEMS = itemTag("rat_tame_items");

	public static final TagKey<Item> INGOTS_NECROMIUM = TagUtil.itemTag("forge", "ingots/necromium");
	public static final TagKey<Item> INGOTS_SILVER = TagUtil.itemTag("forge", "ingots/silver");

	public static final TagKey<Item> RAW_MATERIALS_SILVER = TagUtil.itemTag("forge", "raw_materials/silver");

	public static final TagKey<Item> NUGGETS_COPPER = TagUtil.itemTag("forge", "nuggets/copper");
	public static final TagKey<Item> NUGGETS_SILVER = TagUtil.itemTag("forge", "nuggets/silver");
	public static final TagKey<Item> NUGGETS_NECROMIUM = TagUtil.itemTag("forge", "nuggets/necromium");

	public static final TagKey<Item> RAW_FISHES = TagUtil.itemTag("forge", "raw_fishes");
	public static final TagKey<Item> RAW_FISHES_CAVEFISH = TagUtil.itemTag("forge", "raw_fishes/cavefish");
	public static final TagKey<Item> COOKED_FISHES = TagUtil.itemTag("forge", "cooked_fishes");
	public static final TagKey<Item> COOKED_FISHES_CAVEFISH = TagUtil.itemTag("forge", "cooked_fishes/cavefish");

	public static final TagKey<Item> ORES_AMETHYST = TagUtil.itemTag("forge", "ores/amethyst");
	public static final TagKey<Item> ORES_SILVER = TagUtil.itemTag("forge", "ores/silver");
	public static final TagKey<Item> ORES_SPINEL = TagUtil.itemTag("forge", "ores/spinel");

	public static final TagKey<Item> STORAGE_BLOCKS_SILVER = TagUtil.itemTag("forge", "storage_blocks/silver");
	public static final TagKey<Item> STORAGE_BLOCKS_SPINEL = TagUtil.itemTag("forge", "storage_blocks/spinel");
	public static final TagKey<Item> STORAGE_BLOCKS_NECROMIUM = TagUtil.itemTag("forge", "storage_blocks/necromium");
	public static final TagKey<Item> STORAGE_BLOCKS_RAW_SILVER = TagUtil.itemTag("forge", "storage_blocks/raw_silver");

	public static final TagKey<Item> TOOLS_PICKAXES = TagUtil.itemTag("forge", "tools/pickaxes");
	public static final TagKey<Item> TOOLS_AXES = TagUtil.itemTag("forge", "tools/axes");
	public static final TagKey<Item> TOOLS_SHOVELS = TagUtil.itemTag("forge", "tools/shovels");

	private static TagKey<Item> itemTag(String name) {
		return TagUtil.itemTag(CavernsAndChasms.MOD_ID, name);
	}
}