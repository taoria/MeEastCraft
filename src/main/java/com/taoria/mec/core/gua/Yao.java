package com.taoria.mec.core.gua;

/**
 * Created by Administrator on 2016/11/13.
 */
public class Yao {
    public String yaoType;
    public String getYaoType(){
        return yaoType;
    }
    public static final String YAO_YIN = "yin";
    public static final String YAO_YANG = "yang";
    public void ChangeYao(){
        if(yaoType==YAO_YANG)
            yaoType = YAO_YIN;
        else
            yaoType  =YAO_YANG;
    }
}
