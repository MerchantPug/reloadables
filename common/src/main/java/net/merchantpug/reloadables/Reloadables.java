package net.merchantpug.reloadables;

import dev.greenhouseteam.rdpr.api.IReloadableRegistryCreationHelper;
import net.minecraft.core.registries.Registries;

public class Reloadables {

	public static final String MOD_ID = "reloadables";

	public static void registerReloadables(IReloadableRegistryCreationHelper helper) {
		helper.fromExistingRegistry(Registries.CHAT_TYPE);
		helper.fromExistingRegistry(Registries.TRIM_PATTERN);
		helper.fromExistingRegistry(Registries.TRIM_MATERIAL);
		helper.fromExistingRegistry(Registries.DAMAGE_TYPE);
	}
}