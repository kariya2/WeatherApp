package model;

/**
 * Created by Kanav on 7/28/15.
 */
public class CurrentConditions {

    private int weatherID;
    private String condition;
    private String description;
    private String icon;
    private float pressure;
    private float humidity;
    private float maxT;
    private float minT;
    private double tempperature;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public float getMaxT() {
        return maxT;
    }

    public void setMaxT(float maxT) {
        this.maxT = maxT;
    }

    public float getMinT() {
        return minT;
    }

    public void setMinT(float minT) {
        this.minT = minT;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public double getTempperature() {
        return tempperature;
    }

    public void setTempperature(double tempperature) {
        this.tempperature = tempperature;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }
}
