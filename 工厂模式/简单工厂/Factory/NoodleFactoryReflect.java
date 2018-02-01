package 工厂模式.简单工厂.Factory;

import 工厂模式.简单工厂.INoodle.INoodle;

public class NoodleFactoryReflect {
    /**
     * 使用反射来创建对应的类并以父类返回，这里和NoodleFactory不同的是：
     *     不是根据字段来判断，而是直接用反射创建
     * 不支持多参数创建，默认使用无参构造
     * @param clz
     * @return
     */
    public static <T extends INoodle> T newInstance(Class<T> clz) {
        T noodle = null;
        try {
            noodle = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return noodle;
    }
}
