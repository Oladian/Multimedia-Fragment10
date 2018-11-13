package com.iesvirgendelcarmen.interfaces.dam.fragment10;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragmento1 extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.setListAdapter(new Adaptador(getActivity(), R.layout.layout_listado,Contenido.ENT_LISTA) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.texto_titulo);
                texto_superior_entrada.setText(((Contenido.Lista_entrada)entrada).textoEncima);

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagenlista);
                imagen_entrada.setImageResource(((Contenido.Lista_entrada)entrada).idImagen);
            }
        });

        super.onCreate(savedInstanceState);
    }


}
