package blitz;

import java.util.ArrayList;
import java.util.List;

public class WeatherSensor {
    /**
     * A temperature monitoring system that records hourly readings.
     * 
     * This class should:
     * - Store multiple temperature readings in a list
     * - Calculate the average temperature from all recorded readings
     * 
     * Think about: How do you add items to a list? How do you calculate an average?
     * What happens when there are no temperature readings yet?
     */
    private final List<Double> hourlyTemps = new ArrayList<>();

    /**
     * Record a new temperature reading.
     * 
     * @param temp the temperature to record
     */
    public void record(double temp) {
        // TODO: Implement temperature recording
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Calculate the average temperature from all recorded readings.
     * 
     * @return the average temperature, or 0.0 if no readings recorded
     */
    public double averageTemp() {
        // TODO: Implement average temperature calculation
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 