package com.taoria.lib.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import sun.reflect.CallerSensitive;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/11/29.
 */
public class BlockObjectManager implements ObjectManager<Block> {
    public TreeMap<String,Block> treeMap;

    public void setMODID(String MODID) {
        this.MODID = MODID;
    }

    private String MODID;
    public void setCreativeTabs(CreativeTabs creativeTabs) {
        this.creativeTabs = creativeTabs;
    }

    private CreativeTabs creativeTabs;
    public BlockObjectManager(){
        treeMap = new TreeMap<String, Block>();
    }
    @Override
    public Block getObject(String key) {
        return treeMap.get(key);
    }
    public Class<?> getObjectType(String key){
        return getObject(key).getClass();
    }
    private Block RegisterObj(Block temp,String key){
        temp.setBlockName(key);
        if(creativeTabs ==null){
            temp.setCreativeTab(CreativeTabs.tabBlock);
        }else{
            temp.setCreativeTab(creativeTabs);
        }
        if(MODID==null||MODID.equals("")){
            temp.setBlockTextureName(MODID+":"+temp.getUnlocalizedName());
        }
        GameRegistry.registerBlock(temp,key);
        return temp;
    }
    @Override
    public Block registerObject(String key, Class<?> type)  {
        Block temp = null;
        try {


            temp = (Block) type.newInstance();


        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("temp is "+temp);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return RegisterObj(temp,key);
    }

    public Block registerObject(String key,Class<?> type,Object... argList) {
        Class<?> argTypeList[] = new Class<?>[argList.length];
        for(int i=0;i<argTypeList.length;i++){
            argTypeList[i]=argList[i].getClass();
            System.out.println("class "+argTypeList[i]+"Loaded Success");
        }
        Constructor constructor=null;
        try {

            constructor = type.getConstructor(argTypeList);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Block temp= null;
        try {
           temp =(Block) constructor.newInstance(argList);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return RegisterObj(temp,key);
    }
}
