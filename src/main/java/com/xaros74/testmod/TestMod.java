package com.xaros74.testmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.NonNullLazyValue;
import com.xaros74.testmod.groups.TestGroup;
import com.xaros74.testmod.index.AllModBlocks;
import com.xaros74.testmod.index.AllTilesEntities;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestMod.MODID)
public class TestMod {

	// Directly reference a log4j logger.
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "testmod";
	private static final NonNullLazyValue<CreateRegistrate> registrate = CreateRegistrate.lazy(TestMod.MODID);

	public TestMod() {

	

		// Register the setup method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		// Register the enqueueIMC method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
		// Register the processIMC method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
		// Register the doClientStuff method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);

		new TestGroup("test_group");
		
		
		
		AllModBlocks.register();
		AllTilesEntities.register();
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("this is setup");	
	}
	
	private void doClientStuff(final FMLClientSetupEvent event) {
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {

	}

	private void processIMC(final InterModProcessEvent event) {

	}

	@SuppressWarnings("deprecation")
	public static CreateRegistrate registrate() {
		return registrate.get();
	}

}
