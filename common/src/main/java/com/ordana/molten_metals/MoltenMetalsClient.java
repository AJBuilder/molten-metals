package com.ordana.molten_metals;

import com.ordana.molten_metals.reg.ModFluids;
import net.mehvahdjukaar.moonlight.api.platform.ClientPlatformHelper;
import net.minecraft.client.renderer.RenderType;

public class MoltenMetalsClient {


    public static void init() {
        ClientPlatformHelper.addClientSetup(MoltenMetalsClient::setup);
    }

    private static boolean finishedSetup = false;

    public static void setup() {
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_IRON.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_IRON.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_COPPER.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_COPPER.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_GOLD.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_GOLD.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_NETHERITE.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_NETHERITE.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_ZINC.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_ZINC.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_BRASS.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_BRASS.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_BISMUTH.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_BISMUTH.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_MERCURY.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_MERCURY.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_SILVER.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_SILVER.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_ELECTRUM.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_ELECTRUM.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_NECROMIUM.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_NECROMIUM.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_TIN.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_TIN.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_BRONZE.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_BRONZE.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.MOLTEN_STEEL.get(), RenderType.translucent());
        ClientPlatformHelper.registerFluidRenderType(ModFluids.FLOWING_MOLTEN_STEEL.get(), RenderType.translucent());
        finishedSetup = true;
    }

    public static void checkIfFailed() {
        if(!finishedSetup){
            throw new RuntimeException("Failed to run client setup. This is likely due to the mod integration code being outdated, crashing with other mods new versions. Terminating");
        }
    }
}