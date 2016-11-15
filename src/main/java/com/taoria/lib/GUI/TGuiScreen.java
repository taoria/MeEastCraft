package com.taoria.lib.GUI;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.util.TreeMap;

/**
 * Created by Administrator on 2016/11/14.
 */
public class TGuiScreen extends GuiScreen {
    private TreeMap<String,GuiButton> buttonMap = new TreeMap<String, GuiButton>();
    public void AddButtonToGui(GuiButton guiButton,String guiName){
        buttonMap.put(guiName,guiButton);
        this.buttonList.add(guiButton);
        guiButton.displayString  = guiName;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float f) {
        drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, f);
    }

    public void RemoveButtonFromGui(String name){
        Object o =  buttonMap.remove(name);
        if(o==null) return ;
        this.buttonList.remove(o);
    }

    @Override
    public void initGui() {
        super.initGui();
    }
}
