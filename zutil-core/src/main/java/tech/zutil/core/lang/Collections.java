package tech.zutil.core.lang;

import java.util.Collection;

/**
 * 集合工具类
 *
 * @author miles.tang
 * @version 0.0.1
 * @date 2022-07-13
 */
public class Collections {

    // region Assert Empty

    /**
     * 判断集合是否为空
     * <pre class="code">Collections.isEmpty(list);</pre>
     *
     * @param c 集合
     * @return 如果集合为{@code null}或为空是则返回{@code true}，否则返回{@code false}
     */
    public static boolean isEmpty(Collection<?> c) {
        return (c == null || c.isEmpty());
    }

    /**
     * 判断集合不为空
     *
     * @param c 集合
     * @return 不为空则返回{@code true}，否则返回{@code  false}
     */
    public static boolean isNotEmpty(Collection<?> c) {
        return !isEmpty(c);
    }

    // endregion


}
