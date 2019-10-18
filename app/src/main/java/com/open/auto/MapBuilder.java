package com.open.auto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/3/2.
 */
public class MapBuilder<T> {
    public MapBuilder addMap(Map m) {
        map.putAll(m);
        return this;
    }

    public static MapBuilder withMap(Map map) {
        return build().setMap(map);
    }

    private MapBuilder setMap(Map map) {
        this.map = map;
        return this;
    }

    private static MapBuilder hold = new MapBuilder();

    public Map map = new HashMap();

    public static MapBuilder newInstance() {
        return hold = new MapBuilder();
    }

    public static MapBuilder hold() {
//        if(hold==null){
//            newInstance();
//        }
        return hold;
    }

    public static MapBuilder build() {
        return new MapBuilder();
    }

    public MapBuilder add(T k, Object v) {
        if (v == null || v.toString().equals("null")) {

        } else {
            map.put(k, v);
        }
        return this;
    }

    public Map get() {
        hold = null;
        return map;
    }

}
