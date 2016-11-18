package com.taoria.mec.core.block;

import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.material.Material;

/**
 * Created by Administrator on 2016/11/18.
 */
public class BlockIniter {
    private static BaseEastCauldron baseEastCauldron;

    public static void Init(FMLPreInitializationEvent event){
        baseEastCauldron = new BaseEastCauldron(Material.clay);
        baseEastCauldron.setBlockName("EastCauldron").setCreativeTab(CreativeTabInitializer.ct);
    }

}
