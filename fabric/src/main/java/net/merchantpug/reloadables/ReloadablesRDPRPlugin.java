package net.merchantpug.reloadables;

import dev.greenhouseteam.rdpr.api.IReloadableRegistryCreationHelper;
import dev.greenhouseteam.rdpr.api.entrypoint.ReloadableRegistryPlugin;

public class ReloadablesRDPRPlugin implements ReloadableRegistryPlugin {

    @Override
    public void createContents(IReloadableRegistryCreationHelper helper) {
        Reloadables.registerReloadables(helper);
    }
}
