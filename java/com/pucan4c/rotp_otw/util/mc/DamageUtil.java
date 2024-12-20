package com.pucan4c.rotp_otw.util.mc;

import com.pucan4c.rotp_otw.entity.FuelTruckEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;

public class DamageUtil {
    public static final String FUEL_TRUCK_MSG = "fuelTruck";

    public static DamageSource fuelTruckDamage(FuelTruckEntity entity) {
        return new EntityDamageSource(FUEL_TRUCK_MSG, entity).bypassArmor();
        }
}
