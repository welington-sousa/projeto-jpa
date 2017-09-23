package br.edu.uni7.persistence;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TBL_DEBITOS_TECNICOS")
@DiscriminatorValue("DT") // indetifica a classe DebitoTecnico
@PrimaryKeyJoinColumn(name = "FK_ITEM_AVAL")
public class DebitoTecnico extends ItemAvaliacao {

	@Size(min = 1, max = 5, message = "O custo do débito deve ser no intervalo de ${min} a ${max}")
	@Column(name = "NU_CUSTO")
	private Long custo;

	@Enumerated(EnumType.STRING)
	@Column(name = "ST_IMPACTO")
	private Impacto impacto;

	public Impacto getImpacto() {
		return impacto;
	}

	public void setImpacto(Impacto impacto) {
		this.impacto = impacto;
	}

	public Long getCusto() {
		return custo;
	}

	public void setCusto(Long custo) {
		this.custo = custo;
	}
}
