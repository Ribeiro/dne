package me.yanaga.dne.app.bean;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LogFaixaUfPK implements Serializable{

	@Column(length = 2, nullable = false)
	private String ufeSg;

	@Column(length = 8, nullable = false)
	private String ufeCepIni;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LogFaixaUfPK) {
			LogFaixaUfPK other = (LogFaixaUfPK) obj;
			return Objects.equal(this.ufeSg, other.ufeSg)
					&& Objects.equal(this.ufeCepIni, other.ufeCepIni);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.ufeSg, this.ufeCepIni);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("ufeSg", this.ufeSg)
				.add("ufeCepIni", this.ufeCepIni)
				.toString();
	}

	public String getUfeSg() {
		return ufeSg;
	}

	public void setUfeSg(String ufeSg) {
		this.ufeSg = ufeSg;
	}

	public String getUfeCepIni() {
		return ufeCepIni;
	}

	public void setUfeCepIni(String ufeCepIni) {
		this.ufeCepIni = ufeCepIni;
	}
}
