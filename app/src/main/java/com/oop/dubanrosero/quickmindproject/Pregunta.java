package com.oop.dubanrosero.quickmindproject;

public class Pregunta {
    private String[] opciones=new String[4];
    private String tipo;
    private String respuestaCorrecta;
    public String getRespuestaCorrecta(){
        return this.respuestaCorrecta;
    }
    public void setRespuestaCorrecta(String _respuetaCorrecta){
        this.respuestaCorrecta=_respuetaCorrecta;
    }
    public String[] getOpciones(){
        return this.opciones;
    }
    public void setOpciones(String[] _opciones){
        this.opciones=_opciones;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String _tipo){
        this.tipo=_tipo;
    }
}
