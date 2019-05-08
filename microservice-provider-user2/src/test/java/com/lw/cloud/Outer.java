package com.lw.cloud;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by WYluo on 2018/4/12.
 */
public class Outer implements Serializable{
    public Inner inner;


    public Outer mycloun(){
        Outer outer = null;
        try {
            ByteArrayOutputStream baos =new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            outer= (Outer) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return outer;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("原outer:"+outer.toString());
        Outer o2=outer.mycloun();
        System.out.println("o2:"+o2.toString());
    }

}
