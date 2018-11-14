package com.iesvirgendelcarmen.interfaces.dam.fragment10;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Fragmento1 extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.layout_fragmento1, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
            setListAdapter(new Adaptador(getActivity(), R.layout.layout_adaptador_listview, Contenido.ENT_LISTA) {

            @Override
            public void onEntrada(Object entrada, View view) {
                if(entrada!=null){
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.texto_titulo);
                texto_superior_entrada.setText(((Contenido.Lista_entrada)entrada).textoEncima);

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagenlista);
                imagen_entrada.setImageResource(((Contenido.Lista_entrada)entrada).idImagen);
            } else {

                }

            }
        });
        super.onCreate(savedInstanceState);
    }

    public interface Callbacks{
        public void onEntradaSeleccionada(String id);
    }

    Callbacks mCallback;

    private static Callbacks callbacksVacios = new Callbacks() {
        @Override
        public void onEntradaSeleccionada(String id) {

        }
    };

    public Fragmento1(){}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof Callbacks)
            mCallback = (Callbacks) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = callbacksVacios;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        mCallback.onEntradaSeleccionada(Contenido.ENT_LISTA.get(position).id);
    }
}
