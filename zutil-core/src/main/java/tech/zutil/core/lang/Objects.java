package tech.zutil.core.lang;

import lombok.experimental.UtilityClass;

/**
 * 对象工具类
 *
 * @author miles.tang
 * @version 0.0.1
 * @date 2022-07-13
 */
@UtilityClass
public class Objects {

    // region Assert Null

    /**
     * 如果对象为空则返回{@code true},否则返回{@code false}
     *
     * @param obj 被检查的对象
     * @return {@code true} or {@code false}
     */
    public static boolean isNull(final Object obj) {
        return obj == null;
    }

    /**
     * 判断数组的任意一个元素是否为{@code null}
     *
     * @param array 数组
     * @return 如果数组任意一个元素为{@code null}则返回{@code true}，否则返回{@code false}
     */
    public static boolean isAnyNull(final Object... array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (Object obj : array) {
            if (isNull(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断数组的元素都为{@code null}
     *
     * @param array 数组
     * @return 如果数组所有元素都为{@code null}则返回{@code true}，否则返回{@code false}
     */
    public static boolean isAllNull(final Object... array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (Object obj : array) {
            if (!isNull(obj)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 如果对象不为空则返回{@code true},否则返回{@code false}
     *
     * @param obj 被检查的对象
     * @return {@code true} or {@code false}
     */
    public static boolean nonNull(final Object obj) {
        return obj != null;
    }

    /**
     * 如果对象不为空则返回{@code true},否则返回{@code false}
     *
     * @param obj 被检查的对象
     * @return {@code true} or {@code false}
     */
    public static boolean isNotNull(final Object obj) {
        return nonNull(obj);
    }

    // endregion

    // region Equals and HashCode

    /**
     * 比较两个对象的内容(equals),如果两个对象相等则返回{@code true},如果两个中有一个为{@code null}则返回{@code false}.
     * 如果两个对象都是{@code null}则返回{@code true}.如果传入的参数类型是数组,则比较的数组里的对象内容,而不是数组引用比较.
     *
     * <pre class="code">
     * Objects.equals("hello","hello"); //--- true
     * Objects.equals("hello","hell"); //--- false;
     * Objects.equals(4,4); //--- true
     * Objects.equals(new String[]{"aaaa","bbb"},new String[]{"aaaa","bbb"}); //--- true
     * </pre>
     *
     * @param a 第一个比较对象
     * @param b 第二个比较对象
     * @return 判断两个对象内容是否相等
     * @see java.util.Arrays#equals(Object[], Object[])
     */
    public static boolean equals(final Object a, final Object b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.equals(b)) {
            return true;
        }
        if (a.getClass().isArray() && b.getClass().isArray()) {
            if (a instanceof Object[] && b instanceof Object[]) {
                return java.util.Arrays.equals((Object[]) a, (Object[]) b);
            }
            if (a instanceof boolean[] && b instanceof boolean[]) {
                return java.util.Arrays.equals((boolean[]) a, (boolean[]) b);
            }
            if (a instanceof byte[] && b instanceof byte[]) {
                return java.util.Arrays.equals((byte[]) a, (byte[]) b);
            }
            if (a instanceof char[] && b instanceof char[]) {
                return java.util.Arrays.equals((char[]) a, (char[]) b);
            }
            if (a instanceof double[] && b instanceof double[]) {
                return java.util.Arrays.equals((double[]) a, (double[]) b);
            }
            if (a instanceof float[] && b instanceof float[]) {
                return java.util.Arrays.equals((float[]) a, (float[]) b);
            }
            if (a instanceof int[] && b instanceof int[]) {
                return java.util.Arrays.equals((int[]) a, (int[]) b);
            }
            if (a instanceof long[] && b instanceof long[]) {
                return java.util.Arrays.equals((long[]) a, (long[]) b);
            }
            if (a instanceof short[] && b instanceof short[]) {
                return java.util.Arrays.equals((short[]) a, (short[]) b);
            }
        }
        return false;
    }

    /**
     * 对象的哈希码，如果对象为{@code null}则返回0
     *
     * @param obj 对象
     * @return 哈希码
     */
    public static int hashCode(final Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    /**
     * 多个元素的哈希值
     *
     * @param values 数组元素
     * @return 哈希值
     */
    public static int hashCode(Object... values) {
        return Arrays.hashCode(values);
    }

    /**
     * 多个元素的哈希值
     *
     * @param values 数组元素
     * @return 哈希值
     */
    public static int hash(Object... values) {
        return hashCode(values);
    }


    // endregion

}
