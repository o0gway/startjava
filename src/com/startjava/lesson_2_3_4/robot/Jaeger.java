package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private int speed;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        System.out.print(modelName + " ");
        if (speed > 0) {
            move();
        } else {
            stop();
        }
    }

    private void move() {
        System.out.println("moving");
    }

    private void stop() {
        System.out.println("stop");
    }

    public void showInfo() {
        System.out.println("???????????? ????????????: " + modelName);
        System.out.println("???????? ????????????: " + mark);
        System.out.println("???????????????????? ??: " + origin);
        System.out.println("???????? ????????????: " + height);
        System.out.println("?????? ????????????: " + weight);
        System.out.println("???????????????? ????????????: " + strength);
        System.out.println("?????????????? ???????????? ????????????: " + armor);
    }

    public static void toCompare(Jaeger jaeger1, Jaeger jaeger2) {
        System.out.println("???????????????? ???????????????????? ???????? ??????????????: " + jaeger1.modelName + " ?? " + jaeger2.modelName);
        if (jaeger1.modelName.equals(jaeger2.modelName)) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ??????????");
        } else {
            System.out.println("?? ???????? ?????????????? ???????????? ??????????");
        }

        if (jaeger1.mark.equals(jaeger2.mark)) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ??????????");
        } else {
            System.out.println("?? ???????? ?????????????? ???????????? ??????????");
        }

        if (jaeger1.origin.equals(jaeger2.origin)) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ???????????? ??????????????????????????");
        } else {
            System.out.println("?? ???????? ?????????????? ???????????? ???????????? ??????????????????????????");
        }

        if (jaeger1.height == jaeger2.height) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ????????????");
        } else if (jaeger1.height > jaeger2.height) {
            System.out.println(jaeger1.modelName + " ???????? " + jaeger2.modelName);
        } else {
            System.out.println(jaeger2.modelName + " ???????? " + jaeger1.modelName);
        }

        if (jaeger1.weight == jaeger2.weight) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ??????");
        } else if (jaeger1.weight > jaeger2.weight) {
            System.out.println(jaeger1.modelName + " ?????????????? " + jaeger2.modelName);
        } else {
            System.out.println(jaeger2.modelName + " ?????????????? " + jaeger1.modelName);
        }

        if (jaeger1.strength == jaeger2.strength) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ????????");
        } else if (jaeger1.strength > jaeger2.strength) {
            System.out.println(jaeger1.modelName + " ?????????????? " + jaeger2.modelName);
        } else {
            System.out.println(jaeger2.modelName + " ?????????????? " + jaeger1.modelName);
        }

        if (jaeger1.strength == jaeger2.strength) {
            System.out.println("?? ???????? ?????????????? ???????????????????? ????????????");
        } else if (jaeger1.strength > jaeger2.strength) {
            System.out.println(jaeger1.modelName + " ???????????? ???????????? ?????? " + jaeger2.modelName);
        } else {
            System.out.println(jaeger2.modelName + " ???????????? ???????????? ?????? " + jaeger1.modelName);
        }
    }
}