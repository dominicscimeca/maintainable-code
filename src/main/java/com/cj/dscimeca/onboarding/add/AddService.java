package com.cj.dscimeca.onboarding.add;

public class AddService {
    public String add(int firstNum, int secondNum) {
        int answer = calculateAnswer(firstNum, secondNum);
        return formatToString(firstNum, secondNum, answer);
    }

    private int calculateAnswer(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    private String formatToString(int firstNum, int secondNum, int answer) {
        return String.format("%d + %d = %d", firstNum, secondNum, answer);
    }
}
