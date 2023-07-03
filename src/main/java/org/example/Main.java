package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Usuario> listaUsuarios=new ArrayList<>();

        //añadimos usuarios
        Usuario usuario1=new Usuario("Borja");
        Usuario usuario2=new Usuario("Paco");
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        //lista de usuarios del sistema
        for(Usuario u : listaUsuarios) {
            System.out.println(u.getNombre());
        }

        //añadimos a usuario2 a la lista de followedUsers de usuario1
        usuario1.followedUsers.add(usuario2);
        //mostramos followedUsers de usuario1
        for(Usuario u : usuario1.followedUsers) {
            System.out.println(u.getNombre());
        }

        //Borja añade un post
        usuario1.userPosts.add(Post post1 =new Post("Primer post Borja") );

    }





}