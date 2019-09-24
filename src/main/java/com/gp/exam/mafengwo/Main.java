package com.gp.exam.mafengwo;

/**
 * @Author: pearl
 * @DATE: 2019/9/24 10:16
 * @Description: 马蜂窝第一题，统计签到数量最多的城市，需要对信息去重
 */

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] infos = str.split(" ");
        Set<String> infoStr = new HashSet<>();
        for(String info:infos) {
            infoStr.add(info);
        }
        Map<String,Integer> cityNum = new TreeMap<String, Integer>();
        Iterator<String> it = infoStr.iterator();
        while(it.hasNext()) {
            String tmp =  it.next();
            String[] cityAndCus = tmp.split("-");
            if(cityNum.containsKey(cityAndCus[1])) {
                cityNum.put(cityAndCus[1], cityNum.get(cityAndCus[1])+1);
            }else {
                cityNum.put(cityAndCus[1],1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(cityNum.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
                // TODO Auto-generated method stub
                if(!arg0.getValue().equals(arg1.getValue())) {
                    return arg1.getValue().compareTo(arg0.getValue());
                } else {
                    return arg0.getKey().compareTo(arg1.getKey());
                }
            }
        });


        for(int i = 0;i<3;i++) {
            System.out.println(list.get(i).getKey() + " "+ list.get(i).getValue());
        }


    }
}

