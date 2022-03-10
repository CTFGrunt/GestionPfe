/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.dao;

import java.util.List;
import sn.ept.gestion_soutenance.entities.Evaluation;

/**
 *
 * @author ssidibe
 */
public interface IEvaluationDAO {
    
    public List<Evaluation> listEvaluations();
    
    public void addEvaluation(Evaluation evaluation);
    
    
    
}
