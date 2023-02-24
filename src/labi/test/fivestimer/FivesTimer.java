package labi.test.fivestimer;

import labi.test.thread.NoticeReceiver;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName FivesTimer.java
 * @Description TODO
 * @createTime 2023年02月14日 08:46:00
 * <p>
 * 创建一个FivesTimer类（继承自Thread）以模拟定时器，每隔n秒主动发起一次通知。
 * 定义Receiver类，在Receiver构造函数创建FivesTimer实例fivesTimer设置每隔5秒通知一次，
 * 每次收到fivesTimer通知即打印一个“=====5秒”的信息；
 * Receiver自己每隔1秒打印1条“1秒”；在main()中创建Receiver实例receiver。
 * 补充说明：本题主要测试你是否理解“观察者模式”的概念；
 * 注意：
 * 1.Receiver类和FivesTimer类必须分属两个包，在同一个包不算对。
 * 2.打印“1秒”和“=====5秒”的代码都应该在Receiver类中。
 */
public class FivesTimer extends Thread {

    private NoticeReceiver noticeReceiver;

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            noticeReceiver.getReceiver().fiveSout();
        }
    }

    public NoticeReceiver getNoticeReceiver() {
        return noticeReceiver;
    }

    public void setNoticeReceiver(NoticeReceiver noticeReceiver) {
        this.noticeReceiver = noticeReceiver;
    }
}
