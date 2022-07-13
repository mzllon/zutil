package tech.zutil.core.lang;

import lombok.experimental.UtilityClass;
import tech.zutil.core.exceptions.GenericRuntimeException;

import java.lang.reflect.Array;

/**
 * 数组工具类
 *
 * @author miles.tang
 * @version 0.0.1
 * @date 2022-07-13
 */
@UtilityClass
public class Arrays {

    //region Constants

    /**
     * 数组中元素未找到的下标，值为-1
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * 空数组（对象类型）
     */
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

    /**
     * 空数组(字符串类型)
     */
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    /**
     * 空数组(字符类型)
     */
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];

    /**
     * 空数组(Long类型)
     */
    public static final long[] EMPTY_LONG_ARRAY = new long[0];

    /**
     * 空数组(int类型)
     */
    public static final int[] EMPTY_INT_ARRAY = new int[0];

    /**
     * 空数组(short类型)
     */
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];

    /**
     * 空数组(byte类型)
     */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    /**
     * 空数组(double类型)
     */
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

    /**
     * 空数组(float类型)
     */
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];

    /**
     * 空数组(boolean类型)
     */
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];

    /**
     * 空数组(字符类型)
     */
    public static final Character[] EMPTY_CHAR_OBJECT_ARRAY = new Character[0];

    /**
     * 空数组(Long类型)
     */
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];

    /**
     * 空数组(Integer类型)
     */
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];

    /**
     * 空数组(Short类型)
     */
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];

    /**
     * 空数组(Byte类型)
     */
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];

    /**
     * 空数组(Double类型)
     */
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];

    /**
     * 空数组(Float类型)
     */
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];

    /**
     * 空数组(Boolean类型)
     */
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];

    //endregion

    // region Assert Empty

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @param <T>   泛型类
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    @SafeVarargs
    public static <T> boolean isEmpty(final T... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final char... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final boolean... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final byte... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final short... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final int... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final long... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final float... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断是否为空
     *
     * @param array 数组
     * @return 当数组为空或{@code null}时返回{@code true}
     */
    public static boolean isEmpty(final double... array) {
        return array == null || array.length == 0;
    }

    /**
     * 判断数组对象是否为{@code null}或者长度为0
     *
     * @param array 数组对象
     * @return 是否为{@code null}或长度为0
     */
    public static boolean isEmpty(final Object array) {
        if (array == null) {
            return true;
        } else if (isArray(array)) {
            return getLength(array) == 0;
        }
        throw new GenericRuntimeException("Object to provide is not a array!");
    }

    /**
     * 判断是否不为空或不为{@code null}
     *
     * @param array 数组
     * @param <T>   泛型类
     * @return 当数组不为空且不是{@code null}时返回{@code true}
     */
    @SafeVarargs
    public static <T> boolean isNotEmpty(final T... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final char... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final boolean... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final byte... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final short... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final int... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final float... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final double... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组非空且长度大于0
     *
     * @param array 数组
     * @return 判断成功则返回{@code true},否则返回{@code false}
     */
    public static boolean isNotEmpty(final long... array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组是否为空或数组列表有任意一个元素为{@code null}则返回{@code true}，否则返回{@code false}
     *
     * @param array 数组
     * @param <T>   泛型类型
     * @return {@code true} or {@code false}
     */
    @SafeVarargs
    public static <T> boolean isAnyNull(final T... array) {
        if (isEmpty(array)) {
            return true;
        }
        for (T element : array) {
            if (element == null) {
                return true;
            }
        }
        return false;
    }

    // endregion

    // region contains

    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 存在返回{@code true}，否则均为{@code false}
     */
    public static boolean contains(final char[] array, char value) {
        if (isEmpty(array)) {
            return false;
        }
        for (char ch : array) {
            if (ch == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 存在返回{@code true}，否则均为{@code false}
     */
    public static boolean contains(final int[] array, int value) {
        if (isEmpty(array)) {
            return false;
        }
        for (int ele : array) {
            if (ele == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * <p>判断数组中是否包含了指定的元素</p>
     * <pre class="code">
     * Arrays.containsElement(new String[]{"aaaa","bbb","cc",null},null); //--- true
     * Arrays.containsElement(new String[]{"aaaa","bbb","cc"},"cc"); //--- true
     * Arrays.containsElement(new String[]{"aaaa","bbb","cc",null},"xx"); //--- false
     * </pre>
     *
     * @param array   数组
     * @param element 检查的元素对象
     * @param <T>     泛型类型声明
     * @return 如果数组中存在则返回{@code true},否则返回{@code false}
     * @see Objects#equals(Object, Object)
     */
    public static <T> boolean contains(final T[] array, T element) {
        if (isEmpty(array)) {
            return false;
        }
        for (Object arrayEle : array) {
            if (Objects.equals(arrayEle, element)) {
                return true;
            }
        }
        return false;
    }

    // endregion

    // region General

    /**
     * 判断是否是数组类型
     * <pre>
     *     Arrays.isArray(null);                                 = false
     *     Arrays.isArray("123");                                = false
     *     Arrays.isArray(new String[]{"aa","bb"});              = true
     * </pre>
     *
     * @param obj 对象
     * @return 如果是数组类型则返回{@code true},否则返回{@code false}
     */
    public static boolean isArray(final Object obj) {
        return (obj != null && obj.getClass().isArray());
    }

    /**
     * 判断是否是数组类型
     * <pre>
     *     Arrays.isPrimitiveArray(null)                         = false
     *     Arrays.isPrimitiveArray(1)                            = false
     *     Arrays.isPrimitiveArray(1L)                           = false
     *     Arrays.isPrimitiveArray("1")                          = false
     *     Arrays.isPrimitiveArray(new String[]{})               = false
     *     Arrays.isPrimitiveArray(new int[]{})                  = true
     *     Arrays.isPrimitiveArray(new byte[]{})                 = true
     * </pre>
     *
     * @param obj 对象实例
     * @return 如果是原生数组类型则返回{@code true},否则返回{@code false}
     */
    public static boolean isPrimitiveArray(final Object obj) {
        return isArray(obj) && obj.getClass().getComponentType().isPrimitive();
    }

    /**
     * 获取数组的长度,如果参数为{@code null}则返回0
     *
     * @param array 数组对象
     * @return 数组的长度
     * @throws IllegalArgumentException 如果参数不是数组，则抛出该异常
     */
    public static int getLength(final Object array) throws IllegalArgumentException {
        if (array == null) {
            return 0;
        }
        return Array.getLength(array);
    }

    /**
     * 新建一个空数组
     *
     * @param componentType 数组类型
     * @param newSize       数组大小
     * @param <T>           数组元素类型
     * @return 空数组
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(Class<?> componentType, int newSize) {
        return (T[]) Array.newInstance(componentType, newSize);
    }

    /**
     * 获取数组对象的元素类型
     *
     * @param array 数组
     * @return 元素类型
     */
    public static Class<?> getComponentType(Object array) {
        return array == null ? null : array.getClass().getComponentType();
    }

    /**
     * 获取数组的元素类型
     *
     * @param arrayClass 数组类
     * @return 元素类型
     */
    public static Class<?> getComponentType(Class<?> arrayClass) {
        return arrayClass == null ? null : arrayClass.getComponentType();
    }

    /**
     * 数组转String
     *
     * @param obj 数组对象
     * @return 数组字符串
     */
    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }

        if (isArray(obj)) {
            // check for primitive array types because they unfortunately cannot be cast to Object[]
            if (obj instanceof boolean[]) {
                return java.util.Arrays.toString((boolean[]) obj);
            } else if (obj instanceof byte[]) {
                return java.util.Arrays.toString((byte[]) obj);
            } else if (obj instanceof char[]) {
                return java.util.Arrays.toString((char[]) obj);
            } else if (obj instanceof short[]) {
                return java.util.Arrays.toString((short[]) obj);
            } else if (obj instanceof int[]) {
                return java.util.Arrays.toString((int[]) obj);
            } else if (obj instanceof float[]) {
                return java.util.Arrays.toString((float[]) obj);
            } else if (obj instanceof double[]) {
                return java.util.Arrays.toString((double[]) obj);
            } else if (obj instanceof long[]) {
                return java.util.Arrays.toString((long[]) obj);
            } else {
                return java.util.Arrays.deepToString((Object[]) obj);
            }
        }
        return obj.toString();
    }

    /**
     * 数组的哈希值
     *
     * @param values 数组的元素
     * @return 哈希值
     */
    public static int hashCode(Object[] values) {
        if (values == null) {
            return 0;
        }
        int result = 1;
        for (Object element : values) {
            result = 31 * result + (element == null ? 0 : element.hashCode());
        }
        return result;
    }

    // endregion

    // region
    // endregion

    // region
    // endregion

    // region
    // endregion

    // region
    // endregion

    // region
    // endregion

    // region
    // endregion

    // region
    // endregion

}
