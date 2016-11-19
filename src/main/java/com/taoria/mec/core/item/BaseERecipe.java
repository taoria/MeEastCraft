package com.taoria.mec.core.item;

import com.taoria.mec.core.Entity.MecGuiHandler;
import com.taoria.mec.core.MeEastCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemWritableBook;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/10/30.
 */
public class BaseERecipe extends ItemWritableBook{
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if(world.isRemote){
            System.out.println("Hello world"+MeEastCraft.instance);
            player.openGui(MeEastCraft.instance, MecGuiHandler.MOD_GUI_ID_RECIPE,world,(int)player.posX,(int)player.posY,(int)player.posZ);
        }

        //    System.out.println("right click E-recipe");

        return itemStack;
    }
}
