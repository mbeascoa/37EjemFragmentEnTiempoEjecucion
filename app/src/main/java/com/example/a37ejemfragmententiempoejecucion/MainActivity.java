package com.example.a37ejemfragmententiempoejecucion;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



        private Button btnFragment ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnFragment = (Button)findViewById(R.id.button1);

            btnFragment.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    //Obtenemos la instancia del administrador de fragmentos
                    FragmentManager fragmentManager = getFragmentManager();

                    //Creamos una nueva transacción
                    FragmentTransaction transaction = fragmentManager.beginTransaction();

//Accedemos al fragmento y lo añadimos al Layout del Activity_main.xml
// El primer parámetro de método ADD es el contenedor donde queremos insertar el Fragment
                    Fragmentotempexe fragment = new Fragmentotempexe();
                    transaction.add(R.id.contenedorPrincipal, fragment);

                    //Validamos el cambio
                    transaction.commit();

                }
            });

        }
    }
