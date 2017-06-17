package com.cafintech.framework.helper;

/**
 * Created by nick on 2017/6/17.
 */
public class MathUtil {

    //最大值
    public static double max(double... m) {

        double max = Double.MIN_VALUE;

        for(int i = 0;i < m.length;i++) {
            max = Math.max(m[i], max);
        }

        return max;

    }

    //最小值
    public static double min(double... m) {

        double min = Double.MAX_VALUE;

        for(int i = 0;i < m.length;i++) {
            min = Math.min(m[i], min);
        }

        return min;
    }


    //平均值
    public double average(double... m){
        int sum = 0;
        for(int i = 0;i < m.length;i++){
            sum += m[i];
        }
        return (double)(sum / m.length);
    }

    //标准差
    public double standardDevition(double... m){
        double sum = 0;
        for(int i = 0;i < m.length;i++){
            sum += Math.sqrt(((double)m[i] -average(m)) * (m[i] -average(m)));
        }
        return (sum / (m.length - 1));
    }
}
