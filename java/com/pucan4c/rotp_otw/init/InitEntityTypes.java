package com.pucan4c.rotp_otw.init;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.pucan4c.rotp_otw.RotpOTWA;
import org.apache.commons.lang3.tuple.Pair;

import com.pucan4c.rotp_otw.entity.FuelTruckEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = RotpOTWA.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class InitEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, RotpOTWA.MOD_ID);
    private static final List<Pair<? extends Supplier<? extends EntityType<? extends LivingEntity>>, Supplier<AttributeModifierMap>>> livingAttributesSupplier = new ArrayList<>();

    public static final RegistryObject<EntityType<FuelTruckEntity>> FUEL_TRUCK = ENTITIES.register("fuel_truck",
            () -> EntityType.Builder.<FuelTruckEntity>of(FuelTruckEntity::new, EntityClassification.MISC).sized(4.0F, 2.0F).setUpdateInterval(10)
            .build(new ResourceLocation(RotpOTWA.MOD_ID, "fuel_truck").toString()));

    private static <T extends LivingEntity> void withLivingAttributes(RegistryObject<EntityType<T>> regObject, Supplier<AttributeModifierMap> attributes) {
        livingAttributesSupplier.add(Pair.of(regObject, attributes));
    }

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        for (Pair<? extends Supplier<? extends EntityType<? extends LivingEntity>>, Supplier<AttributeModifierMap>> entry : livingAttributesSupplier) {
            event.put(entry.getKey().get(), entry.getValue().get());
        }
    }
}
