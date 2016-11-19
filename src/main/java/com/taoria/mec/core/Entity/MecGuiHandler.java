package com.taoria.mec.core.Entity;
import com.taoria.mec.core.gui.GUI_E_Cauldron;
import com.taoria.mec.core.gui.GUI_E_Recipe;
import com.taoria.mec.core.inventory.EastCauldronContainer;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/11/7.
 */
public class MecGuiHandler implements IGuiHandler {
    public static final int MOD_GUI_ID_RECIPE = 0;
    public static final int MOD_GUI_ID_CAULDRON = 1;
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
       if(ID==MOD_GUI_ID_CAULDRON) return new EastCauldronContainer(player.inventory,(CauldronEntity) world.getTileEntity(x, y,z));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID==MOD_GUI_ID_RECIPE) return new GUI_E_Recipe("baseERecipe");
        if(ID==MOD_GUI_ID_CAULDRON) return new GUI_E_Cauldron(player.inventory,(CauldronEntity) world.getTileEntity(x, y,z));
        return null;
    }

}
