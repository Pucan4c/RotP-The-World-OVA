package com.pucan4c.rotp_otw.init;

import com.pucan4c.rotp_otw.RotpOTWA;

import java.util.function.Supplier;
import com.github.standobyte.jojo.util.mc.MultiSoundEvent;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            ForgeRegistries.SOUND_EVENTS, RotpOTWA.MOD_ID);

    public static final RegistryObject<SoundEvent> OTW_SUMMON = SOUNDS.register("otw_summon",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_summon"))
    );
    public static final RegistryObject<SoundEvent> OTW_UNSUMMON = SOUNDS.register("otw_unsummon",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_unsummon"))
    );
    public static final Supplier<SoundEvent> OTW_PUNCH = SOUNDS.register("otw_punch",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_punch"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_THE_WORLD = SOUNDS.register("diova_the_world",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_the_world"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_DIE = SOUNDS.register("diova_die",
            () -> new MultiSoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_die"), new ResourceLocation(RotpOTWA.MOD_ID, "diova_die_2"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_TIME_STOP = SOUNDS.register("diova_time_stop",
            () -> new MultiSoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_time_stop"), new ResourceLocation(RotpOTWA.MOD_ID, "diova_time_stop_2"), new ResourceLocation(RotpOTWA.MOD_ID, "diova_time_stop_3"), new ResourceLocation(RotpOTWA.MOD_ID, "diova_toki_yo_tomare"), new ResourceLocation(RotpOTWA.MOD_ID, "diova_tomare_toki_yo"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_TIME_RESUMES = SOUNDS.register("diova_time_resumes",
            () -> new MultiSoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_time_resumes"),
                  new ResourceLocation(RotpOTWA.MOD_ID, "diova_time_resumes_2"), new ResourceLocation(RotpOTWA.MOD_ID, "diova_time_resumes_3"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_TIMES_UP = SOUNDS.register("diova_times_up",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_times_up"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_CANT_MOVE = SOUNDS.register("diova_cant_move",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_cant_move"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_FUEL_TRUCK = SOUNDS.register("diova_fuel_truck",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_fuel_truck"))
    );
    public static final RegistryObject<SoundEvent> OTW_TIME_STOP = SOUNDS.register("otw_time_stop",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_time_stop"))
    );
    public static final RegistryObject<SoundEvent> OTW_TIME_RESUME = SOUNDS.register("otw_time_resume",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_time_resume"))
    );
    public static final RegistryObject<SoundEvent> OTW_TIME_STOP_BLINK = SOUNDS.register("otw_ts_blink",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_time_stop_blink"))
    );
    public static final RegistryObject<SoundEvent> OTW_TIME_STOP_UNREVEALED = SOUNDS.register("otw_time_stop_unrevealed",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_time_stop_unrevealed"))
    );
    public static final Supplier<SoundEvent> OTW_PUNCH_HEAVY = SOUNDS.register("otw_punch_heavy",
            () -> new MultiSoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_heavy_punch"))
    );
    public static final Supplier<SoundEvent> OTW_HEAVY_PUNCH = SOUNDS.register("otw_punch_heavy",
            () -> new MultiSoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_punch_heavy"))
    );
    public static final Supplier<SoundEvent> OTW_BARRAGE = SOUNDS.register("otw_barrage",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_barrage"))
    );
    public static final Supplier<SoundEvent> OTW_ULTRA_PUNCH = SOUNDS.register("otw_ultra_punch",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_ultra_punch"))
    );
    public static final RegistryObject<SoundEvent> OTW_BARRAGE_HIT = SOUNDS.register("otw_barrage_hit",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_barrage_hit"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_BARRAGE = SOUNDS.register("diova_barrage",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_barrage"))
    );
    public static final RegistryObject<SoundEvent> DIOVA_APPEAR = SOUNDS.register("diova_appear",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "diova_appear"))
    );
    public static final RegistryObject<SoundEvent> OTW_ZOOM = SOUNDS.register("otw_zoom",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_zoom"))
    );
    public static final RegistryObject<SoundEvent> OTW_ZOOM_CLICK = SOUNDS.register("otw_zoom_click",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "otw_zoom_click"))
    );
    public static final RegistryObject<SoundEvent> FUEL_TRUCK_HIT = SOUNDS.register("fuel_truck_hit",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "fuel_truck_hit"))
    );
    public static final RegistryObject<SoundEvent> FUEL_TRUCK_LAND = SOUNDS.register("fuel_truck_land",
            () -> new SoundEvent(new ResourceLocation(RotpOTWA.MOD_ID, "fuel_truck_land"))
    );
    public static final OstSoundList OTW_OST = new OstSoundList(
            new ResourceLocation(RotpOTWA.MOD_ID, "otw_ost"), SOUNDS);
}
