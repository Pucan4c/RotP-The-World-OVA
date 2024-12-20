package com.pucan4c.rotp_otw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.punch.StandEntityPunch;
import com.github.standobyte.jojo.capability.entity.EntityUtilCap;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.damage.StandEntityDamageSource;
import com.pucan4c.rotp_otw.init.InitSounds;
import net.minecraft.entity.Entity;

public class OTWHeavyPunch extends StandEntityHeavyAttack {

    public OTWHeavyPunch(Builder builder) {
        super(builder);
    }

    @Override
    public StandEntityPunch punchEntity(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
        return new TheWorldHeavyPunchInstance(stand, target, dmgSource)
                .copyProperties(super.punchEntity(stand, target, dmgSource))
                .armorPiercing((float) stand.getAttackDamage() * 0.01F)
                .knockbackYRotDeg(-90F)
                .knockbackXRot(0F)
                .addKnockback(5)
                .impactSound(InitSounds.OTW_PUNCH_HEAVY);
    }



    public static class TheWorldHeavyPunchInstance extends HeavyPunchInstance {

        public TheWorldHeavyPunchInstance(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
            super(stand, target, dmgSource);
        }

        @Override
        protected void afterAttack(StandEntity stand, Entity target, StandEntityDamageSource dmgSource, StandEntityTask task, boolean hurt, boolean killed) {
            if (!stand.level.isClientSide() && hurt && !target.canUpdate()) {
                EntityUtilCap.queueOnTimeResume(target, () -> target.playSound(ModSounds.THE_WORLD_PUNCH_HEAVY_TS_IMPACT.get(), 1.0F, 1.0F));
            }
            super.afterAttack(stand, target, dmgSource, task, hurt, killed);
        }
    }
}
