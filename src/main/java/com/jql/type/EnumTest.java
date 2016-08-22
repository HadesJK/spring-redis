package com.jql.type;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 10:04
 */
public enum EnumTest {
    RED(100, "red for you"),
    ORANGE(101,  "orange for you"),
    YELLOW(102, "this is yellow"),
    GREEN(103, "this is green"),
    CYAN(104, "this is cyan"),
    BLUE(105, "this is blue"),
    PURPLE(106, "this is purple");


    private final int value;
    private final String desc;

    private EnumTest(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}
