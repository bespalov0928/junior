package ru.job4j.pojo;

public class Student {
    private String fio;
    private String group;
    private String dataReceipt;

    public String getFIO() {
        System.out.println("FIO: " + fio);
        return fio;
    }

    public void setFIO(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        System.out.println("Group: " + group);
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDataReceipt() {
        System.out.println("DataReceipt: " + dataReceipt);
        return dataReceipt;
    }

    public void setDataReceipt(String dataReceipt) {
        this.dataReceipt = dataReceipt;
    }
}
