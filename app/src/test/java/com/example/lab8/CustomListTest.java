package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


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
}
