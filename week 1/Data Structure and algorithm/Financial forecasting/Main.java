public class Main {
    public static void main(String[] args) {
        ForecastFactory factory = new ForecastFactory();

        ForecastStrategy forecast1 = factory.getForecastStrategy("SHORT");
        forecast1.forecast();

        ForecastStrategy forecast2 = factory.getForecastStrategy("MID");
        forecast2.forecast();

        ForecastStrategy forecast3 = factory.getForecastStrategy("LONG");
        forecast3.forecast();
    }
}
