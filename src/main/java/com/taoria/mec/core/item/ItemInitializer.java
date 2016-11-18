package com.taoria.mec.core.item;

import com.taoria.mec.core.block.BaseEastCauldron;
import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/11/4.
 */
public class InitInitializer {
    public static Item baseERecipe;
    public static void Init(FMLPreInitializationEvent event){
        //CreativeTabs
// base E recipe
        baseERecipe = new BaseERecipe().setUnlocalizedName("baseERecipe").setTextureName("mec:baseERecipe").setHasSubtypes(true).setCreativeTab(CreativeTabInitializer.ct);
        GameRegistry.registerItem(baseERecipe, baseERecipe.getUnlocalizedName().substring(5));

    }

}
