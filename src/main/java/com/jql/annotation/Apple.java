package com.jql.annotation;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 15:00
 */
public class Apple {

    @FruitName("apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "红富士", address = "网易")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String toString() {
        return "水果名称:" + appleName
                + "\n水果颜色:" + appleColor
                + "\n供应商:" + appleProvider;
    }
}
