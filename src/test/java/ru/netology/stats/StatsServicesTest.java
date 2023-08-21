package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StatsServicesTest {
    int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsServices services = new StatsServices();

    @org.junit.jupiter.api.Test
    void sumOfAll() {
        int expected = 180;
        int actual = services.sumOfAll(array);
        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void averageSum() {
        double expected = 15.0;
        double actual = services.averageSum(array);
        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void numOfTopSaleMonth() {
        int expected = 8;
        int actual = services.numOfTopSaleMonth(array);
        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void numOfBotSaleMonth() {
        int expected = 9;
        int actual = services.numOfBotSaleMonth(array);
        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void countOfLowAverageSale() {
        int expected = 5;
        int actual = services.countOfLowAverageSale(array);
        Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void countOfHighAverageSale() {
        int expected = 5;
        int actual = services.countOfHighAverageSale(array);
        Assertions.assertEquals(actual, expected);
    }
}