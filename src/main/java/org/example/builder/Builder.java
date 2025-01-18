package org.example.builder;

public class Builder {
    private String name;
    private int age;
    private String univName;
    private String batchName;
    private String phone;
    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getUnivName() {
        return univName;
    }

    public Builder setUnivName(String univName) {
        this.univName = univName;
        return this;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   public student build(){
        return new student(this);
   }


}
