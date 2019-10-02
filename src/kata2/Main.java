package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(1,2,3,4,12,2);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
