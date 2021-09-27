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
        if (currentWave == maxWave) {
            this.currentWave = 0;
       return;
        }
        this.currentWave++;
    }

    public void plusVolume() {

        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
            currentVolume--;
        }


    public void decreaseWave() {
        if (currentWave == minWave) {
           this.currentWave = 9;
        return;
        }
        this.currentWave--;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxWave) {
            this.currentWave = maxWave;
            return;
        }
        if (currentWave < minWave) {
            this.currentWave = minWave;
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



