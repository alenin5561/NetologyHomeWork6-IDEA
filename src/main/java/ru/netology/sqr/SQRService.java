package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int x, int y) {

        int a = 99;
        int b = 0;

        for (int i = 10; i <= y; i++) {
            if (i * i >= x && i * i <= y) {
                b++;
            }

        }
        return b;
    }
}