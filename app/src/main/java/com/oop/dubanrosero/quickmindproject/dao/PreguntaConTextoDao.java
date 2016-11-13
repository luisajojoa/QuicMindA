package com.oop.dubanrosero.quickmindproject.dao;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;
import com.oop.dubanrosero.quickmindproject.models.PreguntaSinImagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Luisa Jojoa on 12/11/2016.
 */

public class PreguntaConTextoDao {
    boolean isEnglish;

    public PreguntaConTextoDao(boolean isEnglish) {
        this.isEnglish = isEnglish;
    }

    public List<PreguntaSinImagen> getPreguntasConTextDeporte(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Ronaldo","Pele","Maradona","Miroslav Klose"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Who has made the most quantity of goals in a FIFA world cup ever?",
                    Constant.TYPE_DEPORTE,
                    options1,
                    "Miroslav Klose"
            );

            data.add(textQuestion1);


        }

        else {
            String[] opciones1={ "Ronaldo","Pele","Maradona","Miroslav Klose"};
            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Quién es el máximo goleador de la historia de los mundiales?",
                    Constant.TYPE_DEPORTE,
                    opciones1,
                    "Miroslav Klose"
            );
            data.add(preguntaConTexto1);

        }
        return data;
    }

    public List<PreguntaSinImagen> getPreguntasConTextCiencia(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] ooptions1 = {
                    "Mitosis","Meiosis","Cytokinesis","karyiokinesis"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Process by wich the cell divides itself into two daughter cells?",
                    Constant.TYPE_CIENCIAS,
                    ooptions1,
                    "Mitosis"
            );

            data.add(textQuestion1);


        }

        else {
            String[] opciones1= {
              "Mitosis","Meiosis","Citocinesis","Cariocinesis"
            };

            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Cuál es el proceso mediante el cual la célula se divide en dos células hijas?",
                    Constant.TYPE_CIENCIAS,
                    opciones1,
                    "Mitosis"
            );
            data.add(preguntaConTexto1);

        }
        return data;
    }
    public List<PreguntaSinImagen> getPreguntasConTextSociales(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Treinta","Treinta y dos","Treinta y uno","None of the above"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "How many deparments has Colombia?",
                    Constant.TYPE_SOCIALES,
                    options1,
                    "Treinta y dos"
            );

            data.add(textQuestion1);


        }

        else {

            String[] opciones1= {
                    "Treinta","Treinta y dos","Treinta y uno","None of the above"
            };

            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Cuántos departamentos tiene Colombia?",
                    Constant.TYPE_SOCIALES,
                    opciones1,
                    "Treinta y dos"
            );

        }
        return data;
    }
    public List<PreguntaSinImagen> getPreguntasConTextArte(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Tom Cruise", "Will Arnett", "Ben Affleck","Robin Williams"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Wich actor was part of Jumanji?",
                    Constant.TYPE_ARTES,
                    options1,
                    "Robin Williams"
            );

            data.add(textQuestion1);


        }

        else {

            String[] opciones1={
                    "Tom Cruise", "Will Arnett", "Ben Affleck","Robin Williams"
            };

            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Qué actor hizo parte de Jumanji?",
                    Constant.TYPE_ARTES,
                    opciones1,
                    "Robin Williams"
            );
            data.add(preguntaConTexto1);
        }
        return data;
    }

    public PreguntaSinImagen getRandomPreguntaSinImagen(List<PreguntaSinImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
