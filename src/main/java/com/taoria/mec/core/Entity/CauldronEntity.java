package com.taoria.mec.core.Entity;

import net.minecraft.inventory.IInventory;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
/**
 * Created by Administrator on 2016/11/18.
 */
public class CauldronEntity extends TileEntity implements IUpdatePlayerListBox {

    @Override
    public void update() {
        System.out.println("hello thank you thank you very much");
    }
}
