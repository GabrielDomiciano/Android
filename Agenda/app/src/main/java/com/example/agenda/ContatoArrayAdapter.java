package com.example.agenda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.agenda.modelo.Contato;

import java.util.List;

public class ContatoArrayAdapter extends ArrayAdapter<Contato> {
    private LayoutInflater layoutInflater;

    public ContatoArrayAdapter(Context contexto, int layoutItem, List<Contato> dados) {
        super(contexto, layoutItem, dados);
        layoutInflater = contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View row, ViewGroup parent){

        if(row == null){
            // criar item
            row = ;
        } else {
            // reciclar item
        }

        return null;
    }

    private class ViewHolder{

    }
}
