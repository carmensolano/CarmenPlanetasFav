package com.example.carme.carmenplanetasfav;

public class Planeta {
    private int id;
    private String titulo, info;


    public Planeta(int id,  String titulo, String info){
        this.id = id;
        this.titulo = titulo;
        this.info = info;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }
}
