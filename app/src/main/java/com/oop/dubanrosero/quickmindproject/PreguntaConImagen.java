package com.oop.dubanrosero.quickmindproject;

public class PreguntaConImagen extends Pregunta{
    private int imagen;
    public int getImagen() {
        return this.imagen;
    }
    public void setImagen(int _imagen) {
        this.imagen=_imagen;
    }
    public PreguntaConImagen(int _imagen,String _tipo,String[] _opciones,String _respuestaCorrecta){
        this.imagen=_imagen;
        super.setTipo(_tipo);
        super.setOpciones(_opciones);
        super.setRespuestaCorrecta(_respuestaCorrecta);
    }
}
