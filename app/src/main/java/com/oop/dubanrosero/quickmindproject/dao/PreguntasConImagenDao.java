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

    public List<PreguntaConImagen> getPreguntasConImagenDeporte(){
        List<PreguntaConImagen> data = new ArrayList<>();
        if (isEnglish){
            String[] opciones = {
                    "Baloncesto","Futboll","Tenis","Hockey"
            };

            PreguntaConImagen preguntaConImagen = new PreguntaConImagen(
                    "http://porquepuedo.net/wp-content/uploads/2016/10/donde-ver-baloncesto.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones,
                    "Baloncesto"
            );

            data.add(preguntaConImagen);

            String[] opciones2 = {
                    "Balon","Tenis","Patin","Raqueta"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "http://porquepuedo.net/wp-content/uploads/2016/10/donde-ver-baloncesto.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones2,
                    "Balon"
            );
            data.add(preguntaConImagen2);
        }

        else {

        }
        return data;
    }

    public PreguntaConImagen getRandomPreguntaConImagen(List<PreguntaConImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
