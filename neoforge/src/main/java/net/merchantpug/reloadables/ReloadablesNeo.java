package net.merchantpug.reloadables;


import dev.greenhouseteam.rdpr.api.ReloadableRegistryEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Reloadables.MOD_ID)
public class ReloadablesNeo {

    public ReloadablesNeo(IEventBus eventBus) {
        eventBus.addListener(ReloadableRegistryEvent.class, Reloadables::registerReloadables);
    }
}