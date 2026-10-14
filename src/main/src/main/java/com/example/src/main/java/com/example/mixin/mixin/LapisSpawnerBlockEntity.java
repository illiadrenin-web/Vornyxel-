Java
package com.example;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class LapisSpawnerBlockEntity extends BlockEntity {
    public LapisSpawnerBlockEntity(BlockPos pos, BlockState state) {
        super(ExampleMod.LAPIS_SPAWNER_BE, pos, state);
    }
