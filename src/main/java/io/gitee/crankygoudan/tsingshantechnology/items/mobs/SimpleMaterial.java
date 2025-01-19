package io.gitee.crankygoudan.tsingshantechnology.items.mobs;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;

public class SimpleMaterial extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {


    @ParametersAreNonnullByDefault
    public SimpleMaterial(SubItemGroup subItemGroup, SlimefunItemStack item, RecipeType type, ItemStack[] recipe, int amount) {
        super(subItemGroup, item, type, recipe, new SlimefunItemStack(item, amount));
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}
