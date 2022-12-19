package lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Weather {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .build();

        HttpUrl newUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("/forecasts/v1/daily/1day/295212")
                .addQueryParameter("apikey", "qe9W8e7Qagy7w0nEjOATdBbTqjMBA4ii")
                .build();
        Request request = new Request.Builder()
                .url(newUrl)
                .get()
                .build();

        Response response = client.newCall(request).execute();
//        System.out.println(response.code());
//        System.out.println(response.headers());
        System.out.println(response.body().string());

    }
}
