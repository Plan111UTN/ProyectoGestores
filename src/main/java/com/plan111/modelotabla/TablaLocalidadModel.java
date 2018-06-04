/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelotabla;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.plan111.modelo.Localidad;

/**
 *
 * @author Candelaria
 */
public final class TablaLocalidadModel extends AbstractTableModel {

    private static final String[] COLUMNAS = { "Id. Loc", "Nombre" };
    
    private List<Localidad> listaLocalidad;
    private final SimpleDateFormat formatoFecha;
    private final SimpleDateFormat formatoHora;

    public TablaLocalidadModel (List<Localidad> listaLocalidad) {
        super();
        this.formatoHora  = new SimpleDateFormat("HH:mm");
        this.formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.listaLocalidad = listaLocalidad;
    }

    @Override
    public int getRowCount() {
        return listaLocalidad.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object retorno = null;
        Localidad localidad = listaLocalidad.get(fila);
        
        // según la columna deseada obtenemos el valor a mostrar
        switch (columna) {
            case 0:
                retorno = localidad.getIdLocalidad();
                break;
            case 1:
                retorno = localidad.getNombre();
                break;                       
        }
        
        return retorno;
    }
    
    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }
    
    public Localidad obtenerLocalidadEn (int fila) {
        return listaLocalidad.get(fila);
    }

    public void setPedidos(List<Localidad> listaLocalidad) {
        this.listaLocalidad = listaLocalidad;
    }
    
}
