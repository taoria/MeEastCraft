package com.taoria.mec.core.boc;

/**
 * Created by Administrator on 2016/11/13.
 */
public class Yao {
    public void setYaoType(String yaoType) {
        this.yaoType = yaoType;
    }

    private String yaoType;

    public String getYaoType(){
        return yaoType;
    }
    public static final Yao YAOS[] = new Yao[2];
    public static final String YAO_YIN = "yin";
    public static final String YAO_YANG = "yang";
    public static final int YIN_NUM = 0;
    public static final int YANG_NUM = 1;
    static{
        YAOS[YIN_NUM] = new Yao();
        YAOS[YANG_NUM] = new Yao();
        YAOS[YIN_NUM].setYaoType(YAO_YIN);
        YAOS[YANG_NUM].setYaoType(YAO_YANG);
    }
    public void ChangeYao(){
        if(yaoType==YAO_YANG)
            yaoType = YAO_YIN;
        else
            yaoType  =YAO_YANG;
    }
}
