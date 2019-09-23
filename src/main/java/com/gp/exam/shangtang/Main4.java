package com.gp.exam.shangtang;

import java.util.*;

/**
 * @Author: pearl
 * @DATE: 2019/9/21 20:14
 * @Description:
 */
public class Main4 {
    static class Emp {
        int selfNum;
        int leader;
        List<Emp> empList = new ArrayList<>();

        Emp(int selfNum, int leader) {
            this.selfNum = selfNum;
            this.leader = leader;
        }
    }
    static Map<Integer, Emp> empMap = new HashMap<Integer, Emp>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Emp boss = new Emp(1, 0);
        empMap.put(1, boss);
        for (int i = 1; i < num; i++) {
            int leaderNum = in.nextInt();
            Emp tmpEmp = new Emp(i + 1, leaderNum);
            empMap.put(i+1, tmpEmp);
            empMap.get(leaderNum).empList.add(tmpEmp);
        }

        int sum = 0;
        for (Map.Entry<Integer, Emp> entry : empMap.entrySet()) {
            if (entry.getKey() == 1) {
                continue;
            }
            Emp curEmp = entry.getValue();
            if (curEmp.leader != 0 && empMap.get(curEmp.leader).leader != 0) {
                Emp ledLedEmp = empMap.get(empMap.get(curEmp.leader).leader);
                sum += empNum(ledLedEmp);
                sum += 1;
            }
        }
        System.out.println(sum/2*3);
    }
    static int empNum(Emp leader){
        int sum = leader.empList.size()-1;
        if(sum != 0){
            for(int i = 0; i< leader.empList.size();i++){
                sum += empNum(leader.empList.get(i));
            }
        }
        return sum;
    }
}
