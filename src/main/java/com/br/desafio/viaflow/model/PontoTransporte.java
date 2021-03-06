package com.br.desafio.viaflow.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 ** Classe que representa o ponto de parada de ônibus.
 * <ul><span style="text-decoration: underline;font-weight: bolder">Atributos</span>
 * <li>indice - Identificador de ponto de parada oriundo da API
 * (mobilidade)</li>
 * <li>latitude - Descreve a latitude</li>
 * <li>longitude - Descreve a longitude</li>
 * <li>linhaTransporte - Descreve a linha por onde os pontos irão passar</li>
 * </ul>
 *
 *
 * @author gianlucampos
 */
@Entity
@Table(name = "PONTOTRANSPORTE")
public class PontoTransporte implements Serializable {

    @Id
    @SequenceGenerator(name = "seqpontotransporte", sequenceName = "seqpontotransporte", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqpontotransporte")
    private Long id;
    @Column
    private Long indice;
    @Column
    private Double latidude;
    @Column
    private Double longitude;
    @ManyToOne
    @JoinColumn(name="LINHATRANSPORTEID",referencedColumnName = "ID")
    private LinhaTransporte linhaTransporte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndice() {
        return indice;
    }

    public void setIndice(Long indice) {
        this.indice = indice;
    }

    public Double getLatidude() {
        return latidude;
    }

    public void setLatidude(Double latidude) {
        this.latidude = latidude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LinhaTransporte getLinhaTransporte() {
        return linhaTransporte;
    }

    public void setLinhaTransporte(LinhaTransporte linhaTransporte) {
        this.linhaTransporte = linhaTransporte;
    }

}
