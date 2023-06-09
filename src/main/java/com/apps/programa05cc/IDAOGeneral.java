/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.apps.programa05cc;

import java.util.List;

/**
 *
 * @author irvin
 * @param <T>
 * @param <ID>
 */
public interface IDAOGeneral<T, ID> {
    public T create(T p);
    public boolean delete(ID id);
    public T update(ID id, T p);
    
    public List<T> findAll();
    public T findByID(ID id);
}
