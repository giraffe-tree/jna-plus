package me.giraffetree.java.jnaplus.jni;

import com.sun.jna.JNIEnv;

/**
 * @author GiraffeTree
 * @date 2020/8/11
 */
public class HeaderViewer {

    public static native byte[] getHeader(Object obj);


    public static void main(String[] args) {

        JNIEnv current = JNIEnv.CURRENT;

    }
}
