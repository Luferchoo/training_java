public class OneMinute {
    private int seconds;
    private int hundredths;

    public OneMinute() {
        this.seconds = 0;
        this.hundredths = 0;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", seconds, hundredths);
    }

    public void advance() {
        hundredths++;
        if (hundredths == 100) {
            hundredths = 0;
            seconds++;
            if (seconds == 60) {
                seconds = 0;
            }
        }
    }

    public static void main(String[] args) {
        OneMinute timer = new OneMinute();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
