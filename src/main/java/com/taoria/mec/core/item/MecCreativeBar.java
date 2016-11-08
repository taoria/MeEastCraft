package com.taoria.mec.core.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/11/7.
 */
public class MecCreativeBar  extends CreativeTabs {

    public MecCreativeBar(String lable) {
        super(lable);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {

        return MECItem.baseERecipe;
    }
}
