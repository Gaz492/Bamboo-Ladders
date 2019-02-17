package uk.gaz492.bambooladders.util;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public interface IClimbable {

    default boolean canClimb(LivingEntity entity, BlockState state, BlockPos pos){
        return true;
    }
}
