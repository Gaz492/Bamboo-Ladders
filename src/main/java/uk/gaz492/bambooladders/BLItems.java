package uk.gaz492.bambooladders;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import uk.gaz492.bambooladders.util.ModInfo;

public class BLItems {

    public static Item bambooLadder;

    private final Settings defaultSettings = new Item.Settings().group(ItemGroup.DECORATIONS);

    BLItems(BambooLadders mod) {
        bambooLadder = this.register("bamboo_ladder", mod.blocks.bambooLadder, this.defaultSettings);
    }

    private Item register (String id, Block block, Settings settings){
        return Registry.ITEM.add(new Identifier(ModInfo.ID, id), new BlockItem(block, settings));
    }
}
