package net.dave.davesCalamity;

import com.mojang.logging.LogUtils;
import net.dave.davesCalamity.armor.ModArmorMaterials;
import net.dave.davesCalamity.block.ModBlocks;
import net.dave.davesCalamity.block.custom.PlantBlock;
import net.dave.davesCalamity.component.ModDataComponent;
import net.dave.davesCalamity.effect.ModEffects;
import net.dave.davesCalamity.entity.ModEntities;
import net.dave.davesCalamity.entity.client.Mandrake.MandrakeRenderer;
import net.dave.davesCalamity.entity.client.SandScorpoin.SandScorpionRenderer;
import net.dave.davesCalamity.entity.client.Walker.ZombieWalkerRenderer;
import net.dave.davesCalamity.item.ModCreativeModeTabs;
import net.dave.davesCalamity.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import net.minecraft.world.entity.SpawnPlacements;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(DavesCalamity.MOD_ID)
public class DavesCalamity
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "davescalamity";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public DavesCalamity()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Effects
        ModEffects.EFFECTS.register(modEventBus);
        // Tabs
        ModCreativeModeTabs.register(modEventBus);
        // Items
        ModItems.register(modEventBus);
        // Blocks
        ModBlocks.register(modEventBus);
        // Armor Materials
        ModArmorMaterials.ARMOR_MATERIALS.register(modEventBus);
        // Entities
        ModEntities.register(modEventBus);
        // Component
        ModDataComponent.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Make crops compostable
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.HOPS.get(), 0.5f);
            ComposterBlock.COMPOSTABLES.put(ModItems.HOPS_SEED.get(), 0.15f);
            ComposterBlock.COMPOSTABLES.put(ModItems.MANDRAKE.get(), 0.5f);
            ComposterBlock.COMPOSTABLES.put(ModItems.MANDRAKE_ROOT.get(), 0.15f);
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.MANDRAKE.get(), MandrakeRenderer::new);
            EntityRenderers.register(ModEntities.SAND_SCORPION.get(), SandScorpionRenderer::new);
            EntityRenderers.register(ModEntities.ZOMBIE_WALKER.get(), ZombieWalkerRenderer::new);

            event.enqueueWork(() -> {
                // Loop over every registered block in your mod
                ForgeRegistries.BLOCKS.getValues().forEach(block -> {
                    if (block instanceof PlantBlock) {
                        ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
                    }
                });
            });
        }
    }
}
