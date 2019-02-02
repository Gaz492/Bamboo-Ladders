package uk.gaz492.bambooladders;

import net.fabricmc.api.ModInitializer;

public class BambooLadders implements ModInitializer {

	public BLBlocks blocks;
	public BLItems items;

	@Override
	public void onInitialize() {
		this.blocks = new BLBlocks(this);
		this.items = new BLItems(this);
	}
}
