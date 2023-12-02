package net.merchantpug.reloadables.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSources;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Collection;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {
    @Shadow public abstract Iterable<ServerLevel> getAllLevels();

    // As damage types are cached, we must create a new cache upon /reload.
    @Inject(method = "lambda$reloadResources$27", at = @At("TAIL"))
    private void reloadables$resetDamageTypeCaches(Collection collection, MinecraftServer.ReloadableResources reloadableResources, CallbackInfo ci) {
        this.getAllLevels().forEach(level -> ((LevelAccessor)level).reloadables$setDamageSources(new DamageSources(level.registryAccess())));
    }
}
