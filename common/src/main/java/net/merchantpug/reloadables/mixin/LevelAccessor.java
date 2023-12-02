package net.merchantpug.reloadables.mixin;

import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Level.class)
public interface LevelAccessor {
    @Accessor("damageSources") @Mutable @Final
    void reloadables$setDamageSources(DamageSources damageSources);
}
