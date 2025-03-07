package com.hc.mixthebluetooth.recyclerData.itemHolder;

import android.graphics.Color;

public class FragmentLogItem {
    private final String name;
    private final String data;
    private final String lv;

    public FragmentLogItem(String name,String data,String lv){
        this.name = name;
        this.data = data;
        this.lv = lv;
    }

    public int getLv() {
        if (lv.equals("e")) return Color.parseColor("#FE4F6E");
        if (lv.equals("w")) return Color.parseColor("#4EB9D2");
        return Color.parseColor("#737373");
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}
