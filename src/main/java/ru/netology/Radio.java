package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {

    private int minVolume;
    private int maxVolume = 100;
    private int minWave;
    private int currentWave;
    private int currentVolume;
    private int maxWave = 9;
    private int numberOfRadioStations;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.maxWave = numberOfRadioStations - 1;
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
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }
}



