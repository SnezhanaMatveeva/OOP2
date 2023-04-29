package ru.netology.smartHome.radio;

public class Radio {
    private int currentStationNumber;
    private int minStationNumber;
    private int maxStationNumber;

    private int currentVolume;
    private int minVolume;
    private int maxVolume;


    public int stationNumber(int stationNumber) {
        if (stationNumber > minStationNumber && stationNumber <= maxStationNumber) {
            currentStationNumber = stationNumber;
        }
        return currentStationNumber;
    }


    public int next() {
        int numberNext = currentStationNumber;
        if (numberNext == maxStationNumber) {
            numberNext = minStationNumber;
        } else {
            numberNext = numberNext + 1;
        }
        System.out.println("next" + numberNext);

        return numberNext;
    }


    public int prev() {
        int numberPrev = currentStationNumber;
        if (numberPrev == minStationNumber) {
            numberPrev = maxStationNumber;
        } else {
            numberPrev = numberPrev - 1;
        }
        System.out.println("prev" + numberPrev);
        return numberPrev;
    }


    public int volumeUp() {
        int volumeUp = currentVolume;
        if (volumeUp < maxVolume) {
            volumeUp = volumeUp + 1;
            System.out.println("volume up" + volumeUp);
        }
        return volumeUp;
    }

    public int volumeDown() {
        int volumeDown = currentVolume;
        if (volumeDown > minVolume) {
            volumeDown = volumeDown - 1;
            System.out.println("volume down" + volumeDown);
        }
        return volumeDown;
    }


    /*public int getCurrentStationNumber() {
        return currentStationNumber;
    }*/

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

   /* public int getMinStationNumber() {
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

    /*public int getCurrentVolume() {
        return currentVolume;
    }*/

    public void setCurrentVolume(int currentVolume) {
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
}
