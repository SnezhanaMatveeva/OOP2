package ru.netology.smartHome.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void currentStationTestMoreThenMax() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(12);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationTestLessThenMin() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(-12);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationTest1() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeTestMoreTnenMax() {
        //radio.setMinStationNumber(0);
        // radio.setMaxStationNumber(9);
        radio.setCurrentVolume(14);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeTestMoreLessThenMin() {
        //radio.setMinStationNumber(0);
        // radio.setMaxStationNumber(9);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityOfStationsTest() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(30, radio.getQuantityOfStations());
    }

    @Test
    public void quantityOfStationsTest1() {
        radio.setQuantityOfStations(25);
        Assertions.assertEquals(25, radio.getQuantityOfStations());
    }

    @Test
    public void quantityOfStationsTest2() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getQuantityOfStations());
    }

    @Test
    public void quantityOfStationsTest3() {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(15);
        int expected = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, 15);
    }


    @Test
    public void currentStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(3);
        int expected = 3;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeTest() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentVolume(4);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextIfMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextIfMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.next();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.next();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.prev();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest1() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentVolume(5);
        int actual = radio.volumeUp();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeUpTest2() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentVolume(9);
        int actual = radio.volumeUp();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest1() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentVolume(4);
        int actual = radio.volumeDown();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        int actual = radio.volumeDown();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


}