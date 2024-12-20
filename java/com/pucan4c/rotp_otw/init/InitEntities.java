package com.pucan4c.rotp_otw.init;

import com.pucan4c.rotp_otw.RotpOTWA;
import com.pucan4c.rotp_otw.entity.FuelTruckEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITIES, RotpOTWA.MOD_ID);
    
    
    
    public static final RegistryObject<EntityType<FuelTruckEntity>> FUEL_TRUCK = ENTITIES.register("fuel_truck",
            () -> EntityType.Builder.<FuelTruckEntity>of(FuelTruckEntity::new, EntityClassification.MISC)
            .sized(1.0F, 1.0F)
            .build(RotpOTWA.MOD_ID + ":fuel_truck"));
};
