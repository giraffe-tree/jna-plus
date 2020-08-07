package me.giraffetree.java.jnaplus.complex;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.ptr.IntByReference;

import java.nio.IntBuffer;

public interface LibComplexLibrary extends Library {

    public static final String JNA_LIBRARY_NAME = "libComplex";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(LibComplexLibrary.JNA_LIBRARY_NAME);
    public static final LibComplexLibrary INSTANCE = (LibComplexLibrary) Native.loadLibrary(LibComplexLibrary.JNA_LIBRARY_NAME, LibComplexLibrary.class);

    /**
     * !!!!!!!!!!!!!!!!!!!!!! 注意内存泄漏 !!!!!!!!!!!!!!!!!!!!!!!!
     * 通过这种方式返回, 如果不释放内存, 会导致内存泄漏
     *
     * @param len 数组长度
     * @return IntByReference
     */
    IntByReference getArray(int len);


    @Deprecated
    void deleteArray(IntByReference arr);

    void deleteArray(IntBuffer arr);

}
