package com.pucan4c.rotp_otw.action.stand;

import com.github.standobyte.jojo.action.stand.TimeStop;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;

public class OTWTimeStop extends TimeStop {

    public OTWTimeStop(Builder builder) {
        super(builder);
    }
    public static final StandPose TIME_STOP = new StandPose("time_stop");
    @Override
    protected boolean autoSummonStand(IStandPower power) {
        return super.autoSummonStand(power) || power.getResolveLevel() < 3;
    }

    @Override
    public int getHoldDurationToFire(IStandPower power) {
        int baseDuration = super.getHoldDurationToFire(power);
        if (!power.isUserCreative() && power.getUser() != null) {
            LivingEntity user = power.getUser();
            baseDuration = MathHelper.ceil((float)  baseDuration * user.getHealth() / user.getMaxHealth());
        }
        return baseDuration;
    }
    
    private int shortenedHoldDuration(IStandPower power, int ticks) {
        return ticks > 0 && power.getResolveLevel() >= 4 ? 20 : ticks;
    }
    
    @Override
    public boolean cancelHeldOnGettingAttacked(IStandPower power, DamageSource dmgSource, float dmgAmount) {
        return true;
    }
}
