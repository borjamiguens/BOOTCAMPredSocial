package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private String tituloPost;
    private Date fechaPost;
    public static ArrayList<Comentario> postComentarios= new ArrayList<>();

    public Post(String titulo) {
        this.tituloPost=titulo;
        //this.fechaPost;
    }


}
