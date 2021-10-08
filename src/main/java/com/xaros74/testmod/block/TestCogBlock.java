package com.xaros74.testmod.block;

import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import com.xaros74.testmod.index.AllTilesEntities;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class TestCogBlock extends CogWheelBlock{

	public TestCogBlock(boolean large, Properties properties) {
		super(large, properties);
	}
	
	@Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return AllTilesEntities.TEST.create();
    }

}
