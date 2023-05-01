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


    /*public int next() {
        int numberNext = currentStationNumber;
        if (numberNext == maxStationNumber) {
            numberNext = minStationNumber;
        } else {
            numberNext = numberNext + 1;
        }
        System.out.println("next" + numberNext);

        return numberNext;
    }*/

    public int next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
        System.out.println("next station is " + currentStationNumber);
        return currentStationNumber;
    }


   /* public int prev() {
        int numberPrev = currentStationNumber;
        if (numberPrev == minStationNumber) {
            numberPrev = maxStationNumber;
        } else {
            numberPrev = numberPrev - 1;
        }
        System.out.println("prev" + numberPrev);
        return numberPrev;
    }*/

    public int prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
        System.out.println("prev station is " + currentStationNumber);
        return currentStationNumber;
    }


    public int volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            System.out.println("volume up " + currentVolume);
        }
        return currentVolume;
    }

    public int volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
            System.out.println("volume down " + currentVolume);
        }
        return currentVolume;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

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

    public int getCurrentVolume() {
        return currentVolume;
    }

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