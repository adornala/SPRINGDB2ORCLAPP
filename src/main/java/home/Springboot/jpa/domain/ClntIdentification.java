package home.Springboot.jpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the CLNT_IDENTIFICATION database table.
 *
 */
@Entity
@Table(name="CLNT_IDENTIFICATION")
public class ClntIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long systemclient;

	@Column(length=255)
	private String cif;

	//bi-directional one-to-one association to Clnt
	@JsonIgnore
	@OneToOne(mappedBy="clntIdentification")
	private Clnt clnt;

	public ClntIdentification() {
	}

	public long getSystemclient() {
		return this.systemclient;
	}

	public void setSystemclient(long systemclient) {
		this.systemclient = systemclient;
	}

	public String getCif() {
		return this.cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Clnt getClnt() {
		return this.clnt;
	}

	public void setClnt(Clnt clnt) {
		this.clnt = clnt;
	}

    @Override
    public String toString() {
        return "ClntIdentification{" +
                "systemclient=" + systemclient +
                ", cif='" + cif + '\'' +
                ", clnt=" + clnt +
                '}';
    }
}