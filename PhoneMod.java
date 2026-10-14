package net.craftphone;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PhoneMod implements ModInitializer {
    public static final String MOD_ID = "craftphone";
    public static final Item SMARTPHONE = new PhoneItem(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "smartphone"), SMARTPHONE);
    }
}