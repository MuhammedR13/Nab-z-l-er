package net.craftphone;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class PhoneScreen extends Screen {
    public PhoneScreen() { super(Text.literal("Akıllı Telefon")); }

    @Override
    protected void init() {
        this.addDrawableChild(ButtonWidget.builder(Text.literal("💳 Banka"), b -> {}).dimensions(this.width / 2 - 40, this.height / 2 - 20, 80, 20).build());
    }
}