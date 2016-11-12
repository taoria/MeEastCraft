package com.taoria.mec.core.Entity;

import com.taoria.mec.core.gui.GUI_E_Recipe;
import com.taoria.mec.core.item.BaseERecipe;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/11/7.
 */
public class MecGuiHandler implements IGuiHandler {
    public static final int MOD_GUI_ID_RECIPE = 0;
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID==MOD_GUI_ID_RECIPE) return new GUI_E_Recipe("baseERecipe");
        return null;
    }

}
