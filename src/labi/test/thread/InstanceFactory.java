package labi.test.thread;

/**
 * @program: JavaBasics
 * @description: 基于类初始化的解决方案
 * @author: dzp
 * @create: 2021-12-14 17:13
 **/
public class InstanceFactory {

    private static class InstanceHolder {
        public static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return InstanceHolder.instance;
    }
}
