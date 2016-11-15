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

            //region PREGUNTA 311
            String[] options311={
                    "Round","Ring","Triangle","Fighting place"
            };
            PreguntaSinImagen textQuestion311= new PreguntaSinImagen(
                    "What's the name of the place rounded by 3 sales in where boxing is played?",
                    Constant.TYPE_DEPORTE,
                    options311,
                    "Ring"
            );
            data.add(textQuestion311);
            //endregion

            //region PREGUNTA 312
            String[] options312={
                    "Club Municipal Deportivo","Millonarios","Santa fe","Nacional"
            };
            PreguntaSinImagen textQuestion312= new PreguntaSinImagen(
                    "Which colombian soccer team was the first winner of a international contest?",
                    Constant.TYPE_DEPORTE,
                    options312,
                    "Club Municipal Deportivo"
            );
            data.add(textQuestion312);
            //endregion

            //region PREGUNTA 313
            String[] opciones313={
                    "Argentina","Urugay","Spain","Chile"
            };
            PreguntaSinImagen preguntaConTexto313= new PreguntaSinImagen(
                    "Where is Juan Martín del Potro from?",
                    Constant.TYPE_DEPORTE,
                    opciones313,
                    "Argentina"
            );
            data.add(preguntaConTexto313);
            //endregion

            //region PREGUNTA 314
            String[] opciones314={
                    "Monumental José Fierro","Monumental José Ferro","José Fierro","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto314= new PreguntaSinImagen(
                    "¿Cuál se dice que es la cancha más fría del fútbol argentino?",
                    Constant.TYPE_DEPORTE,
                    opciones314,
                    "Monumental José Fierro"
            );
            data.add(preguntaConTexto314);
            //endregion

            //region PREGUNTA 315
            String[] opciones315={
                    "1946","1945","1960","1961"
            };
            PreguntaSinImagen preguntaConTexto315= new PreguntaSinImagen(
                    "When was C.D. Millonarios born?",
                    Constant.TYPE_DEPORTE,
                    opciones315,
                    "1946"
            );
            data.add(preguntaConTexto315);
            //endregion

            //region PREGUNTA 316
            String[] opciones316={
                    "Independiente Medellin","Nacional","Junior","None of above"
            };
            PreguntaSinImagen preguntaConTexto316= new PreguntaSinImagen(
                    "¿En qué equipo comenzó Juan Guillermo Cuadrado su carrera futbolística?",
                    Constant.TYPE_DEPORTE,
                    opciones316,
                    "Independiente Medellin"
            );
            data.add(preguntaConTexto316);
            //endregion

            //region PREGUNTA 317
            String[] opciones317={
                    "Buenaventura","Tumaco","Barranquilla","Nuqui"
            };
            PreguntaSinImagen preguntaConTexto317= new PreguntaSinImagen(
                    "Where was Pablo Armero born?",
                    Constant.TYPE_DEPORTE,
                    opciones317,
                    "Tumaco"
            );
            data.add(preguntaConTexto317);
            //endregion

            //region PREGUNTA 318
            String[] opciones318={
                    "None of above","Rondaldo Arantes","Edson Martinez","Edson Arantes do Nascimento"
            };
            PreguntaSinImagen preguntaConTexto318= new PreguntaSinImagen(
                    "Which is the real name of Pelé?",
                    Constant.TYPE_DEPORTE,
                    opciones318,
                    "Edson Arantes do Nascimento"
            );
            data.add(preguntaConTexto318);
            //endregion

            //region PREGUNTA 319
            String[] opciones319={
                    "Costa Rica, Spain, Germany y USA","Holland, Argentina, Brazil y Germany", "Germany, Brazil, Argentina y Spain","None of above"
            };
            PreguntaSinImagen preguntaConTexto319= new PreguntaSinImagen(
                    "¿Quién pasó a seminifales en el mundial Brasil 2014?",
                    Constant.TYPE_DEPORTE,
                    opciones319,
                    "Holland, Argentina, Brazil y Germany"
            );
            data.add(preguntaConTexto319);
            //endregion


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

            //region PREGUNTA 311
            String[] opciones311={
                "Round","Ring","Triangulo","Sitio para pelear"
            };
            PreguntaSinImagen preguntaConTexto311= new PreguntaSinImagen(
                    "¿Cómo se llama el lugar rodeado de tres cuerdas donde pelean los boxeadores?",
                    Constant.TYPE_DEPORTE,
                    opciones311,
                    "Ring"
            );
            data.add(preguntaConTexto311);
            //endregion

            //region PREGUNTA 312
            String[] opciones312={
                    "Club Municipal Deportivo","Millonarios","Sanatfe","Nacional"
            };
            PreguntaSinImagen preguntaConTexto312= new PreguntaSinImagen(
                    "¿Cuál fue el primer campeón Colombian de un torneo internacional de Futbol?",
                    Constant.TYPE_DEPORTE,
                    opciones312,
                    "Club Municipal Deportivo"
            );
            data.add(preguntaConTexto312);
            //endregion

            //region PREGUNTA 313
            String[] opciones313={
                    "Argentina","Urugay","España","Chile"
            };
            PreguntaSinImagen preguntaConTexto313= new PreguntaSinImagen(
                    "¿De dónde es el tenista Juan Martín del Potro?",
                    Constant.TYPE_DEPORTE,
                    opciones313,
                    "Argentina"
            );
            data.add(preguntaConTexto313);
            //endregion

            //region PREGUNTA 314
            String[] opciones314={
                    "Monumental José Fierro","Monumental José Ferro","José Fierro","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto314= new PreguntaSinImagen(
                    "¿Cuál se dice que es la cancha más fría del fútbol argentino?",
                    Constant.TYPE_DEPORTE,
                    opciones314,
                    "Monumental José Fierro"
            );
            data.add(preguntaConTexto314);
            //endregion

            //region PREGUNTA 315
            String[] opciones315={
                    "1946","1945","1960","1961"
            };
            PreguntaSinImagen preguntaConTexto315= new PreguntaSinImagen(
                    "¿Cuándo se fundó el club deportivo Millonarios?",
                    Constant.TYPE_DEPORTE,
                    opciones315,
                    "1946"
            );
            data.add(preguntaConTexto315);
            //endregion

            //region PREGUNTA 316
            String[] opciones316={
                    "Independiente Medellin","Nacional","Junior","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto316= new PreguntaSinImagen(
                    "¿En qué equipo comenzó Juan Guillermo Cuadrado su carrera futbolística?",
                    Constant.TYPE_DEPORTE,
                    opciones316,
                    "Independiente Medellin"
            );
            data.add(preguntaConTexto316);
            //endregion

            //region PREGUNTA 317
            String[] opciones317={
                    "Buenaventura","Tumaco","Barranquilla","Nuqui"
            };
            PreguntaSinImagen preguntaConTexto317= new PreguntaSinImagen(
                    "¿Dónde nació Pablo Armero?",
                    Constant.TYPE_DEPORTE,
                    opciones317,
                    "Tumaco"
            );
            data.add(preguntaConTexto317);
            //endregion

            //region PREGUNTA 318
            String[] opciones318={
                    "Ninguna de las anteriores","Rondaldo Arantes","Edson Martinez","Edson Arantes do Nascimento"
            };
            PreguntaSinImagen preguntaConTexto318= new PreguntaSinImagen(
                    "¿Cuál es el nombre real de Pelé?",
                    Constant.TYPE_DEPORTE,
                    opciones318,
                    "Edson Arantes do Nascimento"
            );
            data.add(preguntaConTexto318);
            //endregion

            //region PREGUNTA 319
            String[] opciones319={
                    "Costa Rica, España, Alemania y Estados Unidos","Holanda, Argentina, Brasil y Alemania", "Alemania, Brasil, Argentina y España","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto319= new PreguntaSinImagen(
                    "¿Quién pasó a seminifales en el mundial Brasil 2014?",
                    Constant.TYPE_DEPORTE,
                    opciones319,
                    "Holanda, Argentina, Brasil y Alemania"
            );
            data.add(preguntaConTexto319);
            //endregion

        }
        return data;
    }

    public List<PreguntaSinImagen> getPreguntasConTextCiencia(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Mitosis","Meiosis","Cytokinesis","karyiokinesis"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Process by wich the cell divides itself into two daughter cells?",
                    Constant.TYPE_CIENCIAS,
                    options1,
                    "Mitosis"
            );

            data.add(textQuestion1);

            //region PREGUNTA 320
            String[] options320= {
                    "Mule","Mare","Donkey","Filly"
            };

            PreguntaSinImagen textQuestion320= new PreguntaSinImagen(
                    "What's the name of the son between a donkey and a mare",
                    Constant.TYPE_CIENCIAS,
                    options320,
                    "Mule"
            );
            data.add(textQuestion320);
            //endregion

            //region PREGUNTA 321
            String[] options321= {
                    "Cartesian north pole","Polaris","Antarctic","Antarctica"
            };

            PreguntaSinImagen textQuestion321= new PreguntaSinImagen(
                    "What is at the same point with the celestial north pole?",
                    Constant.TYPE_CIENCIAS,
                    options321,
                    "Polaris"
            );
            data.add(textQuestion321);
            //endregion

            //region PREGUNTA 322
            String[] options322= {
                    "Legume","Vegetable","Greens","Fruit"
            };

            PreguntaSinImagen textQuestion322= new PreguntaSinImagen(
                    "For the botanists, What is a tomato?",
                    Constant.TYPE_CIENCIAS,
                    options322,
                    "Fruit"
            );
            data.add(textQuestion322);
            //endregion

            //region PREGUNTA 323
            String[] options323= {
                    "Magnetic atraction","Electric Current","Light emission","All above"
            };

            PreguntaSinImagen textQuestion323= new PreguntaSinImagen(
                    "What is produced by a magnetic field variation?",
                    Constant.TYPE_CIENCIAS,
                    options323,
                    "Electric Current"
            );
            data.add(textQuestion323);
            //endregion

            //region PREGUNTA 324
            String[] options324= {
                    "Penicilin","Atomic Bomb","Dinamit","The idea about the contest"
            };

            PreguntaSinImagen textQuestion324= new PreguntaSinImagen(
                    "What did Alfred Nobel create, which gives the name to the famous awkward?",
                    Constant.TYPE_CIENCIAS,
                    options324,
                    "Dinamit"
            );
            data.add(textQuestion324);
            //endregion

            //region PREGUNTA 325
            String[] options325= {
                    "Flying squirrel","Bat","None of the above","Flying cat"
            };

            PreguntaSinImagen textQuestion325= new PreguntaSinImagen(
                    "Which is the only mammal capable of flying?",
                    Constant.TYPE_CIENCIAS,
                    options325,
                    "Bat"
            );
            data.add(textQuestion325);
            //endregion

            //region PREGUNTA 326
            String[] options326= {
                    "205","310","280","206"
            };

            PreguntaSinImagen textQuestion326= new PreguntaSinImagen(
                    "How many bones does an adult human have?",
                    Constant.TYPE_CIENCIAS,
                    options326,
                    "206"
            );
            data.add(textQuestion326);
            //endregion

            //region PREGUNTA 327
            String[] opciones327= {
                    "100","1500","1000","800"
            };

            PreguntaSinImagen preguntaConTexto327= new PreguntaSinImagen(
                    "How many earthquakes does Japan have average in a year?",
                    Constant.TYPE_CIENCIAS,
                    opciones327,
                    "1500"
            );
            data.add(preguntaConTexto327);
            //endregion

            //region PREGUNTA 328
            String[] opciones328= {
                    "36m","20m","10m","15m"
            };

            PreguntaSinImagen preguntaConTexto328= new PreguntaSinImagen(
                    "How many hair does a person produces in a year?",
                    Constant.TYPE_CIENCIAS,
                    opciones328,
                    "36m"
            );
            data.add(preguntaConTexto328);
            //endregion

            //region PREGUNTA 329
            String[] opciones329= {
                    "1943","1953","1869","1890"
            };

            PreguntaSinImagen preguntaConTexto329= new PreguntaSinImagen(
                    "When the molecular structure of DNA was first established?",
                    Constant.TYPE_CIENCIAS,
                    opciones329,
                    "1953"
            );
            data.add(preguntaConTexto329);
            //endregion



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

            //region PREGUNTA 320
            String[] opciones320= {
                    "Mula","Yegua","Potranca","Burro"
            };

            PreguntaSinImagen preguntaConTexto320= new PreguntaSinImagen(
                    "¿Cómo se le llama al descentiente entre un asno y una yegua?",
                    Constant.TYPE_CIENCIAS,
                    opciones320,
                    "Mula"
            );
            data.add(preguntaConTexto320);
            //endregion

            //region PREGUNTA 321
            String[] opciones321= {
                    "Polo norte cartesiano","Antártida","Antártica","Polaris"
            };

            PreguntaSinImagen preguntaConTexto321= new PreguntaSinImagen(
                    "¿Con qué coincide el polo norte celeste?",
                    Constant.TYPE_CIENCIAS,
                    opciones321,
                    "Polaris"
            );
            data.add(preguntaConTexto321);
            //endregion

            //region PREGUNTA 322
            String[] opciones322= {
                    "Hortaliza","Vegetal","Verdura","Fruta"
            };

            PreguntaSinImagen preguntaConTexto322= new PreguntaSinImagen(
                    "¿Para los botánicos, qué es un tomate?",
                    Constant.TYPE_CIENCIAS,
                    opciones322,
                    "Fruta"
            );
            data.add(preguntaConTexto322);
            //endregion

            //region PREGUNTA 323
            String[] opciones323= {
                    "Atraccion magnética","Corriente eléctrica","Emisión de Luz","Todas las anteriores"
            };

            PreguntaSinImagen preguntaConTexto323= new PreguntaSinImagen(
                    "¿Qué produce la variación de un campo magnético?",
                    Constant.TYPE_CIENCIAS,
                    opciones323,
                    "Corriente eléctrica"
            );
            data.add(preguntaConTexto323);
            //endregion

            //region PREGUNTA 324
            String[] opciones324= {
                    "Penicilina","Bomba atómica","Dinamita","La idea de crear los premios"
            };

            PreguntaSinImagen preguntaConTexto324= new PreguntaSinImagen(
                    "¿Qué inventó Alfred Nobel, el que da nombrea losfamosos premios?",
                    Constant.TYPE_CIENCIAS,
                    opciones324,
                    "Dinamita"
            );
            data.add(preguntaConTexto324);
            //endregion

            //region PREGUNTA 325
            String[] opciones325= {
                    "Ardilla voladora","Murciélago","Ninguna de las anteriores","Gato volador"
            };

            PreguntaSinImagen preguntaConTexto325= new PreguntaSinImagen(
                    "¿Cuál es el único mamífero capaz de volar?",
                    Constant.TYPE_CIENCIAS,
                    opciones325,
                    "Murciélago"
            );
            data.add(preguntaConTexto325);
            //endregion

            //region PREGUNTA 326
            String[] opciones326= {
                    "205","310","280","206"
            };

            PreguntaSinImagen preguntaConTexto326= new PreguntaSinImagen(
                    "¿Cuántos huesos tiene en total un ser humano adulto?",
                    Constant.TYPE_CIENCIAS,
                    opciones326,
                    "206"
            );
            data.add(preguntaConTexto326);
            //endregion

            //region PREGUNTA 327
            String[] opciones327= {
                    "100","1500","1000","800"
            };

            PreguntaSinImagen preguntaConTexto327= new PreguntaSinImagen(
                    "¿Cuántos terremotos en promedio tiene Japón al año?",
                    Constant.TYPE_CIENCIAS,
                    opciones327,
                    "1500"
            );
            data.add(preguntaConTexto327);
            //endregion

            //region PREGUNTA 328
            String[] opciones328= {
                    "36m","20m","10m","15m"
            };

            PreguntaSinImagen preguntaConTexto328= new PreguntaSinImagen(
                    "¿Cuánto cabello produce en promedio una persona al año?",
                    Constant.TYPE_CIENCIAS,
                    opciones328,
                    "36m"
            );
            data.add(preguntaConTexto328);
            //endregion

            //region PREGUNTA 329
            String[] opciones329= {
                    "1943","1953","1869","1890"
            };

            PreguntaSinImagen preguntaConTexto329= new PreguntaSinImagen(
                    "¿Cuándo fue establecida por primera vez la estructura molecular de ADN?",
                    Constant.TYPE_CIENCIAS,
                    opciones329,
                    "1953"
            );
            data.add(preguntaConTexto329);
            //endregion


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
            data.add(preguntaConTexto1);

            //region PREGUNTA 300
            String[] opciones300={
              "En los dos","Norte","Sur","Ecuador"
            };
            PreguntaSinImagen preguntaConTexto300= new PreguntaSinImagen(
                    "¿En qué hemisferio está situado Colombia?",
                    Constant.TYPE_SOCIALES,
                    opciones300,
                    "En los dos"
            );
            data.add(preguntaConTexto300);
            //endregion

            //region PREGUNTA 301
            String[] opciones301={
                    "Alemania","Japon","Estados Unidos","Inglaterra"
            };
            PreguntaSinImagen preguntaConTexto301= new PreguntaSinImagen(
                    "¿Cuál fue la primera nación de las potencias del eje durante la segunda guerra mundial?",
                    Constant.TYPE_SOCIALES,
                    opciones301,
                    "Alemania"
            );
            data.add(preguntaConTexto301);
            //endregion

            //region PREGUNTA 302
            String[] opciones302={
                    "6","5","7","8"
            };
            PreguntaSinImagen preguntaConTexto302= new PreguntaSinImagen(
                    "¿Cuántas regiones componen la geografía colombiana?",
                    Constant.TYPE_SOCIALES,
                    opciones302,
                    "6"
            );
            data.add(preguntaConTexto302);
            //endregion

            //region PREGUNTA 303
            String[] opciones303={
                    "Rabat","Fez","Marrakech","Dali"
            };
            PreguntaSinImagen preguntaConTexto303= new PreguntaSinImagen(
                    "¿Cuál es la capital de Marruecos?",
                    Constant.TYPE_SOCIALES,
                    opciones303,
                    "Rabat"
            );
            data.add(preguntaConTexto303);
            //endregion

            //region PREGUNTA 304
            String[] opciones304={
                    "Pablo Escobar","Joaquin Guzman","Raul Reyes","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto304= new PreguntaSinImagen(
                    "¿Quién mató a Rodrigo Lara?",
                    Constant.TYPE_SOCIALES,
                    opciones304,
                    "Pablo Escobar"
            );
            data.add(preguntaConTexto304);
            //endregion

            //region PREGUNTA 305
            String[] opciones305={
                    "Asia","America","Europa","Africa"
            };
            PreguntaSinImagen preguntaConTexto305= new PreguntaSinImagen(
                    "¿Dónde está ubicado Tibet?",
                    Constant.TYPE_SOCIALES,
                    opciones305,
                    "Asia"
            );
            data.add(preguntaConTexto305);
            //endregion

            //region PREGUNTA 306
            String[] opciones306={
                    "China","Japón","Estados Unidos","Roma"
            };
            PreguntaSinImagen preguntaConTexto306= new PreguntaSinImagen(
                    "¿Cuál fue el único Imperio Colonial NO Eruopeo?",
                    Constant.TYPE_SOCIALES,
                    opciones306,
                    "Japón"
            );
            data.add(preguntaConTexto306);
            //endregion

            //region PREGUNTA 307
            String[] opciones307={
                    "1537","1485","1492","1475"
            };
            PreguntaSinImagen preguntaConTexto307= new PreguntaSinImagen(
                    "¿Cuándo fue el descubrimiento de América?",
                    Constant.TYPE_SOCIALES,
                    opciones307,
                    "1492"
            );
            data.add(preguntaConTexto307);
            //endregion

            //region PREGUNTA 308
            String[] opciones308={
                    "Berna","Zurich","Ginebra","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto308= new PreguntaSinImagen(
                    "¿Cuál es la capital de Suiza?",
                    Constant.TYPE_SOCIALES,
                    opciones308,
                    "Berna"
            );
            data.add(preguntaConTexto308);
            //endregion

            //region PREGUNTA 309
            String[] opciones309={
                    "Guainia","Meta","Vaupés","Cundinamarca"
            };
            PreguntaSinImagen preguntaConTexto309= new PreguntaSinImagen(
                    "¿Dónde queda el municipio de Mapiripana?",
                    Constant.TYPE_SOCIALES,
                    opciones309,
                    "Guainia"
            );
            data.add(preguntaConTexto309);
            //endregion

            //region PREGUNTA 310
            String[] opciones310={
                    "6 de Agosto de 1945","5 de Agosto de 1945", "6 de Agosto de 1946","10 de Agosto de 1945"
            };
            PreguntaSinImagen preguntaConTexto310= new PreguntaSinImagen(
                    "¿Cuándo fue lanzada la bomba atómica de Hiroshima?",
                    Constant.TYPE_SOCIALES,
                    opciones310,
                    "6 de Agosto de 1945"
            );
            data.add(preguntaConTexto310);
            //endregion
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

            //region PREGUNTA 330
            String[] opciones330={
                    "Chopin","Beethoven","Mozart","Franz Liszt"
            };

            PreguntaSinImagen preguntaConTexto330= new PreguntaSinImagen(
                    "¿Cuál de los compositores murió más joven?",
                    Constant.TYPE_ARTES,
                    opciones330,
                    "Mozart"
            );
            data.add(preguntaConTexto330);
            //endregion

            //region PREGUNTA 331
            String[] opciones331={
                    "Edvard Munch","Picasso","Lonardo da Vinci","Salvador Dalí"
            };

            PreguntaSinImagen preguntaConTexto331= new PreguntaSinImagen(
                    "¿Quién pintó la última cena?",
                    Constant.TYPE_ARTES,
                    opciones331,
                    "Leonardo da Vinci"
            );
            data.add(preguntaConTexto331);
            //endregion

            //region PREGUNTA 332
            String[] opciones332={
                    "Christopher Nolan","Jenifer Todd","Suzanne Todd","Wally Pfister"
            };

            PreguntaSinImagen preguntaConTexto332= new PreguntaSinImagen(
                    "¿Quién es el director de la película Memento?",
                    Constant.TYPE_ARTES,
                    opciones332,
                    "Christopher Nolan"
            );
            data.add(preguntaConTexto332);
            //endregion

            //region PREGUNTA 333
            String[] opciones333={
                    "11","5","8","3"
            };

            PreguntaSinImagen preguntaConTexto333= new PreguntaSinImagen(
                    "¿Cuántos premios Oscar ha ganado la película Titanic?",
                    Constant.TYPE_ARTES,
                    opciones333,
                    "11"
            );
            data.add(preguntaConTexto333);
            //endregion

            //region PREGUNTA 334
            String[] opciones334={
                    "8000m","7.5 km","5000m","6km"
            };

            PreguntaSinImagen preguntaConTexto334= new PreguntaSinImagen(
                    "¿Cuánto minde la pintura más grande del mundo pintada por una sola persona?",
                    Constant.TYPE_ARTES,
                    opciones334,
                    "8000m"
            );
            data.add(preguntaConTexto334);
            //endregion

            //region PREGUNTA 335
            String[] opciones335={
                    "Palacio de Invierno","Museo de Louvre","Gagosian Gallery","Matthew Marks Gallery"
            };

            PreguntaSinImagen preguntaConTexto335= new PreguntaSinImagen(
                    "¿Cuál es la galería de arte más grande?",
                    Constant.TYPE_ARTES,
                    opciones335,
                    "Palacio de Invierno"
            );
            data.add(preguntaConTexto335);
            //endregion

            //region PREGUNTA 336
            String[] opciones336={
                    "Van Gogh","Dalí","Monet","Rembrandt"
            };

            PreguntaSinImagen preguntaConTexto336= new PreguntaSinImagen(
                    "¿Quién pintó el Cristo sin espinas y sin sangre?",
                    Constant.TYPE_ARTES,
                    opciones336,
                    "Dalí"
            );
            data.add(preguntaConTexto336);
            //endregion

            //region PREGUNTA 337
            String[] opciones337={
                    "Van Gogh","El Greco","El Bosco","Caravaggio"
            };

            PreguntaSinImagen preguntaConTexto337= new PreguntaSinImagen(
                    "¿Quién pintó El jardín de las delicias?",
                    Constant.TYPE_ARTES,
                    opciones337,
                    "El Bosco"
            );
            data.add(preguntaConTexto337);
            //endregion

            //region PREGUNTA 338
            String[] opciones338={
                    "Cézanne","Degas","Renoir","Courbet"
            };

            PreguntaSinImagen preguntaConTexto338= new PreguntaSinImagen(
                    "¿Quién fue rechazado por la Ecole des Beaux-Arts?",
                    Constant.TYPE_ARTES,
                    opciones338,
                    "Cézanne"
            );
            data.add(preguntaConTexto338);
            //endregion

            //region PREGUNTA 339
            String[] opciones339={
                    "5","15","27","20"
            };

            PreguntaSinImagen preguntaConTexto339= new PreguntaSinImagen(
                    "¿A qué edad comenzó a pintar Van Gogh?",
                    Constant.TYPE_ARTES,
                    opciones339,
                    "27"
            );
            data.add(preguntaConTexto339);
            //endregion

        }
        return data;
    }

    public PreguntaSinImagen getRandomPreguntaSinImagen(List<PreguntaSinImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
