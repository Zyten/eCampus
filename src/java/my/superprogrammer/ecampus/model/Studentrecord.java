/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.superprogrammer.ecampus.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "studentrecord")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentrecord.findAll", query = "SELECT s FROM Studentrecord s"),
    @NamedQuery(name = "Studentrecord.findByRecordIDsr", query = "SELECT s FROM Studentrecord s WHERE s.recordIDsr = :recordIDsr"),
    @NamedQuery(name = "Studentrecord.findByFinalSr", query = "SELECT s FROM Studentrecord s WHERE s.finalSr = :finalSr"),
    @NamedQuery(name = "Studentrecord.findByQuizSr", query = "SELECT s FROM Studentrecord s WHERE s.quizSr = :quizSr"),
    @NamedQuery(name = "Studentrecord.findByAssesmentSr", query = "SELECT s FROM Studentrecord s WHERE s.assesmentSr = :assesmentSr"),
    @NamedQuery(name = "Studentrecord.findByTotalMarksr", query = "SELECT s FROM Studentrecord s WHERE s.totalMarksr = :totalMarksr"),
    @NamedQuery(name = "Studentrecord.findByApplicantIDsr", query = "SELECT s FROM Studentrecord s WHERE s.applicantIDsr = :applicantIDsr")})
public class Studentrecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "recordID_sr")
    private Integer recordIDsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "final_sr")
    private float finalSr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quiz_sr")
    private Float quizSr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "assesment_sr")
    private float assesmentSr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalMark_sr")
    private float totalMarksr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "applicantID_sr")
    private int applicantIDsr;

    public Studentrecord() {
    }

    public Studentrecord(Integer recordIDsr) {
        this.recordIDsr = recordIDsr;
    }

    public Studentrecord(Integer recordIDsr, float finalSr, float assesmentSr, float totalMarksr, int applicantIDsr) {
        this.recordIDsr = recordIDsr;
        this.finalSr = finalSr;
        this.assesmentSr = assesmentSr;
        this.totalMarksr = totalMarksr;
        this.applicantIDsr = applicantIDsr;
    }

    public Integer getRecordIDsr() {
        return recordIDsr;
    }

    public void setRecordIDsr(Integer recordIDsr) {
        this.recordIDsr = recordIDsr;
    }

    public float getFinalSr() {
        return finalSr;
    }

    public void setFinalSr(float finalSr) {
        this.finalSr = finalSr;
    }

    public Float getQuizSr() {
        return quizSr;
    }

    public void setQuizSr(Float quizSr) {
        this.quizSr = quizSr;
    }

    public float getAssesmentSr() {
        return assesmentSr;
    }

    public void setAssesmentSr(float assesmentSr) {
        this.assesmentSr = assesmentSr;
    }

    public float getTotalMarksr() {
        return totalMarksr;
    }

    public void setTotalMarksr(float totalMarksr) {
        this.totalMarksr = totalMarksr;
    }

    public int getApplicantIDsr() {
        return applicantIDsr;
    }

    public void setApplicantIDsr(int applicantIDsr) {
        this.applicantIDsr = applicantIDsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordIDsr != null ? recordIDsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentrecord)) {
            return false;
        }
        Studentrecord other = (Studentrecord) object;
        if ((this.recordIDsr == null && other.recordIDsr != null) || (this.recordIDsr != null && !this.recordIDsr.equals(other.recordIDsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.superprogrammer.ecampus.model.Studentrecord[ recordIDsr=" + recordIDsr + " ]";
    }
    
}
