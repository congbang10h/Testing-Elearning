package model;
// Generated Jan 26, 2018 10:48:47 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * QuestionGroup generated by hbm2java
 */
@Entity
@Table(name = "question_group", catalog = "test")
public class QuestionGroup implements java.io.Serializable {

	private Integer questionGroupId;
	private User user;
	private String questionGroupDesc;
	private Set<QgroupQuestionMap> qgroupQuestionMaps = new HashSet<QgroupQuestionMap>(0);
	private Set<QgroupTopicMap> qgroupTopicMaps = new HashSet<QgroupTopicMap>(0);
	private Set<QgroupContentMap> qgroupContentMaps = new HashSet<QgroupContentMap>(0);

	public QuestionGroup() {
	}

	public QuestionGroup(String questionGroupDesc) {
		this.questionGroupDesc = questionGroupDesc;
	}

	public QuestionGroup(User user, String questionGroupDesc, Set<QgroupQuestionMap> qgroupQuestionMaps,
			Set<QgroupTopicMap> qgroupTopicMaps, Set<QgroupContentMap> qgroupContentMaps) {
		this.user = user;
		this.questionGroupDesc = questionGroupDesc;
		this.qgroupQuestionMaps = qgroupQuestionMaps;
		this.qgroupTopicMaps = qgroupTopicMaps;
		this.qgroupContentMaps = qgroupContentMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_group_id", unique = true, nullable = false)
	public Integer getQuestionGroupId() {
		return this.questionGroupId;
	}

	public void setQuestionGroupId(Integer questionGroupId) {
		this.questionGroupId = questionGroupId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "question_group_desc", nullable = false, length = 65535)
	public String getQuestionGroupDesc() {
		return this.questionGroupDesc;
	}

	public void setQuestionGroupDesc(String questionGroupDesc) {
		this.questionGroupDesc = questionGroupDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupQuestionMap> getQgroupQuestionMaps() {
		return this.qgroupQuestionMaps;
	}

	public void setQgroupQuestionMaps(Set<QgroupQuestionMap> qgroupQuestionMaps) {
		this.qgroupQuestionMaps = qgroupQuestionMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupTopicMap> getQgroupTopicMaps() {
		return this.qgroupTopicMaps;
	}

	public void setQgroupTopicMaps(Set<QgroupTopicMap> qgroupTopicMaps) {
		this.qgroupTopicMaps = qgroupTopicMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupContentMap> getQgroupContentMaps() {
		return this.qgroupContentMaps;
	}

	public void setQgroupContentMaps(Set<QgroupContentMap> qgroupContentMaps) {
		this.qgroupContentMaps = qgroupContentMaps;
	}

}
