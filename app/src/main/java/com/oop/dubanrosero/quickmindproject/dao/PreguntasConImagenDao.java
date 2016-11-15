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

            //region PREGUNTA 350
            String[] opciones350 = {
                    "Osa Mayor","Escorpión","Tauro","Ninguna de las anteriores"
            };

            PreguntaConImagen preguntaConImagen350 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTcwmQPoZ5lTZ1bLGb9h34-7Y-T7vBpvelULNfN3jGWFDCqzqqq",
                    Constant.TYPE_CIENCIAS,
                    opciones350,
                    "Escorpión"
            );
            data.add(preguntaConImagen350);
            //endregion

            //region PREGUNTA 351
            String[] opciones351 = {
                    "Ribosoma","Lisosoma","Mitocondria","Nucleolo"
            };
            PreguntaConImagen preguntaConImagen351= new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTGVNfP59X71z6xHtCQeMPI7zpfO3DnNcP4BvWNUSK_6feAMb5b",
                    Constant.TYPE_CIENCIAS,
                    opciones351,
                    "Mitocondria"
            );
            data.add(preguntaConImagen351);
            //endregion

            //region PREGUNTA 352
            String[] opciones352 = {
                    "Thomas Alva Edison","Nikola Tesla","Ampere","Todos los anteriores"
            };
            PreguntaConImagen preguntaConImagen352= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQ6Vj-V8TLnFqemWdURrqzx2aLxa3eQ3OWb2qPhIhJqQCahdpRw",
                    Constant.TYPE_CIENCIAS,
                    opciones352,
                    "Thomas Alva Edison"
            );
            data.add(preguntaConImagen352);
            //endregion

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

            //region PREGUNTA 360
            String[] opciones360 = {
                    "Nicklaus Tintiger","Joachim Loew","Sepp Herberger","Franz Beckenbauer"
            };
            PreguntaConImagen preguntaConImagen360 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ-dD2B_9Z5jnpJqz8P4Iq9MD-CQfQP700hx-ItBcbnFvGvERqR",
                    Constant.TYPE_DEPORTE,
                    opciones360,
                    "Joachim Loew"
            );
            data.add(preguntaConImagen360);
            //endregion

            //region PREGUNTA 361
            String[] opciones361= {
                    "Urs Fischer","Bernhard Heusler","Luca Zuffi","Fabian Schaer"
            };
            PreguntaConImagen preguntaConImagen361 = new PreguntaConImagen(
                    "http://www.srf.ch/var/storage/images/auftritte/sport/bilder/2014/10/20/fabian_schaer/72244938-2-ger-DE/fabian_schaer_span12.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones361,
                    "Fabian Schaer"
            );
            data.add(preguntaConImagen361);
            //endregion

            //region PREGUNTA 362
            String[] opciones362= {
                    "Letzigrund","St. Jakob Park","AFG Arena","Ninguna de las anteriores"
            };
            PreguntaConImagen preguntaConImagen362= new PreguntaConImagen(
                    "http://www.gazzetta.gr/sites/default/files/sitefiles_2016-05/4a9d0d5a4a7f1d87ce77d6a7bbba7261.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones362,
                    "St. Jakob Park"
            );
            data.add(preguntaConImagen362);
            //endregion

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

            //region PREGUNTA 370
            String[] opciones370 = {
                    "Castell humà","Castellers","Pinyes d'homes","Niguna de las anteriores"
            };
            PreguntaConImagen preguntaConImagen370= new PreguntaConImagen(
                    "http://ep01.epimg.net/cat/imagenes/2016/10/02/catalunya/1475403770_457201_1475434351_noticia_fotograma.jpg",
                    Constant.TYPE_SOCIALES,
                    opciones370,
                    "Castellers"
            );
            data.add(preguntaConImagen370);
            //endregion

            //region PREGUNTA 371
            String[] opciones371 = {
                    "Chelmno","Ninguna de las anteriores","Rumbula","Arbeitsdorf","Sachsenhausen"
            };
            PreguntaConImagen preguntaConImagen371= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSjnYWBb5QiIoHL5fKsMdiMSW59_urvT0zd74D_zysqpWZ9bmSO",
                    Constant.TYPE_SOCIALES,
                    opciones371,
                    "Ninguna de las anteriores"
            );
            data.add(preguntaConImagen371);
            //endregion

            //region PREGUNTA 372
            String[] opciones372 = {
                    "Nefertiti","Cleopatra","Nitocris","Meryt-Neit"
            };
            PreguntaConImagen preguntaConImagen372= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRB5xk8lV4a_2oi4TTauGiB4d3hvMnBTVSeEzXkywabqe7SuxSQ",
                    Constant.TYPE_SOCIALES,
                    opciones372,
                    "Nefertiti"
            );
            data.add(preguntaConImagen372);
            //endregion

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

            //region PREGUNTA 340
            String[] opciones340 = {
                    "Sofia Nix","Franceska Jaimes","Melanie Rios","Jueputa que rico"
            };

            PreguntaConImagen preguntaConImagen340 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTP1qwFfhAYVK9MWn9WufUNUQcTxht_mUXFto6MvUDXqB7c3hmfeQ",
                    Constant.TYPE_ARTES,
                    opciones340,
                    "Jueputa que rico"
            );
            data.add(preguntaConImagen340);
            //endregion

            //region PREGUNTA 341
            String[] opciones341= {
                    "Edvard Munch","Francisco de Goya","Miguel Angel","Gustav Klimt"
            };
            PreguntaConImagen preguntaConImagen341 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQeMldd8FV4Sveitwm1ojZpisNgKyewUeVynYopwIRpLtCHk0HY",
                    Constant.TYPE_ARTES,
                    opciones341,
                    "Edvard Munch"
            );
            data.add(preguntaConImagen341);
            //endregion

            //region PREGUNTA 342
            String[] opciones342= {
                    "Tiziano","Miró","Degas","Rubens"
            };
            PreguntaConImagen preguntaConImagen342 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQDYjitaVmC5Y8fAEB-8e81hUqBPyaMNESy1A3dg0jNjirRzVGk4w",
                    Constant.TYPE_ARTES,
                    opciones342,
                    "Miró"
            );
            data.add(preguntaConImagen342);
            //endregion





        }

        return data;
    }


    public PreguntaConImagen getRandomPreguntaConImagen(List<PreguntaConImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
