package bo.michel.listadedonas;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context mContext;
    private ArrayList<Entidad> listItems;

    public Adaptador(Context mContext, ArrayList<Entidad> listItems) {
        this.mContext = mContext;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Entidad Item = (Entidad) getItem(position);

        convertView= LayoutInflater.from(mContext).inflate(R.layout.item, null);
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);
        TextView dTitulo = (TextView) convertView.findViewById(R.id.dTitulo);
        TextView dContenido = (TextView) convertView.findViewById(R.id.dContenido);


        imgFoto.setImageResource(Item.getImgFoto());
        dTitulo.setText(Item.getTitulo());
        dContenido.setText(Item.getContenido());


        return convertView;
    }
}
