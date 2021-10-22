package com.leolmcoding.forum.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import com.leolmcoding.forum.modelo.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {
    @RequestMapping("/topicos")
    public ArrayList<Topico> lista(){
        Topico topico = new Topico("Duvida","Duvida com Spring",new Curso("Spring","Programacao"));
        ArrayList<Topico> topicos = new ArrayList<Topico>();
        for(int x=0;x<4;x++){
            topicos.add(topico);
        }
        return topicos;
    }
}
