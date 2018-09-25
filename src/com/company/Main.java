package com.company;

public class Main {

    public static void main(String[] args) {

        double[] values;
        values = getArray();
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+ " ");
        }
    }
    public  static  double[] getArray()
    {
        double[] array = {2,5,6,3,8,67,34,68};
        return array;
    }

}
