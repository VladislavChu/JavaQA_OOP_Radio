package ru.netology.javaqa;

public class Radio {

    public int currentRadioStationNumber;
    public int maxStation = 9;
    public int minStation = 0;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber >= maxStation) {
            currentRadioStationNumber = minStation;
            return;
        }
        currentRadioStationNumber++;
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber <= minStation) {
            currentRadioStationNumber = maxStation;
            return;
        }
        currentRadioStationNumber--;
        setCurrentRadioStationNumber(currentRadioStationNumber);

    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}