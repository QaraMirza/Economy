public class GDP {
    private double gdpValue;
    private double gdpIncreasing;

    public GDP(int gdpValue) {
        this.gdpValue = gdpValue;
        this.gdpIncreasing = 0;
    }

    public GDP(int gdpValue, int gdpIncreasing) {
        this.gdpValue = gdpValue;
        this.gdpIncreasing = gdpIncreasing;
    }

    private void increasing() {
        this.gdpValue = this.gdpValue * (1 + (gdpIncreasing / 100));
    }

    public void demonstrate(int period) throws InterruptedException {
        for(int i = 0; i < period; i++) {
            Viewer.view(gdpValue);
            increasing();
        }
    }

    public void demonstrate(int period, int year) throws InterruptedException {
        for(int i = 0; i < period; i++) {
            Viewer.view(gdpValue, year++);
            increasing();
        }
    }
}
