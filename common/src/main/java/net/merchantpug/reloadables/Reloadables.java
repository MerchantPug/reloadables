package net.merchantpug.reloadables;

import dev.greenhouseteam.rdpr.api.IReloadableRegistryCreationHelper;
import net.minecraft.core.registries.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reloadables {

	public static final String MOD_ID = "reloadables";
	public static final String MOD_NAME = "Reloadables";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	public static void registerReloadables(IReloadableRegistryCreationHelper helper) {
		helper.fromExistingRegistry(Registries.CHAT_TYPE);
		helper.fromExistingRegistry(Registries.TRIM_PATTERN);
		helper.fromExistingRegistry(Registries.TRIM_MATERIAL);
		helper.fromExistingRegistry(Registries.DAMAGE_TYPE);
	}
}