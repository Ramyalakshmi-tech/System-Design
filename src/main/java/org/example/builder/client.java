package org.example.builder;

public class client {
    public static void main(String[] args){
        Builder builder=new Builder();
        builder.setName("Ramya");
        builder.setAge(23);
        builder.setUnivName("Sathyabama");
        builder.setBatchName("2022");
        builder.setPhone("32145");

        student student=new student(builder);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getBatchName());
    }
}
