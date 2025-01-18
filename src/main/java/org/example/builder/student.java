package org.example.builder;

public class student {

    private String name;
    private int age;
    private String univName;
    private String batchName;
    private String phone;

    public student(Builder builder){
        if(builder.getAge()>100){
            throw new IllegalArgumentException("wrong age");
        }

        this.name=builder.getName();
        this.age=builder.getAge();
        this.batchName=builder.getBatchName();
        this.univName=builder.getUnivName();
        this.phone=builder.getPhone();
    }
    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUnivName() {
        return univName;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getPhone() {
        return phone;
    }

public static Builder getbuilder(){
        return new Builder();
}

}
