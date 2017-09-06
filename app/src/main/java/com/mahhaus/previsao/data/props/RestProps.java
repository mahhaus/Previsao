package com.mahhaus.previsao.data.props;

/**
 * Created by josias on 04/09/17 - 15:36.
 */

public class RestProps {
    public @interface Props {
        String URL_ATS = "" ;//AtsDataMain.getServerIp();
        String URL_GOOGLE = "https://maps.googleapis.com";
        String URL_OPENWEATHER = "http://api.openweathermap.org/data/2.5";
        String URL_DARKSKY = "https://api.darksky.net";
    }

    public @interface Keys {
        String KEY_OPENWEATHER = "";
        String KEY_DARKSKY = "3c1b9d386fe2c5bbdee674cc846d21ac";
    }

}
