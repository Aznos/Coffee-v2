package com.maddoxh.item

import com.maddoxh.Coffee
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import java.util.function.Function

object ModItems {
    val coffeeCup = register(
        "coffee_cup",
        { properties: Item.Properties -> Item(properties) },
        Item.Properties()
    )

    fun register(name: String, itemFactory: Function<Item.Properties, Item>, settings: Item.Properties): Item {
        val itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Coffee.MOD_ID, name))
        val item = itemFactory.apply(settings.setId(itemKey))
        Registry.register(BuiltInRegistries.ITEM, itemKey, item)

        return item
    }
}