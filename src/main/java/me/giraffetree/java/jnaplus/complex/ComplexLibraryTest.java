package me.giraffetree.java.jnaplus.complex;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;

/**
 * @author GiraffeTree
 * @date 2020/8/6
 */
public class ComplexLibraryTest {

    public static void main(String[] args) {
        testGetArray();

    }

    private static void testGetArray() {
        int len = 10;
        IntByReference array = ComplexLibrary.INSTANCE.getArray(len);
        Pointer pointer = array.getPointer();
        int[] intArray = pointer.getIntArray(0, len);
        System.out.println(Arrays.toString(intArray));
    }
}
