package net.attributeicons.mixin;

import net.spell_power.api.SpellSchools;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SpellSchools.class)
public class SpellSchoolsMixin {
    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void static_tail_BloodMagic(CallbackInfo ci) {
        SpellSchools.register(SpellSchools.createMagic("water", 10066363));
        SpellSchools.register(SpellSchools.createMagic("air", 14145495));
        SpellSchools.register(SpellSchools.createMagic("earth", 4868682));
        SpellSchools.register(SpellSchools.createMagic("blood", 0x8B0000));
        SpellSchools.register(SpellSchools.createMagic("unholy", 0x4B0082));
        SpellSchools.register(SpellSchools.createMagic("holy", 0xFFFFE0));
    }
}
