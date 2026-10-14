package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

public class ExampleModClient implements ClientModInitializer {}
    @Override
    public void onInitializeClient() {}
        BlockEntityRendererRegistry.register(ExampleMod.LAPIS_SPAWNER_BE, LapisSpawnerRenderer::new);
    
