
package com.minecart.central_heater.misc.enumeration;

import com.minecart.central_heater.AllBlockItem;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import java.util.function.Supplier;

public class EnumProxyParam {
    public static final EnumProxy<Boat.Type> BURNT_BOAT_PROXY = new EnumProxy<>(
            Boat.Type.class,
            (Supplier<net.minecraft.world.level.block.Block>) AllBlockItem.BURNT_PLANKS::get,
            "central_heater:burnt",
            (Supplier<Item>) AllBlockItem.BURNT_BOAT::get,
            (Supplier<Item>) AllBlockItem.BURNT_CHEST_BOAT::get,
            (Supplier<Item>) () -> Items.STICK,
            false // Set to true if you want it to look/act like a Bamboo raft!
            // Hi I'm Aspen
            // (can someone say hi back please)
    );
}

