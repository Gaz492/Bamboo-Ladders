package uk.gaz492.bambooladders;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static uk.gaz492.bambooladders.util.ModInfo.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class BambooLaddersEventHandler {

    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event){
        event.getRegistry().register(BambooLadders.bambooLadder.setRegistryName(MOD_ID, "bamboo_ladder"));
    }

    @SubscribeEvent
    public static void onItemRegisrty(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new BlockItem(BambooLadders.bambooLadder, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BambooLadders.bambooLadder.getRegistryName()));
    }
}
