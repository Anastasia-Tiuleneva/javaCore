package lesson7;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson6.Weather;
import lesson7.Period;
import lesson7.WeatherModel;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class AccuweatherModel implements WeatherModel {
    //http://dataservice.accuweather.com/forecasts/v1/daily/1day/349727
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";

    private static final String FIVE_DAYS = "5day";
    private static final String API_KEY = "pXJd8MokcZCdrd2MsoGl2DBZAyCa0zvv";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String METRIC_QUERY_PARAM = "metric";
    private static final String METRIC= "true";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final ObjectMapper objectMapper1 = new ObjectMapper();

    //private DataBaseRepository dataBaseRepository = new DataBaseRepository();

    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(METRIC_QUERY_PARAM, METRIC)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                System.out.println(weatherResponse);
                String date = objectMapper1.readTree(weatherResponse).requiredAt("/DailyForecasts").get(0).at("/Date").asText();
                String temperature = objectMapper1.readTree(weatherResponse).requiredAt("/DailyForecasts").get(0).at("/Temperature/Minimum/Value").asText();
                String recipitation = objectMapper1.readTree(weatherResponse).requiredAt("/DailyForecasts").get(0).at("/Day/PrecipitationType").asText();
                System.out.println("?????????? " + selectedCity + "????????: " + date + " ??????????????????????: " + temperature + " ????????????: " + recipitation);
                break;
            case FIVE_DAYS:
                HttpUrl httpUrl1 = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAYS)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(METRIC_QUERY_PARAM, METRIC)
                        .build();

                Request request1 = new Request.Builder()
                        .url(httpUrl1)
                        .build();

                Response oneDayForecastResponse1 = okHttpClient.newCall(request1).execute();
                String weatherResponse1 = oneDayForecastResponse1.body().string();
                System.out.println(weatherResponse1);
                System.out.println();

                //???????? 1
                String date1 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(0).at("/Date").asText();
                String temperature1 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(0).at("/Temperature/Minimum/Value").asText();
                String recipitation1 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(0).at("/Day/PrecipitationType").asText();

                //???????? 2
                String date2 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(1).at("/Date").asText();
                String temperature2 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(1).at("/Temperature/Minimum/Value").asText();
                String recipitation2 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(1).at("/Day/PrecipitationType").asText();
                System.out.println();
                //???????? 3
                String date3 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(2).at("/Date").asText();
                String temperature3 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(2).at("/Temperature/Minimum/Value").asText();
                String recipitation3 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(2).at("/Day/PrecipitationType").asText();
                //???????? 4
                String date4 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(3).at("/Date").asText();
                String temperature4 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(3).at("/Temperature/Minimum/Value").asText();
                String recipitation4 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(3).at("/Day/PrecipitationType").asText();
                //???????? 5
                String date5 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(4).at("/Date").asText();
                String temperature5 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(4).at("/Temperature/Minimum/Value").asText();
                String recipitation5 = objectMapper1.readTree(weatherResponse1).requiredAt("/DailyForecasts").get(4).at("/Day/PrecipitationType").asText();

                System.out.println("?????????????? ???????????? ???? 5 ????????:");
                System.out.println("?????????? " + selectedCity + "????????: " + date1 + " ??????????????????????: " + temperature1 + " ????????????: " + recipitation1);
                System.out.println("?????????? " + selectedCity + "????????: " + date2 + " ??????????????????????: " + temperature2 + " ????????????: " + recipitation2);
                System.out.println("?????????? " + selectedCity + "????????: " + date3 + " ??????????????????????: " + temperature3 + " ????????????: " + recipitation3);
                System.out.println("?????????? " + selectedCity + "????????: " + date4 + " ??????????????????????: " + temperature4 + " ????????????: " + recipitation4);
                System.out.println("?????????? " + selectedCity + "????????: " + date5 + " ??????????????????????: " + temperature5 + " ????????????: " + recipitation5);
                break;
        }
    }


    private String detectCityKey(String selectCity) throws IOException {
        //http://dataservice.accuweather.com/locations/v1/cities/autocomplete
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();
        return cityKey;
    }
}