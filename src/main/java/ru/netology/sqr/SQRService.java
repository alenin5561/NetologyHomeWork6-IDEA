package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int border1, int border2) {

        int numberMax = 99;
        int successful = 0;

        for (int i = 10; i <= border2; i++) {
            if (i * i >= border1 && i * i <= border2) {
                successful++;
            }

        }
        return successful;
    }
}