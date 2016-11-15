package com.taoria.mec.core.boc;

import net.minecraft.util.StatCollector;

import java.util.TreeMap;
import java.util.jar.Pack200;

/**
 * Created by Administrator on 2016/11/13.
 */
//some kind of sense of moha. but it did not moha...
public class Trigrams {
    public Yao yao[] = new Yao[3];
    public static final int BOTTOM_YAO = 0;
    public static final int MID_YAO = 1;
    public static final int UPPER_YAO =  2;
    public static TreeMap<Integer,String> trigramsNameMap = new TreeMap<Integer, String>();
    public static TreeMap<Integer,String> trigramsImageMap = new TreeMap<Integer, String>();
    public static TreeMap<String,String> StateTrigramsMap = new TreeMap<String, String>();
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

    public Trigrams(String stringState) {
        for(int i=0;i<3;i++) yao[i] = Yao.YAOS[0];
        setState(stringState);
    }

    public static void Init(){

        boolean test =true;
        if(test){
            //it's just for test;
            trigramsNameMap.put(1,"qian");
            trigramsNameMap.put(2,"dui");
            trigramsNameMap.put(3,"li");
            trigramsNameMap.put(4,"zhen");
            trigramsNameMap.put(5,"xun");
            trigramsNameMap.put(6,"kan");
            trigramsNameMap.put(7,"gen");
            trigramsNameMap.put(8,"kun");
            trigramsImageMap.put(1,"qian");
            trigramsImageMap.put(2,"dui");
            trigramsImageMap.put(3,"li");
            trigramsImageMap.put(4,"zhen");
            trigramsImageMap.put(5,"xun");
            trigramsImageMap.put(6,"kan");
            trigramsImageMap.put(7,"gen");
            trigramsImageMap.put(8,"kun");
        }
        //left to right is down to top
        StateTrigramsMap.put("1","111");
        StateTrigramsMap.put("111","1");
        StateTrigramsMap.put("2","110");
        StateTrigramsMap.put("110","2");
        StateTrigramsMap.put("3","101");
        StateTrigramsMap.put("101","3");
        StateTrigramsMap.put("4","100");
        StateTrigramsMap.put("100","4");
        StateTrigramsMap.put("5","011");
        StateTrigramsMap.put("011","5");
        StateTrigramsMap.put("6","010");
        StateTrigramsMap.put("010","6");
        StateTrigramsMap.put("7","001");
        StateTrigramsMap.put("001","7");
        StateTrigramsMap.put("8","000");
        StateTrigramsMap.put("000","8");

    }
    public String FromTrigramsToState(String trigrams){
        return StateTrigramsMap.get(trigrams);
    }
    public String FromTrigramsToState(int trigrams){
        return StateTrigramsMap.get(String.valueOf(trigrams));
    }
    public int FromStateToTrigrams(String state){
        return Integer.parseInt(StateTrigramsMap.get(state));
    }
    public String getState(){
        char gSeq[] = new char[3];
        for(int i=0;i<3;i++){
            if(Yao.YAOS[Yao.YANG_NUM]==yao[i]){
                gSeq[2-i]='1';
            }else{
                gSeq[2-i]='0';
            }
        }
        return String.copyValueOf(gSeq);
    }
    public void setState(String stateString){
        if(stateString.length()!=3) return;
        for(int i=0;i<3;i++){
            if(stateString.charAt(i)=='1'){
                yao[i]=Yao.YAOS[Yao.YANG_NUM];
            }else{
                yao[i]=Yao.YAOS[Yao.YIN_NUM];
            }
        }
    }

    public String getTrigramsName(){
        String unlocalizedName = getTrigramsUnlocalizedName();
        System.out.println("Debug:unlocalizedName:"+unlocalizedName);
        String localizedName = StatCollector.translateToLocalFormatted("gua.name."+unlocalizedName);
        return localizedName;
    }

    private String getTrigramsUnlocalizedName() {
        String state = getState();
        String guaNum  = StateTrigramsMap.get(state);
        return trigramsNameMap.get(Integer.parseInt(guaNum));
    }
}
