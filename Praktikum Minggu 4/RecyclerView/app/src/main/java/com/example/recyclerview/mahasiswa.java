package com.example.recyclerview;

public class mahasiswa {

    private String name;
    private String npm;
    private String hp;

    public mahasiswa(String name, String npm, String hp){
        this.name = name;
        this.npm = npm;
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNpm(){
        return npm;
    }

    public void setNpm(String npm){
        this.npm = npm;
    }

    public String getHp(){
        return hp;
    }

    public void setHp(){
        this.hp = hp;
    }
}
