package com.pucan4c.rotp_otw.init;

import com.pucan4c.rotp_otw.entity.OTWEntity;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.*;
import com.github.standobyte.jojo.action.stand.StandEntityAction.Phase;
import com.github.standobyte.jojo.action.stand.TimeStopInstant;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance;
import com.github.standobyte.jojo.power.impl.stand.stats.TimeStopperStandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;
import com.pucan4c.rotp_otw.RotpOTWA;
import com.pucan4c.rotp_otw.action.stand.*;
import com.pucan4c.rotp_otw.action.stand.OTWSmash;

import com.github.standobyte.jojo.action.stand.TimeResume;
import com.github.standobyte.jojo.action.stand.TimeStop;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), RotpOTWA.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), RotpOTWA.MOD_ID);
    
 // ======================================== The World Ova ========================================
    public static final RegistryObject<StandEntityHeavyAttack> OTW_ULTRA_PUNCH = ACTIONS.register("otw_ultra_punch",
         () -> new OTWUltraPunch(new StandEntityHeavyAttack.Builder().holdToFire(30, false).staminaCost(350)
                    .resolveLevelToUnlock(3)
                    .standOffsetFromUser(-0.15, 0.75, 0)
                    .cooldown(1200)
                    .standPose(OTWUltraPunch.ULTRA_PUNCH)
                    .standSound(StandEntityAction.Phase.WINDUP, InitSounds.OTW_ULTRA_PUNCH)
                    .partsRequired(StandInstance.StandPart.ARMS))
    );

    public static final RegistryObject<StandEntityAction> OTW_PUNCH = ACTIONS.register("otw_punch",
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.OTW_PUNCH)
            )
    );

    public static final RegistryObject<StandEntityAction> OTW_BARRAGE = ACTIONS.register("otw_barrage",
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.OTW_BARRAGE)
                    .standSound(InitSounds.OTW_BARRAGE_HIT)
            )
    );

    public static final RegistryObject<StandEntityHeavyAttack> OTW_SMASH = ACTIONS.register("otw_smash",
            () -> new OTWSmash(new StandEntityHeavyAttack.Builder()
                    .standOffsetFromUser(0, 0.5, -0.5)
                    .punchSound(InitSounds.OTW_HEAVY_PUNCH)
                    .standPose(StandPose.HEAVY_ATTACK)
                    .partsRequired(StandInstance.StandPart.ARMS)
            )
    );

    public static final RegistryObject<StandEntityHeavyAttack> OTW_HEAVY_PUNCH = ACTIONS.register("otw_heavy_punch",
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .standOffsetFromUser(0.75, 0.75, 0.2)
                    .punchSound(InitSounds.OTW_HEAVY_PUNCH)
                    .standPose(StandPose.HEAVY_ATTACK)
                    .shout(InitSounds.DIOVA_DIE)
                    .partsRequired(StandInstance.StandPart.ARMS)
                    .setFinisherVariation(OTW_SMASH)
                    .shiftVariationOf(OTW_BARRAGE).shiftVariationOf(OTW_PUNCH)
            )
    );

    public static final RegistryObject<StandEntityAction> OTW_BLOCK = ACTIONS.register("otw_block",
            StandEntityBlock::new
    );

    public static final RegistryObject<TimeStop> OTW_TIME_STOP = ACTIONS.register("otw_time_stop",
            () -> new TheWorldTimeStop(new TimeStop.Builder().holdToFire(20, false).staminaCost(225).staminaCostTick(7.5F).heldWalkSpeed(0)
                    .resolveLevelToUnlock(3).isTrained()
                    .ignoresPerformerStun()
                    .shout(InitSounds.DIOVA_THE_WORLD)
                    .partsRequired(StandInstance.StandPart.MAIN_BODY)
                    .voiceLineWithStandSummoned(InitSounds.DIOVA_TIME_STOP).timeStopSound(InitSounds.OTW_TIME_STOP)
                    .addTimeResumeVoiceLine(InitSounds.DIOVA_TIME_RESUMES, true).addTimeResumeVoiceLine(InitSounds.DIOVA_TIMES_UP, false)
                    .timeResumeSound(InitSounds.OTW_TIME_RESUME)
                    .shaderEffect(new ResourceLocation(RotpOTWA.MOD_ID, "shaders/post/time_stop_tw_ova.json"), true)
                    .shaderEffect(new ResourceLocation(RotpOTWA.MOD_ID, "shaders/post/time_stop_tw_ova_old.json"), false)));

    public static final RegistryObject<TimeResume> OTW_TIME_RESUME = ACTIONS.register("otw_time_resume",
            () -> new TimeResume(new StandAction.Builder().shiftVariationOf(OTW_TIME_STOP)));
    public static final RegistryObject<TimeStopInstant> OTW_TIME_STOP_BLINK = ACTIONS.register("otw_ts_blink",
            () -> new TimeStopInstant(new TimeStopInstant.Builder()
                    .resolveLevelToUnlock(2).isTrained()
                    .ignoresPerformerStun()
                    .partsRequired(StandInstance.StandPart.MAIN_BODY),
                    OTW_TIME_STOP, InitSounds.OTW_TIME_STOP_BLINK,
                    true)
    );

//    public static final RegistryObject<TheWorldOvaTSHeavyAttack> OTW_TS_HEAVY_ATTACK = ACTIONS.register("otw_ts_heavy_attack",
//            () -> new TheWorldOvaTSHeavyAttack(new StandEntityAction.Builder().staminaCost(StandEntityHeavyAttack.DEFAULT_STAMINA_COST)
//                    .ResolveUnlock(3).standUserWalkSpeed(0.8F)
//                    .standPose(TheWorldOvaTSHeavyAttack.TS_PUNCH_POSE).standWindupDuration(5).cooldown(40)
//                    .partsRequired(StandPart.MAIN_BODY, StandPart.ARMS), OTW_TIME_STOP_BLINK)
//                    );

    public static final RegistryObject<OTWZoom> OTW_ZOOM = ACTIONS.register("otw_zoom",
            () -> new OTWZoom(new StandEntityAction.Builder()
                    .ignoresPerformerStun()
                    .standOffsetFromUser(-0.25, -0.25, -0.3)
                    .partsRequired(StandInstance.StandPart.MAIN_BODY)));

    public static final EntityStandRegistryObject<EntityStandType<TimeStopperStandStats>, StandEntityType<OTWEntity>> STAND_OTW =
            new EntityStandRegistryObject<>("the_world_ova",
                    STANDS,
                    () -> new EntityStandType.Builder<TimeStopperStandStats>()
                    .color(0x00AFAF)
                    .storyPartName(ModStandsInit.PART_3_NAME)
                    .leftClickHotbar(
                            OTW_PUNCH.get(),
                            OTW_BARRAGE.get(),
                            OTW_HEAVY_PUNCH.get(),
                            OTW_SMASH.get(),
//                            OTW_TS_HEAVY_ATTACK.get(),
                            OTW_ULTRA_PUNCH.get()
                            )
                    .rightClickHotbar(
                            OTW_BLOCK.get(),
                            OTW_ZOOM.get(),
                            OTW_TIME_STOP.get()
                    )
                    .defaultStats(TimeStopperStandStats.class, new TimeStopperStandStats.Builder()
                            .tier(6)
                            .power(16, 20)
                            .speed(15, 20)
                            .range(2, 10)
                            .durability(13, 20)
                            .precision(16, 20)
                            .build("The World (Ova)"))
                    .addOst(InitSounds.OTW_OST)
                    .build(),
                    InitEntities.ENTITIES,
                    () -> new StandEntityType<>(OTWEntity::new, 0.85F, 2.35F)
                            .summonSound(InitSounds.OTW_SUMMON)
                            .unsummonSound(InitSounds.OTW_UNSUMMON))
            .withDefaultStandAttributes();
}
