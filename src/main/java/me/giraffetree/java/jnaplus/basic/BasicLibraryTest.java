package me.giraffetree.java.jnaplus.basic;

/**
 * @author GiraffeTree
 * @date 2020/8/6
 */
public class BasicLibraryTest {

    public static void main(String[] args) {

        testMax();
    }

    private static void testMax() {
        int max = BasicLibrary.INSTANCE.max(1, 2);
        System.out.println(max == 2);
    }
}
