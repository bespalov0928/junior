package ru.job4j.poly;

/**
 * class Bus описывает автобус
 */
public class Bus implements Transport {

    private int passengerCount;
    /**
     * автобус едет
     */
    public void go() {

    }

    /**
     * клоичесатво пассажиров в автобусе
     * @param passengerCount количество пассажиров
     */
    public void passengers(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    /**
     * стоимость зправки автобуса
     * @param countFuel количество топлива
     * @return стоимость заправки
     */
    public float filUp(int countFuel) {
        return countFuel * 30;
    }
}
