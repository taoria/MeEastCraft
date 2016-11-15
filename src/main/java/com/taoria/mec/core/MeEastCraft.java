package com.taoria.mec.core;


import com.taoria.mec.core.Entity.MecGuiHandler;
import com.taoria.mec.core.boc.Trigrams;
import com.taoria.mec.core.item.MECItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.main.Main;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/10/29.f
 */
@Mod(modid = MeEastCraft.MODID,name= MeEastCraft.MODNAME,version = "1.0")
public class MeEastCraft {
    public static final String MODID = "mec";

    public static final String MODNAME ="Mystic East Mod";
    @Instance(value="mec")
    public static  MeEastCraft instance = new MeEastCraft();
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        Trigrams.Init();
        if(MeEastCraft.instance.equals(this)){
            System.out.println("same instance of minecraft mod");
        }else{
            System.out.println("this is not same!!");
        }
        MECItem.Init(event);
        NetworkRegistry.INSTANCE.registerGuiHandler(this,new MecGuiHandler());

    }
    @EventHandler
    public void init(FMLInitializationEvent event){


    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }


}
