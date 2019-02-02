package uk.gaz492.bambooladders;

import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import uk.gaz492.bambooladders.blocks.BlockBambooLadder;
import uk.gaz492.bambooladders.util.ModInfo;

public class BLBlocks {

    public final Block bambooLadder;

    BLBlocks(BambooLadders mod){
        this.bambooLadder = this.register("bamboo_ladder", new BlockBambooLadder(FabricBlockSettings.of(Material.PART).sounds(BlockSoundGroup.LADDER).build()));
    }

    private Block register(String id, Block block) {
        return Registry.BLOCK.register(new Identifier(ModInfo.ID, id), block);
    }
}
