package ru.netology.smartHome.radio;

public class Radio {
    private int currentStationNumber;
    private int minStationNumber;
    private int maxStationNumber;

    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    private int quantityOfStations;

    public Radio(int quantityOfStations) {
        maxStationNumber = quantityOfStations - 1;
        this.quantityOfStations = quantityOfStations;
    }

    public Radio() {
        quantityOfStations = 10;
        maxStationNumber = quantityOfStations - 1;
    }

    public int next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
        return currentStationNumber;
    }

    public int prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
        return currentStationNumber;
    }


    public int volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < minStationNumber) {
            return;
        }
        if ((currentStationNumber > maxStationNumber)) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    /*public int getMinStationNumber() {
        return minStationNumber;
    }*/

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

   /* public int getMaxStationNumber() {
        return maxStationNumber;
    }*/

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    /*public int getMinVolume() {
        return minVolume;
    }*/

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

   /* public int getMaxVolume() {
        return maxVolume;
    }*/

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public void setQuantityOfStations(int quantityOfStations) {
        this.quantityOfStations = quantityOfStations;
    }
}