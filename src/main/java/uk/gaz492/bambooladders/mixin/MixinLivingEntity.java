package uk.gaz492.bambooladders.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import uk.gaz492.bambooladders.blocks.BlockBambooLadder;
import uk.gaz492.bambooladders.util.IClimbable;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {

    @Inject(method = "canClimb", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;getBlock()Lnet/minecraft/block/Block;", shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILHARD, cancellable = true)
    public void canClimb(CallbackInfoReturnable<Boolean> cir, final BlockState state) {

        if(state.getBlock() instanceof BlockBambooLadder){
            final IClimbable climbable = (IClimbable) state.getBlock();
            final LivingEntity thisLivingEntity = (LivingEntity) (Object) this;
            cir.setReturnValue(climbable.canClimb(thisLivingEntity, state, thisLivingEntity.getPos()));
        }
    }
}
