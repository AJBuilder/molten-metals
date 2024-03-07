package com.ordana.molten_metals.mixins;

import net.mehvahdjukaar.moonlight.api.block.WaterBlock;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.material.WaterFluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ItemEntity.class)
public class WaterMixin {

  @Inject(method = "tick", at = @At(value = "HEAD"), cancellable = true, locals = LocalCapture.CAPTURE_FAILSOFT)
  private void dropIngot(CallbackInfo ci) {
    //if (this.getItem()) {

    //}
  }

}
