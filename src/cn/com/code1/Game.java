package cn.com.code1;
/*
小游戏
要求:
程序随机产生 20— 50根火柴,由人与计算机轮流拿,每次拿的数量不超过 3根,拿到最后一根为胜。 (使用图形界面)
 */


import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int person_Num ;
        RandomNumber rm = new RandomNumber();
        rm.produce_Num();
        System.out.println("系统产生的随机数为："+rm.ran_Num);
        if (rm.ran_Num>0){
            rm.robot();
            System.out.println(rm.ran_Num);
        }else if (rm.ran_Num<=0){
            System.out.println("机器赢了");
            //退出游戏
            System.exit(0);
        }
        System.out.println("请输入数字：");
        person_Num = input.nextInt();
        rm.ran_Num = rm.ran_Num-person_Num;
        if (rm.ran_Num<=0){
            System.out.println("你赢了！");
            System.exit(0);

        }


    }

}
