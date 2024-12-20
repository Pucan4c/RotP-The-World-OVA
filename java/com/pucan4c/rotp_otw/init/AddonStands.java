package com.pucan4c.rotp_otw.init;

import com.pucan4c.rotp_otw.entity.OTWEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.TimeStopperStandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

    public static final EntityStandSupplier<EntityStandType<TimeStopperStandStats>, StandEntityType<OTWEntity>>
    OTW = new EntityStandSupplier<>(InitStands.STAND_OTW);
}
