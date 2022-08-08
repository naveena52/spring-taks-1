package com.example.HelloWorld;

public class student {
    private int id;
    private  String stname;
    public String staddress;
    student(int id ,String stname,String staddress){
        this.id=id;
        this.stname=stname;
        this.staddress=staddress;
    }

    public int getId() {
        return id;
    }

    public String getStname() {
        return stname;
    }

    public String getStaddress() {
        return staddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public void setStaddress(String staddress) {
        this.staddress = staddress;
    }
    public String toString()
    {
        return String.format("student[%d,%s,%s]",id,stname,staddress);
    }

}

