package home.Springboot.jpa.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CLNT_IDENTIFICATION database table.
 * 
 */
@Entity
@Table(name="CLNT_IDENTIFICATION")
@NamedQuery(name="ClntIdentification.findAll", query="SELECT c FROM ClntIdentification c")
public class ClntIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long systemclient;

	private String cif;

	//bi-directional one-to-one association to Clnt
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

}