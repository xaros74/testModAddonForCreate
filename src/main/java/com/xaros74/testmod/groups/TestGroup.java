package com.xaros74.testmod.groups;

import com.xaros74.testmod.TestMod;
import com.xaros74.testmod.index.AllModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TestGroup extends ItemGroup {
	
	public static TestGroup TEST_GROUP;
	public TestGroup(String label) {
		super(TestMod.MODID +"." + label);
		TEST_GROUP = this;
		
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(AllModBlocks.OAK_COGWHEEL.get());
	}

}
