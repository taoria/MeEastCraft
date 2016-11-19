package com.taoria.mec.core.block;

import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Administrator on 2016/11/18.
 */
public class BlockInitializer {
    private static Block EastCauldron;

    public static void Init(FMLPreInitializationEvent event){
        EastCauldron = new BaseEastCauldron("eastCauldron",Material.clay);
        EastCauldron.setBlockName("eastCauldron").setCreativeTab(CreativeTabInitializer.ct);
        GameRegistry.registerBlock(EastCauldron,"eastCauldron");
        System.out.println(EastCauldron.getUnlocalizedName());
    }

}
