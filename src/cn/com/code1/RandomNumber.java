package cn.com.code1;

public class RandomNumber {
    //成员变量
    int ran_Num;

    //成员方法
    public void produce_Num(){
        //产生随机数
        ran_Num = (int)(Math.random()*30)+21;
    }
    //成员方法
    public void robot(){
        int robot_num ;
        //产生0—3的随机数
        robot_num = (int)(Math.random()*3)+1;
        ran_Num = ran_Num-robot_num;
    }
}
