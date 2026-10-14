Java
package com.example.mixin;

import com.example.LapisSpawnerBlockEntity;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.LapisBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LapisBlock.class)
public abstract class LapisBlockMixin implements BlockEntityProvider {
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LapisSpawnerBlockEntity(pos, state);
    }
}
