/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BaseIngles.BaseIngles.service;

import BaseIngles.BaseIngles.entity.Examen;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface ExamenService {
   public Examen createExamen(Examen examen);
    public List<Examen> findAllExamen();
    public Examen save(Examen examen);
    public void delete(Examen examen);
    public Examen findExamen(Examen examen); 
    public Examen findExamenById(Long id); 
    public Examen evaluar(Examen examen);
}
