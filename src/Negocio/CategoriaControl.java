/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidades.Categoria;
import datosDAO.CategoriaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jccam
 */
public class CategoriaControl {
    private final CategoriaDAO DATOS;
    private Categoria obj;
    private DefaultTableModel tModel;
    
    public CategoriaControl(){
        this.DATOS = new CategoriaDAO();
        this.obj = new Categoria();
    }
    
    public DefaultTableModel listar (String texto){
        List<Categoria> lista = new ArrayList();
        lista.addAll(DATOS.getAll(texto));
        String[] titulos = 
        {"id", "nombre", "Descripcion", "Estado"};
        this.tModel = new Default
    }
    
    public String Insertar(String nombre, String descripcion){
        
    }
    
    public actualizar(int id, String nombre, String nombreAnterior, String descripcion){
        
    }
    
    public String desactivar (int id){
        
    }
    
    public String activar (int id){
        
    }
    
    public int total(){
        
    }
}
