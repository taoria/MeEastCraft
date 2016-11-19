package com.taoria.mec.core.boc;

import com.taoria.lib.core.SingleItemSlot;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.IIcon;

/**
 * Created by Administrator on 2016/11/18.
 */
public class TrigramsSlot extends SingleItemSlot{
    public TrigramsSlot(IInventory inventory, int index, int xPosition, int yPosition) {
        super(inventory, index, xPosition, yPosition);
    }
    @Override
    public void setBackgroundIcon(IIcon icon) {
        super.setBackgroundIcon(icon);
    }
}
