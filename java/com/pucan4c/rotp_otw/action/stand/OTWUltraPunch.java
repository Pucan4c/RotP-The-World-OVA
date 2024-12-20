package com.pucan4c.rotp_otw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.punch.StandEntityPunch;
import com.github.standobyte.jojo.capability.entity.EntityUtilCap;
import com.github.standobyte.jojo.entity.stand.*;
import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.damage.StandEntityDamageSource;
import net.minecraft.entity.Entity;

import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;


public class OTWUltraPunch extends StandEntityHeavyAttack {
    public static final StandPose ULTRA_PUNCH = new StandPose("ultra_punch");


    public OTWUltraPunch(Builder builder) {
        super(builder);
    }


    @Override
    public StandEntityPunch punchEntity(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
        return new TheWorldOvaHeavyPunchInstance(stand, target, dmgSource)
                .copyProperties(super.punchEntity(stand, target, dmgSource))
                .armorPiercing((float) stand.getAttackDamage() * 0.01F)
                .addKnockback(14F)
                .knockbackXRot(-2)
                .disableBlocking((float) stand.getProximityRatio(target) - 0.25F)
                .impactSound(ModSounds.THE_WORLD_PUNCH_HEAVY_ENTITY);
    }





    public static class TheWorldOvaHeavyPunchInstance extends HeavyPunchInstance {

        public TheWorldOvaHeavyPunchInstance(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
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

