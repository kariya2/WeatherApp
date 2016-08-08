package Util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Kanav on 7/28/15.
 */
public class Utils {

    public static final String BASE_URL = "api.openweathermap.org/data/2.5/weather?q=";
    public static final String ICON_URL = "openweathermap.org/img/w/";

    public static JSONObject getObject(String tagName, JSONObject jsonObject) throws JSONException{
        JSONObject jsonObject1 = jsonObject.getJSONObject(tagName);
        return jsonObject1;
    }

    public static String getString(String tagName, JSONObject jsonObject) throws JSONException{
        return jsonObject.getString(tagName);
    }

    public static float getFloat(String tagName, JSONObject jsonObject) throws JSONException{
        return (float) jsonObject.getDouble(tagName);
    }

    public static float getDouble(String tagName, JSONObject jsonObject) throws JSONException{
        return (float) jsonObject.getDouble(tagName);
    }

    public static int getInt(String tagName, JSONObject jsonObject) throws JSONException{
        return  jsonObject.getInt(tagName);
    }

}
