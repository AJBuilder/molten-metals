package com.ordana.molten_metals.items;

import net.minecraft.world.item.Item;

public class IngotMoldItem extends Item {
  private final Item ingot;
  private final float chance;

  public IngotMoldItem(Item item, Properties properties, float chance) {
    super(properties);
    this.ingot = item;
    this.chance = chance;
  }



}
