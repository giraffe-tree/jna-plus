package me.giraffetree.java.jnaplus.complex;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * 注意!!!!!!!!!!!!!
 * 必须在 vm options 中加上 限制 java 堆内存的参数, 否则很难判断哪个地方发生 memory leak
 * 例如: -Xmx100M
 *
 * @author GiraffeTree
 * @date 2020/8/6
 */
public class ComplexLibraryTest {

    public static void main(String[] args) {
        Native.setProtected(true);
        int loop = 100_000_000;
        testLoopGetArray(loop);

        testGetArray(10);
    }


    private static void testLoopGetArray(int loop) {
        for (int i = 0; i < loop; i++) {
            if (i % 1_00_000 == 0) {
                System.out.println("cur:" + i);
            }
            testGetArray(10);
        }
    }

    private static int[] testGetArray(int len) {
        IntByReference intRef = null;
        try {
            intRef = LibComplexLibrary.INSTANCE.getArray(len);
            Pointer pointer = intRef.getPointer();
            return pointer.getIntArray(0, len);
        } finally {
            if (intRef != null) {
                // 如果不释放会导致内存泄漏
                LibComplexLibrary.INSTANCE.deleteArray(intRef);
            }
        }


    }


}
