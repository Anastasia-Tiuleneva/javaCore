package lesson8;

import lesson8.entity.Weather;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseRepository {


    private String insertWeather = "insert into weather (city, localdate, temperature) values (?, ?, ?)";
    private String getWeather = "select * from weather";
    private static final String DB_PATH = "jdbc:sqlite:C:\\Users\\atyuleneva\\Desktop\\sqllite\\gb.db";


    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public boolean saveWeatherToDatebase(Weather weather) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(DB_PATH);
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);

            connection.setAutoCommit(true);

            saveWeather.setString (1, weather.getCity());
            saveWeather.setString (2, weather.getLocalDate());
            saveWeather.setDouble (3, weather.getTemperature());


            return saveWeather.execute();

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено");
    }


    public boolean saveWeatherToDatebase5(List<Weather> weatherList) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection(DB_PATH);
            connection.setAutoCommit(true);
            for (int i = 0; i < weatherList.size(); i++){
                PreparedStatement saveWeather1 = connection.prepareStatement(insertWeather);
                saveWeather1.setString (1, weatherList.get(i).getCity());
                saveWeather1.setString (2, weatherList.get(i).getLocalDate());
                saveWeather1.setDouble (3, weatherList.get(i).getTemperature());
                saveWeather1.execute();
            }
            return true;

        } catch (SQLException trowables) {
            trowables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено5");
    }




    {
    }

    public List<Weather> getSavedToDBWeather() {
        //подключится к БД, выполнить стэйтмент, получить резальт стэйт, слепить вэтер, вернуть списком
        List<Weather> weatherList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_PATH);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);
            while (resultSet.next()) {
                weatherList.add(new Weather((resultSet.getString("city")),
                        (resultSet.getString("localdate")),
                        (resultSet.getDouble("temperature"))));
            }
            System.out.println(weatherList);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return weatherList;



    }
}
