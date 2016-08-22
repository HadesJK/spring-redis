package com.jql.type;

import java.util.EnumSet;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 10:05
 */
public class Main {
    public static void main(String[] args) {
        EnumTest et = EnumTest.BLUE;

        switch (et) {
            case RED:
                System.out.println("this is red.");
                break;
            case GREEN:
                System.out.println("this is green.");
                break;
            case BLUE:
                System.out.println("this is blue.");
                break;
            case YELLOW:
                System.out.println("this is yellow.");
                break;
            default:
                System.out.println("this is default");

        }
        System.out.println(EnumTest.RED);
        System.out.println(EnumTest.ORANGE);
        System.out.println(EnumTest.PURPLE);
        System.out.println();

        EnumSet.range(EnumTest.ORANGE, EnumTest.BLUE).forEach(System.out::println);
    }
}
