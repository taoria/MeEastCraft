package com.taoria.mec.core.inventory;

import com.taoria.lib.core.SingleItemSlot;
import com.taoria.mec.core.boc.TrigramsSlot;
import com.taoria.mec.core.Entity.CauldronEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Administrator on 2016/11/6.
 */
public class EastCauldronContainer extends Container{
    private CauldronEntity  cauldronEntity;
    Slot slotBErecipe;
    Slot slotTrigrams[];
    private static final int trigramsNums =4;
    public EastCauldronContainer(IInventory iInventory, CauldronEntity cauldronEntity ) {
        this.cauldronEntity = cauldronEntity;
        slotBErecipe = new SingleItemSlot(iInventory,0,150,150);
        slotTrigrams = new TrigramsSlot[4];
        for(int i = 0;i<trigramsNums;i++){

            slotTrigrams[i]= new TrigramsSlot(iInventory,0,i*32+50,255);
            this.addSlotToContainer(slotTrigrams[i]);
        }
        this.addSlotToContainer(slotBErecipe);

    }
    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return true;
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();

            // [...] Custom behaviour

            if (current.stackSize == 0)
                slot.putStack((ItemStack) null);
            else
                slot.onSlotChanged();

            if (current.stackSize == previous.stackSize)
                return null;
            slot.onPickupFromSlot(playerIn, current);
        }
        return previous;
    }

}
