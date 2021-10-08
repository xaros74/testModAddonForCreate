package com.xaros74.testmod.index;

import com.simibubi.create.content.contraptions.base.KineticTileEntityRenderer;
import com.simibubi.create.content.contraptions.base.SingleRotatingInstance;
import com.simibubi.create.repack.registrate.util.entry.TileEntityEntry;
import com.xaros74.testmod.TestMod;
import com.xaros74.testmod.tiles.TestTile;

public class AllTilesEntities {

	public static final TileEntityEntry<TestTile> TEST = TestMod.registrate()
			.tileEntity("simple_kinetic", TestTile::new).instance(() -> SingleRotatingInstance::new)
			.validBlocks(AllModBlocks.OAK_COGWHEEL, AllModBlocks.ACACIA_COGWHEEL, AllModBlocks.BIRCH_COGWHEEL,
					AllModBlocks.CRIMSON_COGWHEEL, AllModBlocks.DARK_OAK_COGWHEEL, AllModBlocks.JUNGLE_COGWHEEL,
					AllModBlocks.WARPED_COGWHEEL, AllModBlocks.LARGE_OAK_COGWHEEL, AllModBlocks.LARGE_BIRCH_COGWHEEL,
					AllModBlocks.LARGE_ACACIA_COGWHEEL, AllModBlocks.LARGE_DARK_OAK_COGWHEEL,
					AllModBlocks.LARGE_CRIMSON_COGWHEEL, AllModBlocks.LARGE_WARPED_COGWHEEL)
			.renderer(() -> KineticTileEntityRenderer::new).register();

	public static void register() {
	}

}
