package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void ValueAboveMaxStationNumbers() {
        Radio radioStationNumber = new Radio();
        radioStationNumber.setCurrentRadioStationNumber(15);

        int expected = 0;
        int actual = radioStationNumber.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ValueInsideRangeOfStationNumbers() {
        Radio radioStationNumber = new Radio();
        radioStationNumber.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radioStationNumber.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnToNextRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(9);

        radioStation.nextRadioStationNumber();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnToPrevRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStationNumber(0);

        radioStation.prevRadioStationNumber();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valueAboveMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valueInsideRangeOfVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(8);

        int expected = 8;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.decreaseVolume();

        int expected = 8;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
