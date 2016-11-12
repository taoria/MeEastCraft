package com.taoria.mec.core.gui;

import jdk.nashorn.internal.parser.Scanner;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.Language;

import java.awt.*;

/**
 * Created by Administrator on 2016/11/6.
 */
public class GUI_E_Recipe extends GuiScreen{
    public GUI_E_Recipe(String recipeName){
        this.recipeName= recipeName;

    }
    public void drawContent(){

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj,info,this.width/2,(int)(this.height/5),Color.gray.getRGB());
        drawContent();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    private String info="default info";
    private String recipeName;
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    @Override
    public void initGui() {
        LoadString();
        //height=100;
        //width =100;
        this.fontRendererObj.FONT_HEIGHT=16;
        System.out.println(this.width+","+this.height);
        this.buttonList.add(closeButton = new GuiButton(0, this.width / 2 - 100, (int)(this.height / 1.2), "Close Reading"));

    }
    @Override
    public void actionPerformed(GuiButton whichButton){

        if(whichButton==closeButton){
            this.mc.displayGuiScreen(null);
        }

    }
    public void LoadString(){
    }

    public GuiButton closeButton;
}
