package bo.michel.listadedonas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleItemActivity extends AppCompatActivity {

    private Entidad Item;
    private TextView titulo, descripcion;
    private ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_item);

        Item = (Entidad) getIntent().getSerializableExtra("objetoData");
        titulo= (TextView) findViewById(R.id.titulo);
        descripcion= (TextView) findViewById(R.id.descripcion);
        imgFoto=(ImageView)findViewById(R.id.imgFoto);

        titulo.setText(Item.getTitulo());
        imgFoto.setImageResource(Item.getImgFoto());
        descripcion.setText(Item.getContenido());
    }
}
