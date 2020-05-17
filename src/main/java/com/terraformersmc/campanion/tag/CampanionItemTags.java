package com.terraformersmc.campanion.tag;

import com.terraformersmc.campanion.Campanion;
import com.terraformersmc.campanion.mixin.AccessorItemTags;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;

public class CampanionItemTags {
	public static final Tag.Identified<Item> MARSHMALLOWS = get("marshmallows");
	public static final Tag.Identified<Item> MELTED_MARSHMALLOWS = get("melted_marshmallows");
	public static final Tag.Identified<Item> MARSHMALLOWS_ON_STICKS = get("marshmallows_on_sticks");
	public static final Tag.Identified<Item> SPEARS = get("spears");
	public static final Tag.Identified<Item> BACKPACKS = get("backpacks");
	public static final Tag.Identified<Item> LAWN_CHAIRS = get("lawn_chairs");

	public static final Tag.Identified<Item> TENT_SIDES = get("tent_sides");
	public static final Tag.Identified<Item> TENT_TOPS = get("tent_tops");
	public static final Tag.Identified<Item> FLAT_TENT_TOPS = get("flat_tent_tops");
	public static final Tag.Identified<Item> TOPPED_TENT_POLES = get("topped_tent_poles");
	public static final Tag.Identified<Item> TENT_POLES = get("tent_poles");

	public static final Tag.Identified<Item> FRUITS = get("fruits");
	public static final Tag.Identified<Item> GRAINS = get("grains");
	public static final Tag.Identified<Item> PROTEINS = get("proteins");
	public static final Tag.Identified<Item> VEGETABLES = get("vegetables");
	public static final Tag.Identified<Item> MRE_COMPONENTS = get("mre_components");

	private static Tag.Identified<Item> get(String id) {
		return AccessorItemTags.callRegister(Campanion.MOD_ID + ":" + id);
	}

	public static void load() {
	}
}
