/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plan111.modelotabla;

import com.plan111.modelo.Localidad;
import com.plan111.vistas.frmLocalidad;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import poo.pizzeria.Pedido;

/**
 *
 * @author joaquinleonelrobles
 */
public class LocalidadTableModelListener implements ListSelectionListener {
    
    private final frmLocalidad frmLocalidad;

    public LocalidadTableModelListener(frmLocalidad pantallaLocalidad) {
        this.frmLocalidad = pantallaLocalidad;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // obtenemos el pedido seleccionado
        Localidad seleccionado = frmLocalidad.obtenerPedidoSeleccionado();

        // actualizamos el detalle del pedido
        if (seleccionado != null) {
//            frmLocalidad.getTablaDetallePedidoModel().setDetalles(seleccionado.getDetallesPedido());
//            frmLocalidad.getTablaDetallePedidoModel().fireTableDataChanged();

            // actualizamos el total del pedido
//            frmLocalidad.getTxtTotalPedido().setText("$" + seleccionado.calcTotalPedido());
        }
    }
    
}
