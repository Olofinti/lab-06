package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /**
     * The name of the city
     */
    private String city;
    /**
     * The name of the province
     */
    private String province;

    /**
     * Constructor for the City class
     * @param city The name of the city
     * @param province The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Getter for the city name
     * @return The name of the city
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Getter for the province name
     * @return The name of the province
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares the current city's name with another city's name
     * @param o The city object to compare to
     * @return 0 if names are equal, negative if this name is lexicographically smaller, positive otherwise
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }
}
