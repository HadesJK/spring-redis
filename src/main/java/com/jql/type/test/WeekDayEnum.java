package com.jql.type.test;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 10:52
 */
public enum WeekDayEnum {
    Mon(1), Tue(2), Wed(3), Thu(4), Fri(5), Sat(6), Sun(7);

    private int index;

    WeekDayEnum(int idx) {
        this.index = idx;
    }

    public int getIndex() {
        return index;
    }
}
