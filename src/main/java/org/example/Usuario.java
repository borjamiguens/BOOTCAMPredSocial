package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    public ArrayList<Usuario> followedUsers = new ArrayList<>();
    public static ArrayList<Post> userPosts= new ArrayList<>();

    public Usuario(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }



}
