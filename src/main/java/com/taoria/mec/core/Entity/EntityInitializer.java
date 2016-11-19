package com.taoria.mec.core.Entity;

import com.taoria.mec.core.item.BaseERecipe;
import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Administrator on 2016/11/19.
 */
public class EntityInitializer {
    public static void Init(FMLPreInitializationEvent event){
        //CreativeTabs
// base E recipe
        GameRegistry.registerTileEntity(CauldronEntity.class,"cauldron_entity");

    }
}
