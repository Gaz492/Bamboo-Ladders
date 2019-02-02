package uk.gaz492.bambooladders.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.LadderBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import uk.gaz492.bambooladders.util.IClimbable;

@Mixin(LadderBlock.class)
public abstract class MixinLadderBlock implements IClimbable {

    @Override
    public boolean canClimb(LivingEntity entity, BlockState state, BlockPos pos){
        return true;
    }

    @Override
    public String getFallDeathSuffix(){
        return "ladder";
    }
}
