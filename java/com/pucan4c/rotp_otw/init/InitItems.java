package com.pucan4c.rotp_otw.init;

import com.pucan4c.rotp_otw.RotpOTWA;
import com.github.standobyte.jojo.JojoMod;
import com.pucan4c.rotp_otw.client.render.item.RoadRollerISTER;
import com.pucan4c.rotp_otw.item.RoadRollerItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RotpOTWA.MOD_ID);

    public static final RegistryObject<RoadRollerItem> ROAD_ROLLER = ITEMS.register("fuel_truck",
            () -> new RoadRollerItem(new Item.Properties().tab(JojoMod.MAIN_TAB).stacksTo(1)
                    .setISTER(() -> RoadRollerISTER::new)));

}
