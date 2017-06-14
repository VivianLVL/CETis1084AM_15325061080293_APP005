package mx.edu.cetis108.cetis1084am_15325061080293_app005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.StaticLayout;
import android.widget.EditText;

public class Archivo_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archivo_);
    }

    EditText txtNombre;
    EditText txtTipo;
    EditText txtRuta;
    EditText txtTexto;

    String nombre;
    String tipo;
    String ruta;
    String texto;

    public Archivo_Activity(String Vnombre, String Vtipo, String Vruta, String Vtexto)
    {
        nombre=Vnombre;
        tipo=Vtipo;
        ruta=Vruta;
        texto=Vtexto;

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtNombre.setText(nombre);

        txtTipo=(EditText)findViewById(R.id.txtTipo);
        txtTipo.setText(tipo);

        txtRuta=(EditText)findViewById(R.id.txtRuta);
        txtRuta.setText(ruta);

        txtTexto=(EditText)findViewById(R.id.txtTexto);
        txtTexto.setText(texto);

    }

}
