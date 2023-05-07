package ru.netology.smartHome.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void currentStationTest() {
        // Radio radio = new Radio();
        radio.setCurrentStationNumber(3);
        int expected = 3;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeTest() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTest() {
        //Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(7);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTestMinNumber() {
        // Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTestMaxNumber() {
        //Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(9);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTestMoreThanMaxNumber() {
        //Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(23);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextIfMaxTest() {
        //Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextIfMinTest() {
        //Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.next();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        //Radio radio = new Radio();
        radio.setCurrentStationNumber(6);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.next();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinTest() {
        //Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMaxTest() {
        //Radio radio = new Radio();
        radio.setCurrentStationNumber(7);
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.prev();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest1() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        int actual = radio.volumeUp();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeUpTest2() {
        //Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        int actual = radio.volumeUp();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest1() {
        // Radio radio = new Radio();
        radio.setCurrentVolume(14);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        int actual = radio.volumeDown();
        int expected = 13;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest2() {
        // Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        int actual = radio.volumeDown();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quantityOfStationsTest() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(30, radio.getQuantityOfStations());
    }

    @Test
    public void quantityOfStationsTest1() {
        //Radio radio = new Radio();
        radio.setQuantityOfStations(25);
        Assertions.assertEquals(25, radio.getQuantityOfStations());

    }


}