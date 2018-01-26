package model;
// Generated Jan 26, 2018 10:48:47 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PreviledgeRelstionship generated by hbm2java
 */
@Entity
@Table(name = "previledge_relstionship", catalog = "test")
public class PreviledgeRelstionship implements java.io.Serializable {

	private Integer previledgeRelstionshipId;
	private Previledge previledgeByParentPreviledgeId;
	private Previledge previledgeByChildPreviledgeId;
	private String previledgeRelstionshipDesc;

	public PreviledgeRelstionship() {
	}

	public PreviledgeRelstionship(String previledgeRelstionshipDesc) {
		this.previledgeRelstionshipDesc = previledgeRelstionshipDesc;
	}

	public PreviledgeRelstionship(Previledge previledgeByParentPreviledgeId, Previledge previledgeByChildPreviledgeId,
			String previledgeRelstionshipDesc) {
		this.previledgeByParentPreviledgeId = previledgeByParentPreviledgeId;
		this.previledgeByChildPreviledgeId = previledgeByChildPreviledgeId;
		this.previledgeRelstionshipDesc = previledgeRelstionshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "previledge_relstionship_id", unique = true, nullable = false)
	public Integer getPreviledgeRelstionshipId() {
		return this.previledgeRelstionshipId;
	}

	public void setPreviledgeRelstionshipId(Integer previledgeRelstionshipId) {
		this.previledgeRelstionshipId = previledgeRelstionshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_previledge_id")
	public Previledge getPreviledgeByParentPreviledgeId() {
		return this.previledgeByParentPreviledgeId;
	}

	public void setPreviledgeByParentPreviledgeId(Previledge previledgeByParentPreviledgeId) {
		this.previledgeByParentPreviledgeId = previledgeByParentPreviledgeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_previledge_id")
	public Previledge getPreviledgeByChildPreviledgeId() {
		return this.previledgeByChildPreviledgeId;
	}

	public void setPreviledgeByChildPreviledgeId(Previledge previledgeByChildPreviledgeId) {
		this.previledgeByChildPreviledgeId = previledgeByChildPreviledgeId;
	}

	@Column(name = "previledge_relstionship_desc", nullable = false, length = 65535)
	public String getPreviledgeRelstionshipDesc() {
		return this.previledgeRelstionshipDesc;
	}

	public void setPreviledgeRelstionshipDesc(String previledgeRelstionshipDesc) {
		this.previledgeRelstionshipDesc = previledgeRelstionshipDesc;
	}

}
