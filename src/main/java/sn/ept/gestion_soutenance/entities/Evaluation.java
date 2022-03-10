/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author ssidibe
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Evaluation.findAll", query = "SELECT e FROM Evaluation e")
})
public class Evaluation implements Serializable {

    @EmbeddedId
    private EvaluationPK evaluationPK;

    @ManyToOne
    @MapsId("idEvaluateur")
    private Evaluateur evaluateur;

    @ManyToOne
    @MapsId("idMemoire")
    private Memoire memoire;

    @ManyToOne
    @MapsId("idElementCompetence")
    private ElementCompetence elementCompetence;
    
    private Short note;
    
    private String commentaire;

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
    

    public Short getNote() {
        return note;
    }

    public void setNote(Short note) {
        this.note = note;
    }
    
    

    public EvaluationPK getEvaluationPK() {
        return evaluationPK;
    }

    public void setEvaluationPK(EvaluationPK evaluationPK) {
        this.evaluationPK = evaluationPK;
    }

    public Evaluateur getEvaluateur() {
        return evaluateur;
    }

    public void setEvaluateur(Evaluateur evaluateur) {
        this.evaluateur = evaluateur;
    }

    public Memoire getMemoire() {
        return memoire;
    }

    public void setMemoire(Memoire memoire) {
        this.memoire = memoire;
    }

    public ElementCompetence getElementCompetence() {
        return elementCompetence;
    }

    public void setElementCompetence(ElementCompetence elementCompetence) {
        this.elementCompetence = elementCompetence;
    }

}
