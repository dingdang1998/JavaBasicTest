package labi.test.reciver;

import labi.test.fivestimer.FivesTimer;

/**
 * @author labi
 * @version 1.0.0
 * @ClassName Receiver.java
 * @Description TODO
 * @createTime 2023年02月14日 08:56:00
 */
public class Receiver extends Thread{

    private FivesTimer fivesTimer;

    public Receiver(FivesTimer fivesTimer){
        this.fivesTimer = fivesTimer;
    }

    @Override
    public void run() {
        fivesTimer.start();

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            oneSout();
        }
    }

    public void fiveSout(){
        System.out.println("=====5秒");
    }

    public void oneSout(){
        System.out.println("1秒");
    }

    public FivesTimer getFivesTimer() {
        return fivesTimer;
    }

    public void setFivesTimer(FivesTimer fivesTimer) {
        this.fivesTimer = fivesTimer;
    }


}
