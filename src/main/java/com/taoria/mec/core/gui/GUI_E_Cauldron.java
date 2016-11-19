package com.taoria.mec.core.gui;

import com.taoria.mec.core.Entity.CauldronEntity;
import com.taoria.mec.core.inventory.EastCauldronContainer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;

/**
 * Created by Administrator on 2016/11/17.
 */
public class GUI_E_Cauldron extends GuiContainer {
    public GUI_E_Cauldron(IInventory playerInv, CauldronEntity te) {
        super(new EastCauldronContainer(playerInv, te));
        this.xSize = 233;
        this.ySize = 233;
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {

    }
}
