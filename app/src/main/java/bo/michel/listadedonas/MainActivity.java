package bo.michel.listadedonas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayentidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.lvItem);
        arrayentidad= GetArrayItems();
        adaptador = new Adaptador(this,arrayentidad);
        lvItems.setAdapter(adaptador);

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(MainActivity.this, DetalleItemActivity.class);
                intent.putExtra("objetodata",arrayentidad.get(position));
                startActivity(intent);
            }
        });

    }
    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.dona1,"Cajeta"," con crema"));
        listItems.add(new Entidad(R.drawable.dona2,"Frambuesa","con crerma"));
        listItems.add(new Entidad(R.drawable.dona3,"Manzana con canela","con crerma"));
        listItems.add(new Entidad(R.drawable.dona4,"Crema blanca","con crerma"));
        listItems.add(new Entidad(R.drawable.dona5,"Crema pastelera","con crerma"));
        listItems.add(new Entidad(R.drawable.dona6,"Glaseada original","con crerma"));
        listItems.add(new Entidad(R.drawable.dona7,"Chocolate","con crerma"));
        listItems.add(new Entidad(R.drawable.dona8,"Chocolate con chispas","con crerma"));
        listItems.add(new Entidad(R.drawable.dona9,"Maple","con crerma"));
        listItems.add(new Entidad(R.drawable.dona10,"Azúcar","con crerma"));
        listItems.add(new Entidad(R.drawable.dona11,"Cruller","con crerma"));
        listItems.add(new Entidad(R.drawable.dona12,"Brownie","con crerma"));
        listItems.add(new Entidad(R.drawable.dona13,"Canela","con crerma"));

        return listItems;
    }

}
