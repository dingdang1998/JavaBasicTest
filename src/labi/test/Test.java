package labi.test;

import labi.test.fivestimer.FivesTimer;
import labi.test.thread.NoticeReceiver;
import labi.test.reciver.Receiver;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2023年02月13日 18:38:00
 */
public class Test {

    public static void main(String[] args) {


        NoticeReceiver noticeReceiver = new NoticeReceiver();

        FivesTimer fivesTimer = new FivesTimer();
        fivesTimer.setNoticeReceiver(noticeReceiver);

        Receiver receiver = new Receiver(fivesTimer);

        noticeReceiver.setReceiver(receiver);

        receiver.start();
    }

}