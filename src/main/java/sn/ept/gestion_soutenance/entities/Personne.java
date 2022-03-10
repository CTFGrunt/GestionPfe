/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.gestion_soutenance.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author ssidibe
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Personne.findAll", query = "SELECT e FROM Personne e")
})
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nom;
    
    private String prenom;
    
    
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    
    private String lieuNaissance;
    
    @Column(name = "EMAIL_PROFESSIONNEL",unique = true, nullable=false)
    private String emailPro;
    
    @Column(name = "EMAIL_PERSONNEL",nullable = true, unique = true)
    private String emailPerso;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateEnregistrement;
    
    @Transient
    private Integer age;
    
    @OneToOne(mappedBy = "etudiant")
    private Memoire memoire;

    public Personne(String nom, String prenom, String emailPro) {
        this.nom = nom;
        this.prenom = prenom;
        this.emailPro = emailPro;
    }

    public Personne() {
    }

    
    
    
    public Date getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(Date dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    public String getEmailPerso() {
        return emailPerso;
    }

    public void setEmailPerso(String emailPerso) {
        this.emailPerso = emailPerso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        return Objects.equals(this.id, other.id);
    }
    
    @PrePersist
    public void avantEnregistrement(){
        dateEnregistrement = new Date();
    }

    //ngfarimata@ept.sn
  
    
}
