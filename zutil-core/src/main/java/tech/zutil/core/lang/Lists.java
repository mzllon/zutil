package tech.zutil.core.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * {@linkplain List}工具类
 *
 * @author miles.tang
 * @version 0.0.1
 * @date 2022-07-13
 */
public class Lists extends Collections {

    // region empty list

    /**
     * 返回不可变的空集合
     *
     * @param <T> 集合元素类型
     * @return 空集合，不可变
     */
    public static <T> List<T> immutableEmptyList() {
        return java.util.Collections.emptyList();
    }

    /**
     * 返回空集合，<span style="color: red;">可进行增删改查的</span>
     *
     * @param <T> 集合元素类型
     * @return 空集合，可变的
     * @see #immutableEmptyList()
     */
    public static <T> List<T> emptyList() {
        return new ArrayList<>(0);
    }

    // endregion

    // region
    // endregion

    // region
    // endregion

}
