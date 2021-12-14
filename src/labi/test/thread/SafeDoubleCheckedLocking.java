package labi.test.thread;


/**
 * @program: JavaBasics
 * @description: 基于volatile的解决方案
 * @author: dzp
 * @create: 2021-12-14 17:08
 **/
public class SafeDoubleCheckedLocking {

    private volatile static Instance instance;

    public static Instance getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }
}
