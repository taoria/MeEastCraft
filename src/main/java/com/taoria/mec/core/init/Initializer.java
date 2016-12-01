package com.taoria.mec.core.init;

import com.taoria.mec.core.Entity.EntityInit;
import com.taoria.mec.core.block.BlockInit;
import com.taoria.mec.core.item.ItemInitializer;
import com.taoria.mec.core.tab.CreativeTabInitializer;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Administrator on 2016/11/18.
 */
public class Initializer {
    public static void Init(FMLPreInitializationEvent event) {
        EntityInit.Init(event);
        CreativeTabInitializer.Init(event);

        BlockInit.Init(event);
        ItemInitializer.Init(event);
    }
}
