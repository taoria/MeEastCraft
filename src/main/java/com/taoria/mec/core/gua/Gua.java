package com.taoria.mec.core.gua;

import java.util.TreeMap;

/**
 * Created by Administrator on 2016/11/13.
 */
//some kind of sense of moha. but it did not moha...
    //Gua is
public class Gua {
    public Yao yao[] = new Yao[3];
    public static final int BOTTOM_YAO = 0;
    public static final int MID_YAO = 1;
    public static final int UPPER_YAO =  2;
    public static TreeMap<Integer,String> guaNameMap = new TreeMap<Integer, String>();
    public static TreeMap<Integer,String> guaImageMap = new TreeMap<Integer, String>();
    public static TreeMap<String,String> StateGuaMap = new TreeMap<String, String>();
    public Yao getYao(int yaoNum) throws Exception {
        if(yaoNum>=3||yaoNum<0)
            throw new Exception("Could not find a yao,please recheck the yaoNum");
        return yao[yaoNum];
    }
    public void ChangeYao(int yaoNum) throws Exception {
        if(yaoNum>=3||yaoNum<0)
            throw new Exception("Could not find a yao,please recheck the yaoNum");
        yao[yaoNum].ChangeYao();
    }
    public static void Init(){
        boolean test =true;
        if(test){
            //it's just for test;
            guaNameMap.put(1,"qian");
            guaNameMap.put(2,"dui");
            guaNameMap.put(3,"li");
            guaNameMap.put(4,"zhen");
            guaNameMap.put(5,"xun");
            guaNameMap.put(6,"kan");
            guaNameMap.put(7,"gen");
            guaNameMap.put(8,"kun");
            guaImageMap.put(1,"qian");
            guaImageMap.put(2,"dui");
            guaImageMap.put(3,"li");
            guaImageMap.put(4,"zhen");
            guaImageMap.put(5,"xun");
            guaImageMap.put(6,"kan");
            guaImageMap.put(7,"gen");
            guaImageMap.put(8,"kun");
        }
        //left to right is top to down
        StateGuaMap.put("1","111");
        StateGuaMap.put("111","1");
        StateGuaMap.put("2","011");
        StateGuaMap.put("011","2");
        StateGuaMap.put("3","101");
        StateGuaMap.put("101","3");
        StateGuaMap.put("4","001");
        StateGuaMap.put("001","4");
        StateGuaMap.put("5","011");
        StateGuaMap.put("011","5");
        StateGuaMap.put("6","010");
        StateGuaMap.put("010","6");
        StateGuaMap.put("7","100");
        StateGuaMap.put("100","7");
        StateGuaMap.put("8","000");
        StateGuaMap.put("000","8");

    }
    public String FromGuaToState(String gua){
        return StateGuaMap.get(gua);
    }
    public String FromGuaToState(int gua){
        return StateGuaMap.get(String.valueOf(gua));
    }
    public int FromStateToGua(String state){
        return Integer.parseInt(StateGuaMap.get(state));
    }
    public String getState(){
        char gSeq[] = new char[3];
        for(int i=2;i>=0;i--){
            if(yao[i].getYaoType()==Yao.YAO_YANG){
                gSeq[2-i]='1';
            }else{
                gSeq[2-i]='0';
            }
        }
        return gSeq.toString();
    }
}
