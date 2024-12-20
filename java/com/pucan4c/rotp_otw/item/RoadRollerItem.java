package com.pucan4c.rotp_otw.item;

import com.pucan4c.rotp_otw.entity.FuelTruckEntity;
import com.pucan4c.rotp_otw.init.InitSounds;
import com.pucan4c.rotp_otw.init.InitStands;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.github.standobyte.jojo.util.mod.JojoModUtil;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class RoadRollerItem extends Item {

    public RoadRollerItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack handStack = player.getItemInHand(hand);
        if (!world.isClientSide()) {
            FuelTruckEntity fuelTruck = new FuelTruckEntity(world);
            fuelTruck.copyPosition(player);
            world.addFreshEntity(fuelTruck);
            player.startRiding(fuelTruck);
            fuelTruck.setOwner(player);
            if (IStandPower.getStandPowerOptional(player)
                    .map(stand -> stand.getType() == InitStands.STAND_OTW.getStandType())
                    .orElse(false)) {
                JojoModUtil.sayVoiceLine(player, InitSounds.DIOVA_FUEL_TRUCK.get());
            }
            if (!player.abilities.instabuild) {
                handStack.shrink(1);
            }
        }
        return ActionResult.consume(handStack);
    }

}
