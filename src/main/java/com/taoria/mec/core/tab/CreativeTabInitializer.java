package com.taoria.mec.core.tab;

import com.taoria.mec.core.item.MecCreativeBar;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Administrator on 2016/11/18.
 */
public class CreativeTabInitializer {
    public static CreativeTabs ct;
    public static void Init(FMLPreInitializationEvent event) {
        ct = new MecCreativeBar("MEC");
    }
}
