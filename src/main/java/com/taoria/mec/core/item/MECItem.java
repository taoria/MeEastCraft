package com.taoria.mec.core.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/11/4.
 */
public class MECItem {
    public static Item baseERecipe;
    public static void Init(FMLPreInitializationEvent event){
        //CreativeTabs
        CreativeTabs ct = new MecCreativeBar("MEC");
// base E recipe
        baseERecipe = new BaseERecipe().setUnlocalizedName("baseERecipe").setTextureName("mec:baseERecipe").setHasSubtypes(true).setCreativeTab(ct);

        System.out.println(baseERecipe.getUnlocalizedName());

        GameRegistry.registerItem(baseERecipe, baseERecipe.getUnlocalizedName().substring(5));

    }

}
