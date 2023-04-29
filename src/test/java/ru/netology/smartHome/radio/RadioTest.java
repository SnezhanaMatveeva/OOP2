package ru.netology.smartHome.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void stationNumberTest() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(7);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTestMinNumber() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTestMaxNumber() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(9);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberTestMoreThanMaxNumber() {
        Radio radio = new Radio();
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        int actual = radio.stationNumber(23);
        int expected = 0;
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
    public void prevMaxTest() {
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
        radio.setCurrentVolume(5);
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        int actual = radio.volumeUp();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volumeUpTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        int actual = radio.volumeUp();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
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