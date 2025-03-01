/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datoss.interfaces;

import java.util.List;

/**
 *
 * @author jccam
 */
public interface CRUDGeneralInterface <T> {
    public List<T> getAll(String list);
    public boolean insert(T object );
    public boolean update (T object );
    public boolean onVariable();
    public boolean offVariable();
    public int exist(String text);
    public int total();
}
