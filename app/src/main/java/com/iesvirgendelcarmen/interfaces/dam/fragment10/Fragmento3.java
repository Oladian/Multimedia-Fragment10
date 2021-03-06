package com.iesvirgendelcarmen.interfaces.dam.fragment10;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragmento3 extends Fragment {
    public static final String ARG_ID_ENTRADA_SELECCIONADA = "item_id";
    private Contenido.Lista_entrada miItem;

    public Fragmento3() { }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)){
            miItem = Contenido.ENT_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));
        }
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_detalle_fragmento3,container,false);
        if (miItem!=null){
            ((TextView) rootView.findViewById(R.id.textotitulo)).setText(miItem.textoEncima);
            ((TextView) rootView.findViewById(R.id.textocontenido)).setText(miItem.textoDebajo);
            ((ImageView) rootView.findViewById(R.id.imagen)).setImageResource(miItem.idImagen);
        }


        return rootView;
    }
}
