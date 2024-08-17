package com.studiopulsar.feintha.tfwarsnoveau.mixin;

import com.hollingsworth.arsnouveau.common.block.SourceBerryBush;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.javafmlmod.FMLModContainer;
import net.minecraftforge.versions.mcp.MCPVersion;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;

import javax.annotation.ParametersAreNonnullByDefault;

@Pseudo
@Mixin(SourceBerryBush.class)
public abstract class BushBlockMixin extends BushBlock {
    public BushBlockMixin(Properties p_51021_) {
        super(p_51021_);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
        return super.mayPlaceOn(p_51042_, p_51043_, p_51044_) || p_51042_.is(TagKey.create(Registries.BLOCK, new ResourceLocation("tfc:rock/gravel"))) || p_51042_.is(TagKey.create(Registries.BLOCK, new ResourceLocation("tfc:grass")));
    }
}
