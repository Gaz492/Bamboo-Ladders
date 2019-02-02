package uk.gaz492.bambooladders.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import uk.gaz492.bambooladders.util.IClimbable;

@Mixin(Block.class)
public abstract class MixinBlock implements IClimbable {
    @Override
    public boolean canClimb(LivingEntity entity, BlockState state, BlockPos pos){
        return false;
    }
}
