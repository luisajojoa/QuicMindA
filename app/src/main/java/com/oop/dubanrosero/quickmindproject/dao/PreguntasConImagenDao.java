package com.oop.dubanrosero.quickmindproject.dao;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jhon on 11/11/16.
 */

public class PreguntasConImagenDao {
     boolean isEnglish;

    public PreguntasConImagenDao(boolean isEnglish) {
        this.isEnglish = isEnglish;
    }

    public List<PreguntaConImagen> getPreguntasConImagenCiencia(){

        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    options1,
                    "Kirchhoff"
            );

            data.add(imageQuestion1);


        }

        else {

            String[] opciones1 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    opciones1,
                    "Kirchhoff"
            );
            data.add(preguntaConImagen1);

        }
        return data;
    }

    public List<PreguntaConImagen> getPreguntasConImagenDeporte(){
        List<PreguntaConImagen> data = new ArrayList<>();
        if (isEnglish){
            String[] options1 = {
                    "Celta de Vigo","Malaga","Cruz Azul","Cuy sabor"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "https://www.ecured.cu/images/thumb/f/f9/Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg/260px-Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg",
                    Constant.TYPE_DEPORTE,
                    options1,
                    "Celta de Vigo"
            );

            data.add(imageQuestion1);


        }

        else {

            String[] opciones1 = {
                    "Celta de Vigo","Malaga","Cruz Azul","Cuy sabor"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "https://www.ecured.cu/images/thumb/f/f9/Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg/260px-Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones1,
                    "Celta de Vigo"
            );
            data.add(preguntaConImagen1);

        }
        return data;
    }
    public List<PreguntaConImagen> getPreguntasConImagenSociales(){
        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Philipins","Puerto Rico","Dominican Republic","Vietnam"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://vignette4.wikia.nocookie.net/worldmusicfestival/images/1/17/Filipinas_Flag_Bandera.jpg/revision/latest?cb=20140710180135",
                    Constant.TYPE_SOCIALES,
                    options1,
                    "Philipins"
            );

            data.add(imageQuestion1);


        }

        else {

            String[] opciones1 = {
                    "Filipinas","Puerto Rico","Republica Dominicana","Vietnam"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://vignette4.wikia.nocookie.net/worldmusicfestival/images/1/17/Filipinas_Flag_Bandera.jpg/revision/latest?cb=20140710180135",
                    Constant.TYPE_SOCIALES,
                    opciones1,
                    "Filipinas"
            );
            data.add(preguntaConImagen1);

        }

        return data;
    }

    public List<PreguntaConImagen> getPreguntasConImagenArtes(){
        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Chimera","Minotaur","Centaur","Griffin"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://vignette1.wikia.nocookie.net/el-bestiario/images/0/06/Quimera.jpg/revision/latest?cb=20141011201106&path-prefix=es",
                    Constant.TYPE_ARTES,
                    options1,
                    "Chimera"
            );

            data.add(imageQuestion1);


        }

        else {

            String[] opciones1 = {
                    "Quimera","Minotauro","Grifo","Centauro"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://vignette1.wikia.nocookie.net/el-bestiario/images/0/06/Quimera.jpg/revision/latest?cb=20141011201106&path-prefix=es",
                    Constant.TYPE_ARTES,
                    opciones1,
                    "Quimera"
            );
            data.add(preguntaConImagen1);

        }

        return data;
    }


    public PreguntaConImagen getRandomPreguntaConImagen(List<PreguntaConImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
