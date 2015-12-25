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
@Table(name = "configuration_mark")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfigurationMark.findAll", query = "SELECT c FROM ConfigurationMark c"),
    @NamedQuery(name = "ConfigurationMark.findByGradIDmark", query = "SELECT c FROM ConfigurationMark c WHERE c.gradIDmark = :gradIDmark"),
    @NamedQuery(name = "ConfigurationMark.findByPCodemark", query = "SELECT c FROM ConfigurationMark c WHERE c.pCodemark = :pCodemark"),
    @NamedQuery(name = "ConfigurationMark.findByPAsmntmark", query = "SELECT c FROM ConfigurationMark c WHERE c.pAsmntmark = :pAsmntmark"),
    @NamedQuery(name = "ConfigurationMark.findByPFinalmark", query = "SELECT c FROM ConfigurationMark c WHERE c.pFinalmark = :pFinalmark"),
    @NamedQuery(name = "ConfigurationMark.findByPQuizmark", query = "SELECT c FROM ConfigurationMark c WHERE c.pQuizmark = :pQuizmark")})
public class ConfigurationMark implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gradID_mark")
    private Integer gradIDmark;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "pCode_mark")
    private String pCodemark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pAsmnt_mark")
    private int pAsmntmark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pFinal_mark")
    private int pFinalmark;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pQuiz_mark")
    private int pQuizmark;

    public ConfigurationMark() {
    }

    public ConfigurationMark(Integer gradIDmark) {
        this.gradIDmark = gradIDmark;
    }

    public ConfigurationMark(Integer gradIDmark, String pCodemark, int pAsmntmark, int pFinalmark, int pQuizmark) {
        this.gradIDmark = gradIDmark;
        this.pCodemark = pCodemark;
        this.pAsmntmark = pAsmntmark;
        this.pFinalmark = pFinalmark;
        this.pQuizmark = pQuizmark;
    }

    public Integer getGradIDmark() {
        return gradIDmark;
    }

    public void setGradIDmark(Integer gradIDmark) {
        this.gradIDmark = gradIDmark;
    }

    public String getPCodemark() {
        return pCodemark;
    }

    public void setPCodemark(String pCodemark) {
        this.pCodemark = pCodemark;
    }

    public int getPAsmntmark() {
        return pAsmntmark;
    }

    public void setPAsmntmark(int pAsmntmark) {
        this.pAsmntmark = pAsmntmark;
    }

    public int getPFinalmark() {
        return pFinalmark;
    }

    public void setPFinalmark(int pFinalmark) {
        this.pFinalmark = pFinalmark;
    }

    public int getPQuizmark() {
        return pQuizmark;
    }

    public void setPQuizmark(int pQuizmark) {
        this.pQuizmark = pQuizmark;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gradIDmark != null ? gradIDmark.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfigurationMark)) {
            return false;
        }
        ConfigurationMark other = (ConfigurationMark) object;
        if ((this.gradIDmark == null && other.gradIDmark != null) || (this.gradIDmark != null && !this.gradIDmark.equals(other.gradIDmark))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "my.superprogrammer.ecampus.model.ConfigurationMark[ gradIDmark=" + gradIDmark + " ]";
    }
    
}
