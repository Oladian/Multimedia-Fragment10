package com.iesvirgendelcarmen.interfaces.dam.fragment10;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Fragmento2 extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.layout_unpanel);
        super.onCreate(savedInstanceState);

        if (savedInstanceState==null){
            Bundle arguments = new Bundle();
            arguments.putString(Fragmento3.ARG_ID_ENTRADA_SELECCIONADA,getIntent().getStringExtra(Fragmento3.ARG_ID_ENTRADA_SELECCIONADA));
            Fragmento3 fragment = new Fragmento3();
            fragment.setArguments(arguments);
            if (!isFinishing())
                getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor,fragment).commit();
        }

    }
}
