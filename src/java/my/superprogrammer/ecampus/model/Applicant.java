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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "applicant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applicant.findAll", query = "SELECT a FROM Applicant a"),
    @NamedQuery(name = "Applicant.findByApplicantIDapplicant", query = "SELECT a FROM Applicant a WHERE a.applicantIDapplicant = :applicantIDapplicant"),
    @NamedQuery(name = "Applicant.findByNameApplicant", query = "SELECT a FROM Applicant a WHERE a.nameApplicant = :nameApplicant"),
    @NamedQuery(name = "Applicant.findByNricApplicant", query = "SELECT a FROM Applicant a WHERE a.nricApplicant = :nricApplicant"),
    @NamedQuery(name = "Applicant.findByRaceApplicant", query = "SELECT a FROM Applicant a WHERE a.raceApplicant = :raceApplicant"),
    @NamedQuery(name = "Applicant.findByPhoneApplicant", query = "SELECT a FROM Applicant a WHERE a.phoneApplicant = :phoneApplicant"),
    @NamedQuery(name = "Applicant.findByEmailApplicant", query = "SELECT a FROM Applicant a WHERE a.emailApplicant = :emailApplicant"),
    @NamedQuery(name = "Applicant.findByAddressApplicant", query = "SELECT a FROM Applicant a WHERE a.addressApplicant = :addressApplicant"),
    @NamedQuery(name = "Applicant.findByEdulvlApplicant", query = "SELECT a FROM Applicant a WHERE a.edulvlApplicant = :edulvlApplicant"),
    @NamedQuery(name = "Applicant.findByInstitutionApplicant", query = "SELECT a FROM Applicant a WHERE a.institutionApplicant = :institutionApplicant"),
    @NamedQuery(name = "Applicant.findByPcodeApplicant", query = "SELECT a FROM Applicant a WHERE a.pcodeApplicant = :pcodeApplicant"),
    @NamedQuery(name = "Applicant.findByStatusApplicant", query = "SELECT a FROM Applicant a WHERE a.statusApplicant = :statusApplicant"),
    @NamedQuery(name = "Applicant.findByStartDateapplicant", query = "SELECT a FROM Applicant a WHERE a.startDateapplicant = :startDateapplicant"),
    @NamedQuery(name = "Applicant.findByEndDateapplicant", query = "SELECT a FROM Applicant a WHERE a.endDateapplicant = :endDateapplicant"),
    @NamedQuery(name = "Applicant.findByResultApplicant", query = "SELECT a FROM Applicant a WHERE a.resultApplicant = :resultApplicant")})
public class Applicant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "applicantID_applicant")
    private Integer applicantIDapplicant;
    @Size(max = 45)
    @Column(name = "name_applicant")
    private String nameApplicant;
    @Size(max = 45)
    @Column(name = "nric_applicant")
    private String nricApplicant;
    @Size(max = 45)
    @Column(name = "race_applicant")
    private String raceApplicant;
    @Size(max = 45)
    @Column(name = "phone_applicant")
    private String phoneApplicant;
    @Size(max = 45)
    @Column(name = "email_applicant")
    private String emailApplicant;
    @Size(max = 45)
    @Column(name = "address_applicant")
    private String addressApplicant;
    @Size(max = 45)
    @Column(name = "edulvl_applicant")
    private String edulvlApplicant;
    @Size(max = 45)
    @Column(name = "institution_applicant")
    private String institutionApplicant;
    @Column(name = "pcode_applicant")
    private Integer pcodeApplicant;
    @Column(name = "status_applicant")
    private Integer statusApplicant;
    @Size(max = 45)
    @Column(name = "startDate_applicant")
    private String startDateapplicant;
    @Size(max = 45)
    @Column(name = "endDate_applicant")
    private String endDateapplicant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "result_applicant")
    private String resultApplicant;

    public Applicant() {
    }

    public Applicant(Integer applicantIDapplicant) {
        this.applicantIDapplicant = applicantIDapplicant;
    }

    public Applicant(Integer applicantIDapplicant, String resultApplicant) {
        this.applicantIDapplicant = applicantIDapplicant;
        this.resultApplicant = resultApplicant;
    }

    public Integer getApplicantIDapplicant() {
        return applicantIDapplicant;
    }

    public void setApplicantIDapplicant(Integer applicantIDapplicant) {
        this.applicantIDapplicant = applicantIDapplicant;
    }

    public String getNameApplicant() {
        return nameApplicant;
    }

    public void setNameApplicant(String nameApplicant) {
        this.nameApplicant = nameApplicant;
    }

    public String getNricApplicant() {
        return nricApplicant;
    }

    public void setNricApplicant(String nricApplicant) {
        this.nricApplicant = nricApplicant;
    }

    public String getRaceApplicant() {
        return raceApplicant;
    }

    public void setRaceApplicant(String raceApplicant) {
        this.raceApplicant = raceApplicant;
    }

    public String getPhoneApplicant() {
        return phoneApplicant;
    }

    public void setPhoneApplicant(String phoneApplicant) {
        this.phoneApplicant = phoneApplicant;
    }

    public String getEmailApplicant() {
        return emailApplicant;
    }

    public void setEmailApplicant(String emailApplicant) {
        this.emailApplicant = emailApplicant;
    }

    public String getAddressApplicant() {
        return addressApplicant;
    }

    public void setAddressApplicant(String addressApplicant) {
        this.addressApplicant = addressApplicant;
    }

    public String getEdulvlApplicant() {
        return edulvlApplicant;
    }

    public void setEdulvlApplicant(String edulvlApplicant) {
        this.edulvlApplicant = edulvlApplicant;
    }

    public String getInstitutionApplicant() {
        return institutionApplicant;
    }

    public void setInstitutionApplicant(String institutionApplicant) {
        this.institutionApplicant = institutionApplicant;
    }

    public Integer getPcodeApplicant() {
        return pcodeApplicant;
    }

    public void setPcodeApplicant(Integer pcodeApplicant) {
        this.pcodeApplicant = pcodeApplicant;
    }

    public Integer getStatusApplicant() {
        return statusApplicant;
    }

    public void setStatusApplicant(Integer statusApplicant) {
        this.statusApplicant = statusApplicant;
    }

    public String getStartDateapplicant() {
        return startDateapplicant;
    }

    public void setStartDateapplicant(String startDateapplicant) {
        this.startDateapplicant = startDateapplicant;
    }

    public String getEndDateapplicant() {
        return endDateapplicant;
    }

    public void setEndDateapplicant(String endDateapplicant) {
        this.endDateapplicant = endDateapplicant;
    }

    public String getResultApplicant() {
        return resultApplicant;
    }

    public void setResultApplicant(String resultApplicant) {
        this.resultApplicant = resultApplicant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicantIDapplicant != null ? applicantIDapplicant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applicant)) {
            return false;
        }
        Applicant other = (Applicant) object;
        if ((this.applicantIDapplicant == null && other.applicantIDapplicant != null) || (this.applicantIDapplicant != null && !this.applicantIDapplicant.equals(other.applicantIDapplicant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.superprogrammer.ecampus.model.Applicant[ applicantIDapplicant=" + applicantIDapplicant + " ]";
    }
    
}
