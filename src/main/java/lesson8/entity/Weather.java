package lesson8.entity;

public class Weather {


    private  String city;
    private String localDate;
    private Double temperature;
    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", temperature=" + temperature +
                '}';
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }



    public Weather(String city, String localDate, Double temperature) {
        this.city = city;
        this.localDate = localDate;
        this.temperature = temperature;
    }
}
