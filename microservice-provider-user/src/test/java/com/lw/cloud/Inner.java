package com.lw.cloud;

import java.io.Serializable;

/**
 * Created by WYluo on 2018/4/12.
 */
public class Inner implements Serializable{

    public String name;

    public Inner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inner{" +
                "name='" + name + '\'' +
                '}';
    }
}
