package com.taoria.mec.core.blocks;

import com.taoria.lib.core.SingleItemSlot;
import com.taoria.mec.core.item.BaseERecipe;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.BlockCauldron;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/11/6.
 */
public class BaseEastCauldron extends Container{
    private BaseERecipe bERecipe;
    Slot slotBErecipe;
    Slot slotTrigrams[];
    private static final int trigramsNums =4;
    public BaseEastCauldron(IInventory iInventory,BaseERecipe bERecipe) {
        this.bERecipe = bERecipe;
        slotBErecipe = new SingleItemSlot(iInventory,0,150,150);
        slotTrigrams = new SingleItemSlot[4];
        for(int i = 0;i<trigramsNums;i++){
            slotTrigrams[i]= new SingleItemSlot(iInventory,0,i*32+50,255);
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

/*   ?\ public void onBlockClicked(World world, int x, int y, int z, EntityPlayer entityPlayer) {
        super.onBlockClicked(world, x, y, z, entityPlayer);
    }*/
}
