package com.greekoasc.nvidiumplus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// Targeting the main Nvidium class where the activity check is performed
@Mixin(targets = "me.cortex.nvidium.Nvidium", remap = false)
public class NvidiumShaderCheckMixin {

    /**
     * Bypasses Nvidium's internal check that disables it when Iris or other Shaders are found.
     * We force it to return true so Nvidium stays active.
     */
    @Inject(method = "isActive", at = @At("HEAD"), cancellable = true)
    private static void forceNvidiumActive(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
