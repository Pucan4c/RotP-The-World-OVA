package com.pucan4c.rotp_otw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.punch.StandEntityPunch;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.util.mc.damage.StandEntityDamageSource;
import net.minecraft.entity.Entity;

public class OTWSmash extends StandEntityHeavyAttack {

    public OTWSmash(Builder builder) {super(builder);
    }

    @Override
    public StandEntityPunch punchEntity(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
        return super.punchEntity(stand, target, dmgSource)
                .addKnockback(3.5F + stand.getLastHeavyFinisherValue())
                .knockbackYRotDeg(0)
                .knockbackXRot(-10)
                .disableBlocking((float) stand.getProximityRatio(target) - 0.25F);
    }
}
