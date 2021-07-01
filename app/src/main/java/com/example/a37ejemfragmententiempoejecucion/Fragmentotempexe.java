package com.example.a37ejemfragmententiempoejecucion;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Fragmentotempexe extends Fragment {


    private Button btn1;
    private EditText edit1;
    private TextView text1;


    public Fragmentotempexe() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_fragmentotempexe, container, false);
        btn1 = (Button)view.findViewById(R.id.btnMensaje);
        edit1 = (EditText)view.findViewById(R.id.editText1);
        text1 = (TextView)view.findViewById(R.id.textView1);

        RelativeLayout.LayoutParams params =    new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        //Colocamos el fragmento debajo del boton de la actividad principal
        params.addRule(RelativeLayout.BELOW, R.id.button1);
        //Podrimaos mocificar los márgenes left, top, right y bottom
        params.setMargins(0,0,0,0);
        //Enviamos los parámetros
        view.setLayoutParams(params);

        btn1.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String nombre = edit1.getText().toString();
                text1.setText(nombre.toUpperCase());

            }

        });

        return view;
    }


}
