// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

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
 * RolePreviledgeMap generated by hbm2java
 */
@Entity
@Table(name = "role_previledge_map", catalog = "test")
public class RolePreviledgeMap implements java.io.Serializable {

	private Integer rolePreviledgeMapId;
	private Previledge previledge;
	private Role role;

	public RolePreviledgeMap() {
	}

	public RolePreviledgeMap(Previledge previledge, Role role) {
		this.previledge = previledge;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "role_previledge_map_id", unique = true, nullable = false)
	public Integer getRolePreviledgeMapId() {
		return this.rolePreviledgeMapId;
	}

	public void setRolePreviledgeMapId(Integer rolePreviledgeMapId) {
		this.rolePreviledgeMapId = rolePreviledgeMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "previledge_id")
	public Previledge getPreviledge() {
		return this.previledge;
	}

	public void setPreviledge(Previledge previledge) {
		this.previledge = previledge;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
