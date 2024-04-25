package com.ordana.molten_metals.fluids;

import com.ordana.molten_metals.MoltenMetals;
import com.ordana.molten_metals.reg.ModFluids;
import com.ordana.molten_metals.reg.ModItems;
import net.mehvahdjukaar.moonlight.api.client.ModFluidRenderProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class MoltenNecromiumFluid extends MoltenMetalFluid {

    public MoltenNecromiumFluid(Properties properties, Supplier<? extends LiquidBlock> block) {
        super(properties, block);
    }

    @Override
    public ModFluidRenderProperties createRenderProperties() {
        return new MoltenMetalRenderer(
                MoltenMetals.res("block/molten_necromium"),
                MoltenMetals.res("block/molten_necromium_flowing"),
                -1,
                MoltenMetals.res("block/molten_necromium_flowing"),
                MoltenMetals.res("block/molten_necromium_flowing"),
                new Vec3(133, 0, 0));

    }

    @NotNull
    public Fluid getFlowing() {
        return ModFluids.FLOWING_MOLTEN_NECROMIUM.get();
    }

    @NotNull
    public Fluid getSource() {
        return ModFluids.MOLTEN_NECROMIUM.get();
    }

    @NotNull
    public Item getBucket() {
        return ModItems.MOLTEN_NECROMIUM_BUCKET.get();
    }


    public static class Flowing extends MoltenNecromiumFluid {
        public Flowing(Properties properties, Supplier<? extends LiquidBlock> block) {
            super(properties, block);
        }

        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(@NotNull FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(@NotNull FluidState state) {
            return false;
        }
    }

    public static class Source extends MoltenNecromiumFluid {
        public Source(Properties properties, Supplier<? extends LiquidBlock> block) {
            super(properties, block);
        }

        @Override
        public int getAmount(@NotNull FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(@NotNull FluidState state) {
            return true;
        }
    }
}