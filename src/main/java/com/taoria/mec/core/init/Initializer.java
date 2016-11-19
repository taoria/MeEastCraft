package com.taoria.mec.core.init;

import com.taoria.mec.core.Entity.EntityInitializer;
import com.taoria.mec.core.block.BlockInitializer;
import com.taoria.mec.core.item.ItemInitializer;
import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Administrator on 2016/11/18.
 */
public class Initializer {
    public static void Init(FMLPreInitializationEvent event) {
        EntityInitializer.Init(event);
        CreativeTabInitializer.Init(event);

        BlockInitializer.Init(event);
        ItemInitializer.Init(event);
    }
}
