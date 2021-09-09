package ru.netology;

public class Radio {

    private int minVolume;
    private int maxVolume = 10;
    private int minWave;
    private int maxWave = 9;
    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxWave() {
        return maxWave;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMinWave(int minWave) {
        this.minWave = minWave;
    }

    public void setMaxWave(int maxWave) {
        this.maxWave = maxWave;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void nextRadioWave(int newCurrentWave) {
        if (newCurrentWave < maxWave) {
            currentWave++;
        } else {
            currentWave = minWave;
        }
    }

    public void radioPlusVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < minWave) {
            return;
        }
        this.currentWave = currentWave;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void decreaseWave() {
        if (currentWave > minWave) {
            currentWave--;
        } else {
            currentWave = minWave;
        }
    }

    public void nextRadioWave() {
        if (currentWave < maxWave) {
            currentWave++;
        } else {
            currentWave = minWave;
        }
    }

    public void previousRadioWave() {
        if (currentWave < maxWave) {
            currentWave = maxWave;
        } else {
            currentWave = minWave;
        }
    }
}


