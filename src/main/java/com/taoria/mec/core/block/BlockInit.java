package com.taoria.mec.core.block;

import com.taoria.lib.init.BlockObjectManager;
import com.taoria.mec.core.MeEastCraft;
import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import scala.xml.dtd.impl.Base;

/**
 * Created by Administrator on 2016/11/18.
 */
public class BlockInit {
    private static Block eastCauldron;
    private static Block recipeChest;
    private static BlockObjectManager blockObjectManager;


    public static void Init(FMLPreInitializationEvent event){
        //Init object Manager
        blockObjectManager = new BlockObjectManager();
        blockObjectManager.setCreativeTabs(CreativeTabInitializer.ct);
        blockObjectManager.setMODID(MeEastCraft.MODID);

        ///Register Item
        blockObjectManager.registerObject("eastCauldron", BaseEastCauldron.class,"eastCauldron");
        blockObjectManager.registerObject("recipeChest",RecipeChest.class,0);


        //RecipeChest

    }

}
