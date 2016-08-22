package com.jql.type;

import java.lang.annotation.Target;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 09:15
 */

public interface JavaEnumInterface<T> {
    int value();
    T getEnumByValue(int value);
}
