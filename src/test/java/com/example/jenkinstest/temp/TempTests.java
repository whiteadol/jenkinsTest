package com.example.jenkinstest.temp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TempTests {

    @Test
    void testV1p(){

        List<String> list = new ArrayList<>();

        String str = list.get(0);

        System.out.println(str + str);
    }
}
