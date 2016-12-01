package com.taoria.mec.core.gui;

import com.taoria.mec.core.Entity.CauldronEntity;
import com.taoria.mec.core.inventory.EastCauldronContainer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Administrator on 2016/11/17.
 */
@SideOnly(Side.CLIENT)
public class GUI_E_Cauldron extends GuiContainer {
    private static final ResourceLocation cauldronLocation = new ResourceLocation("");
    private CauldronEntity cauldronEntity;
    public GUI_E_Cauldron(IInventory playerInv, CauldronEntity te) {
        super(new EastCauldronContainer(playerInv, te));
        this.xSize = 233;
        this.ySize = 233;
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {

    }
}
