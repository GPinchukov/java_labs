package by.gsu.pms;

public class Calculator implements Runnable {
    private final long intervalHead;
    private final long intervalTail;
    private long result;

    public Calculator(long intervalHead, long intervalTail) {
        this.intervalHead = intervalHead;
        this.intervalTail = intervalTail;
    }

    @Override
        public void run() {
            result = 1;
                for (long i = intervalHead; i <= intervalTail; i++) {
                if (i % 2 == 0) {
                result = 2*(i*i+1)*(i*i+1);
            }
        }
    }

    public long getResult() {
        return result;
    }
}
