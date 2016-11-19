package com.taoria.mec.core.block;

import com.taoria.mec.core.Entity.CauldronEntity;
import com.taoria.mec.core.Entity.MecGuiHandler;
import com.taoria.mec.core.MeEastCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/11/18.
 */
public class BaseEastCauldron extends BlockStone implements ITileEntityProvider{

    public BaseEastCauldron(String unlocalizedName,Material material) {
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(MeEastCraft.MODID+":"+unlocalizedName);
        this.isBlockContainer = true;

    }
    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new CauldronEntity();
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int i3) {
        super.breakBlock(world, x, y, z, block, i3);
        world.removeTileEntity(x,y,z);
    }

    @Override
    public boolean onBlockEventReceived(World p_149696_1_, int p_149696_2_, int p_149696_3_, int p_149696_4_, int p_149696_5_, int p_149696_6_) {
       super.onBlockEventReceived(p_149696_1_, p_149696_2_, p_149696_3_, p_149696_4_, p_149696_5_, p_149696_6_);
        TileEntity tileentity = p_149696_1_.getTileEntity(p_149696_2_,p_149696_3_,p_149696_4_);
        return tileentity == null ? false : tileentity.receiveClientEvent(p_149696_5_,p_149696_6_);

    }
   IIcon iIcon[] = new IIcon[3];
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        iIcon[1]=reg.registerIcon(this.textureName+"_top");
        iIcon[0]=reg.registerIcon(this.textureName+"_bottom");
        iIcon[2]=reg.registerIcon(this.textureName);
        super.registerBlockIcons(reg);
    }
    @Override
    public IIcon getIcon(int side, int meta) {
       if(side>=2)
           return iIcon[2];
       else
           return iIcon[side];
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (!world.isRemote) {
            entityPlayer.openGui(MeEastCraft.instance, MecGuiHandler.MOD_GUI_ID_CAULDRON, world, x, y, z);
        }
        return super.onBlockActivated(world, x, y, z, entityPlayer, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
    }
}
