/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.interfaces;

import java.util.List;



/**
 *
 * @author Theacher
 * @param <Entidad>
 */
public interface Operaciones <Entidad>{
    public int create(Entidad x);
    public int update(Entidad x);
    public int delete(Object key);
    public List<Entidad> readAll();
    public Entidad read(Object key);
    
}
