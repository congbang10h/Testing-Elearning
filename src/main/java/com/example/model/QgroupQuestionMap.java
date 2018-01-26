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
 * QgroupQuestionMap generated by hbm2java
 */
@Entity
@Table(name = "qgroup_question_map", catalog = "test")
public class QgroupQuestionMap implements java.io.Serializable {

	private Integer qgroupQuestionMapId;
	private Question question;
	private QuestionGroup questionGroup;

	public QgroupQuestionMap() {
	}

	public QgroupQuestionMap(Question question, QuestionGroup questionGroup) {
		this.question = question;
		this.questionGroup = questionGroup;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "qgroup_question_map_id", unique = true, nullable = false)
	public Integer getQgroupQuestionMapId() {
		return this.qgroupQuestionMapId;
	}

	public void setQgroupQuestionMapId(Integer qgroupQuestionMapId) {
		this.qgroupQuestionMapId = qgroupQuestionMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_group_id")
	public QuestionGroup getQuestionGroup() {
		return this.questionGroup;
	}

	public void setQuestionGroup(QuestionGroup questionGroup) {
		this.questionGroup = questionGroup;
	}

}
