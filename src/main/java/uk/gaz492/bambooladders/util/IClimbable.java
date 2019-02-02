package uk.gaz492.bambooladders.util;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public interface IClimbable {

    boolean canClimb(LivingEntity entity, BlockState state, BlockPos pos);

    default String getFallDeathSuffix(){
        return "generic";
    }
}
