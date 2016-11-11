package com.oop.dubanrosero.quickmindproject;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.dao.PreguntasConImagenDao;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;
import com.oop.dubanrosero.quickmindproject.models.PreguntaSinImagen;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PreguntaJuego extends Activity implements View.OnClickListener {
    TextView pregunta;
    Button respuestaUno,respuestaDos,respuestaTres,respuestaCuatro;
    ArrayList<PreguntaSinImagen> preguntasDeGeografia=new ArrayList<PreguntaSinImagen>();
    ArrayList<PreguntaConImagen> preguntasDeGeografiaConImagen=new ArrayList<PreguntaConImagen>();
    Random genradorDeRandom=new Random();
    int iteradorDePregunta,iteradorTipoDePregunta;
    int iteradorDeNumeroDePreguntas=0;
    int numeroDeVidas=3;
    ImageView corazonUno,corazonDos,corazonTres,cambioDepregunta,cincuenta,rendirse;
    ImageView imagen;
    PreguntaConImagen preguntaRandom;

    public void doSomething() {
        int x=1;
    }

    public void crearPregunta() {
        iteradorDeNumeroDePreguntas++;
        pregunta= (TextView) findViewById(R.id.textView2);
        imagen= (ImageView) findViewById(R.id.imagen);
        pregunta.setAlpha(0);
        if(iteradorDeNumeroDePreguntas%3!=0){
            iteradorTipoDePregunta=1;
            iteradorDePregunta=genradorDeRandom.nextInt(preguntasDeGeografia.size());
            imagen.setImageResource(0);
            pregunta.setAlpha(1);
            pregunta.setText(preguntasDeGeografia.get(iteradorDePregunta).getPregunta());
            respuestaUno= (Button) findViewById(R.id.respuestaUno);
            respuestaUno.setText(preguntasDeGeografia.get(iteradorDePregunta).getOpciones()[0]);
            respuestaDos= (Button) findViewById(R.id.respuestaDos);
            respuestaDos.setText(preguntasDeGeografia.get(iteradorDePregunta).getOpciones()[1]);
            respuestaTres= (Button) findViewById(R.id.respuestaTres);
            respuestaTres.setText(preguntasDeGeografia.get(iteradorDePregunta).getOpciones()[2]);
            respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);
            respuestaCuatro.setText(preguntasDeGeografia.get(iteradorDePregunta).getOpciones()[3]);
        }else {
            iteradorTipoDePregunta=2;
            iteradorDePregunta=genradorDeRandom.nextInt(preguntasDeGeografiaConImagen.size());
            //imagen.setImageResource(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getImagen());
            Picasso.with(this).load(preguntaRandom.getImagen()).into(imagen);
            respuestaUno= (Button) findViewById(R.id.respuestaUno);
            respuestaUno.setText(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getOpciones()[0]);
            respuestaDos= (Button) findViewById(R.id.respuestaDos);
            respuestaDos.setText(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getOpciones()[1]);
            respuestaTres= (Button) findViewById(R.id.respuestaTres);
            respuestaTres.setText(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getOpciones()[2]);
            respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);
            respuestaCuatro.setText(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getOpciones()[3]);
        }
    }

    public void volverATodosBlancos(Button respuestaUno,Button respuestaDos,Button respuestaTres,Button respuestaCuatro) {
        respuestaUno.setBackgroundColor(getResources().getColor(R.color.gris));
        respuestaDos.setBackgroundColor(getResources().getColor(R.color.gris));
        respuestaTres.setBackgroundColor(getResources().getColor(R.color.gris));
        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.gris));
    }

    public void quitarCorazon(int numeroDeVidas){
        corazonTres= (ImageView) findViewById(R.id.corazon3);
        corazonDos= (ImageView) findViewById(R.id.corazon2);
        corazonUno= (ImageView) findViewById(R.id.corazon1);
        if (numeroDeVidas==0) {
            corazonTres.setAlpha(0);
            volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
        }
        if (numeroDeVidas==1) {
            corazonUno.setAlpha(0);
            volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
            crearPregunta();
        }
        if (numeroDeVidas==2) {
            corazonDos.setAlpha(0);
            volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
            crearPregunta();
        }
    }

    public void rectificarRespuestaCorrecta(Button respuestaUno,Button respuestaDos,Button respuestaTres,Button respuestaCuatro) {
        if(respuestaUno.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta())) {
            respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaDos.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta())) {
            respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaTres.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta())) {
            respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
        }
        if(respuestaCuatro.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta())) {
            respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pregunta_juego);
        PreguntasConImagenDao preguntasConImagenDao = new PreguntasConImagenDao(getResources().getBoolean(R.bool.isEnglish));
        List<PreguntaConImagen> dataPreguntas = preguntasConImagenDao.getPreguntasConImagenDeporte();
        preguntaRandom = preguntasConImagenDao.getRandomPreguntaConImagen(dataPreguntas);



        //instanciacion de preguntas de geografia sin imagen
        String [] respuestasPregunta1={"rusia","canada","estados unidos ","china"};
        PreguntaSinImagen pregunta1=new PreguntaSinImagen("cual es el pais mas garnde de el mundo ?", Constant.TYPE_SOCIALES,respuestasPregunta1,"rusia");
        preguntasDeGeografia.add(pregunta1);
        String [] respuestasPregunta2={"6","4","5","3"};
        PreguntaSinImagen pregunta2=new PreguntaSinImagen("cuantos oceanos hay en el planeta tierra?",Constant.TYPE_SOCIALES,respuestasPregunta2,"5");
        preguntasDeGeografia.add(pregunta2);
        String [] respuestasPregunta3={"monterreal","ottawa","toronto","ninguna de las anteriores"};
        PreguntaSinImagen pregunta3=new PreguntaSinImagen("cual es la capital de canada ?",Constant.TYPE_SOCIALES,respuestasPregunta3,"ottawa");
        preguntasDeGeografia.add(pregunta3);

        //instanciacion de Constant.TYPE_SOCIALEScon imagen
        String [] respuestasPregunta4={"Florencia","Roma","Viena","Matera"};
        PreguntaConImagen pregunta4=new PreguntaConImagen("http://www.mundoprimaria.com/wp-content/uploads/2014/06/El-Coliseo-foto-1-e1445523238544.jpg",Constant.TYPE_SOCIALES,respuestasPregunta4,"Roma");
        preguntasDeGeografiaConImagen.add(pregunta4);
        String [] respuestasPregunta5={"francia","italia","gracia","alemania"};
        PreguntaConImagen pregunta5=new PreguntaConImagen("http://www.mundoprimaria.com/wp-content/uploads/2014/06/El-Coliseo-foto-1-e1445523238544.jpg",Constant.TYPE_SOCIALES,respuestasPregunta5,"francia");
        preguntasDeGeografiaConImagen.add(pregunta5);
        String [] respuestasPregunta6={"inglaterra","francia","rusia","holanda"};
        PreguntaConImagen pregunta6=new PreguntaConImagen("http://www.mundoprimaria.com/wp-content/uploads/2014/06/El-Coliseo-foto-1-e1445523238544.jpg",Constant.TYPE_SOCIALES,respuestasPregunta6,"holanda");
        preguntasDeGeografiaConImagen.add(pregunta6);


        //PreguntaSinImagen pregunta81 = new PreguntaSinImagen(String.valueOf(R.string.pregunta81Constant.TYPE_SOCIALES,String.valueOf(R.array.respuesta1Pregunta81),
          //      String.valueOf(R.string.respuestaCorrecta81));

        //crecion de pregunta
        crearPregunta();

        //habilitacion de eventos
        cambioDepregunta= (ImageView) findViewById(R.id.cambioDePregunta);
        cambioDepregunta.setOnClickListener(this);
        cincuenta= (ImageView) findViewById(R.id.menosDos);
        cincuenta.setOnClickListener(this);
        rendirse= (ImageView) findViewById(R.id.rendirse);
        rendirse.setOnClickListener(this);
        respuestaUno.setOnClickListener(this);
        respuestaDos.setOnClickListener(this);
        respuestaTres.setOnClickListener(this);
        respuestaCuatro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        respuestaUno= (Button) findViewById(R.id.respuestaUno);
        respuestaDos= (Button) findViewById(R.id.respuestaDos);
        respuestaTres= (Button) findViewById(R.id.respuestaTres);
        respuestaCuatro= (Button) findViewById(R.id.respuestaCuatro);
        switch (view.getId()){
            case R.id.respuestaUno:
                if (respuestaUno.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==1){
                    respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            doSomething();
                        }
                    },10000);
                    volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                    crearPregunta();
                }else {
                    if (respuestaUno.getText().equals(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==2) {
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta();
                    }else{
                        respuestaUno.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.respuestaDos:
                if (respuestaDos.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==1){
                    respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
                    volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                    crearPregunta();
                }else {
                    if (respuestaDos.getText().equals(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==2) {
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta();
                    }else{
                        respuestaDos.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.respuestaTres:
                if (respuestaTres.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==1){
                    respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
                    volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                    crearPregunta();
                }else {
                    if (respuestaTres.getText().equals(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==2) {
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta();
                    }else{
                        respuestaTres.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.respuestaCuatro:
                if (respuestaCuatro.getText().equals(preguntasDeGeografia.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==1){
                    respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
                    volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                    crearPregunta();
                }else {
                    if (respuestaCuatro.getText().equals(preguntasDeGeografiaConImagen.get(iteradorDePregunta).getRespuestaCorrecta()) && iteradorTipoDePregunta==2) {
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.verde));
                        volverATodosBlancos(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        crearPregunta();
                    }else{
                        respuestaCuatro.setBackgroundColor(getResources().getColor(R.color.rojo));
                        numeroDeVidas--;
                        rectificarRespuestaCorrecta(respuestaUno,respuestaDos,respuestaTres,respuestaCuatro);
                        quitarCorazon(numeroDeVidas);
                    }
                }
                break;
            case R.id.cambioDePregunta:
                crearPregunta();
                break;
        }
    }

}
