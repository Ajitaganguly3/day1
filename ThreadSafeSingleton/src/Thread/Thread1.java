package Thread;

import singleton.Logger;

public class Thread1 extends Thread {

    @Override
    public void run() {
        Logger logger = Logger.getInstance();
        logger.log("This is Thread1");
    }
    
}
