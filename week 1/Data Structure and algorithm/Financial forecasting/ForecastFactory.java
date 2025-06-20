public class ForecastFactory {
    public ForecastStrategy getForecastStrategy(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("SHORT")) {
            return new ShortTermForecast();
        } else if (type.equalsIgnoreCase("MID")) {
            return new MidTermForecast();
        } else if (type.equalsIgnoreCase("LONG")) {
            return new LongTermForecast();
        }
        return null;
    }
}
