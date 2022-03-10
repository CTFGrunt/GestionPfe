/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.services;

import java.util.List;
import sn.ept.gestion_soutenance.dao.EvaluationDaoImpl;
import sn.ept.gestion_soutenance.dao.IEvaluationDAO;
import sn.ept.gestion_soutenance.entities.Evaluation;

/**
 *
 * @author ssidibe
 */
public class EvaluationServiceImpl implements IEvaluationService{
    
    private IEvaluationDAO evaluationDAO;

    public EvaluationServiceImpl() {
        evaluationDAO = new EvaluationDaoImpl();
    }

    @Override
    public List<Evaluation> listEvaluation() {
           return evaluationDAO.listEvaluations();
    }
    
    
    
}
