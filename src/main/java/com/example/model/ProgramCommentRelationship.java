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
 * ProgramCommentRelationship generated by hbm2java
 */
@Entity
@Table(name = "program_comment_relationship", catalog = "test")
public class ProgramCommentRelationship implements java.io.Serializable {

	private Integer programCommentRelationshipId;
	private ProgramComment programCommentByProProgramCommentId;
	private ProgramComment programCommentByProgramCommentId;
	private String programCommentRelationshipDesc;

	public ProgramCommentRelationship() {
	}

	public ProgramCommentRelationship(ProgramComment programCommentByProProgramCommentId,
			ProgramComment programCommentByProgramCommentId, String programCommentRelationshipDesc) {
		this.programCommentByProProgramCommentId = programCommentByProProgramCommentId;
		this.programCommentByProgramCommentId = programCommentByProgramCommentId;
		this.programCommentRelationshipDesc = programCommentRelationshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "program_comment_relationship_id", unique = true, nullable = false)
	public Integer getProgramCommentRelationshipId() {
		return this.programCommentRelationshipId;
	}

	public void setProgramCommentRelationshipId(Integer programCommentRelationshipId) {
		this.programCommentRelationshipId = programCommentRelationshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pro_program_comment_id")
	public ProgramComment getProgramCommentByProProgramCommentId() {
		return this.programCommentByProProgramCommentId;
	}

	public void setProgramCommentByProProgramCommentId(ProgramComment programCommentByProProgramCommentId) {
		this.programCommentByProProgramCommentId = programCommentByProProgramCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_comment_id")
	public ProgramComment getProgramCommentByProgramCommentId() {
		return this.programCommentByProgramCommentId;
	}

	public void setProgramCommentByProgramCommentId(ProgramComment programCommentByProgramCommentId) {
		this.programCommentByProgramCommentId = programCommentByProgramCommentId;
	}

	@Column(name = "program_comment_relationship_desc", length = 65535)
	public String getProgramCommentRelationshipDesc() {
		return this.programCommentRelationshipDesc;
	}

	public void setProgramCommentRelationshipDesc(String programCommentRelationshipDesc) {
		this.programCommentRelationshipDesc = programCommentRelationshipDesc;
	}

}
