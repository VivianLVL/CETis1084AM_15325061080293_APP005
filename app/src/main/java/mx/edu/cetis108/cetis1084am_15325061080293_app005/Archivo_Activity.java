package mx.edu.cetis108.cetis1084am_15325061080293_app005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.StaticLayout;

public class Archivo_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archivo_);

    }

    String nombre;
    String tipo;
    String ruta;
    String texto;



    void Archivo_Activity(String Vnombre, String Vtipo, String Vruta, String Vtexto)
    {
        nombre=Vnombre;
        tipo=Vtipo;
        ruta=Vruta;
        texto=Vtexto;

    }

}
