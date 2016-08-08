package model;

/**
 * Created by Kanav on 7/28/15.
 */
public class Weather {

    private Location location = new Location();
    private String iconData;
    public CurrentConditions currentConditions = new CurrentConditions();
    public temperature temperature = new temperature();
    public Wind wind = new Wind();
    public Snow snow  = new Snow();
    public Clouds clouds = new Clouds();


}
