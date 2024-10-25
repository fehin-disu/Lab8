package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    public CustomList createList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = createList();
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);

    }
    @Test
    public void hasCityTest() {
        list = createList();

        // Create a test city
        City testCity = new City("Halifax", "NS");

        // Initially the list should not have the city
        assertFalse(list.hasCity(testCity));

        // Add the city
        list.addCity(testCity);

        // Now the list should have the city
        assertTrue(list.hasCity(testCity));

        // Test with a different city that's not in the list
        City anotherCity = new City("Toronto", "ON");
        assertFalse(list.hasCity(anotherCity));
    }

    @Test
    public void deleteCityTest(){

        list = createList();
        // Create a test city
        City cityToDelete = new City("Edmonton", "AB");

        // Add the city to the list
        list.addCity(cityToDelete);

        // Now the list should have the city
        assertTrue(list.hasCity(cityToDelete));

        // Delete the city
        list.deleteCity(cityToDelete);

        // Now the list should not have the city
        assertFalse(list.hasCity(cityToDelete));
    }

    @Test
    public void countCityTest(){
        list = createList();
        // Add city to the list
        list.addCity(new City("Halifax", "NS"));

        // Test count
        assertEquals(1, list.countCities());

        // Add another city
        list.addCity(new City("Calgary", "AB"));

        // Test again
        assertEquals(2, list.countCities());


    }
}
