package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Radio {

    public int minVolume;
    public int maxVolume = 100;
    public int minWave;
    private int maxWave = 9;
    private int currentWave;
    private int currentVolume;

    public Radio(int currentWave) {
        this.currentWave = currentWave;
    }

    public void nextWave() {
        if (currentWave < maxWave) {
            currentWave++;
        } else {
            currentWave = minWave;
        }
    }

    public void plusVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void setCurrentVolumeMax(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeMin(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseWave() {
        if (currentWave > minWave) {
            currentWave--;
        } else {
            currentWave = maxWave;
        }
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}



