// default package
// Generated Jan 26, 2018 7:38:22 PM by Hibernate Tools 4.3.5.Final

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
 * QuestionItem generated by hbm2java
 */
@Entity
@Table(name = "question_item", catalog = "test")
public class QuestionItem implements java.io.Serializable {

	private Integer itemId;
	private Question question;
	private String itemCode;
	private String itemDesc;
	private byte itemOrder;
	private String itemReviewerComment;
	private String itemTakerComment;
	private Set<QuestionItemInfo> questionItemInfos = new HashSet<QuestionItemInfo>(0);
	private Set<FillableElement> fillableElements = new HashSet<FillableElement>(0);
	private Set<TakersolutionComponent> takersolutionComponentsForItemId = new HashSet<TakersolutionComponent>(0);
	private Set<TakersolutionComponent> takersolutionComponentsForQueItemId = new HashSet<TakersolutionComponent>(0);
	private Set<QsolutionComponent> qsolutionComponentsForNextItemId = new HashSet<QsolutionComponent>(0);
	private Set<QsolutionComponent> qsolutionComponentsForCurItemId = new HashSet<QsolutionComponent>(0);

	public QuestionItem() {
	}

	public QuestionItem(byte itemOrder) {
		this.itemOrder = itemOrder;
	}

	public QuestionItem(Question question, String itemCode, String itemDesc, byte itemOrder, String itemReviewerComment,
			String itemTakerComment, Set<QuestionItemInfo> questionItemInfos, Set<FillableElement> fillableElements,
			Set<TakersolutionComponent> takersolutionComponentsForItemId,
			Set<TakersolutionComponent> takersolutionComponentsForQueItemId,
			Set<QsolutionComponent> qsolutionComponentsForNextItemId,
			Set<QsolutionComponent> qsolutionComponentsForCurItemId) {
		this.question = question;
		this.itemCode = itemCode;
		this.itemDesc = itemDesc;
		this.itemOrder = itemOrder;
		this.itemReviewerComment = itemReviewerComment;
		this.itemTakerComment = itemTakerComment;
		this.questionItemInfos = questionItemInfos;
		this.fillableElements = fillableElements;
		this.takersolutionComponentsForItemId = takersolutionComponentsForItemId;
		this.takersolutionComponentsForQueItemId = takersolutionComponentsForQueItemId;
		this.qsolutionComponentsForNextItemId = qsolutionComponentsForNextItemId;
		this.qsolutionComponentsForCurItemId = qsolutionComponentsForCurItemId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "item_id", unique = true, nullable = false)
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name = "item_code", length = 10)
	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "item_desc", length = 65535)
	public String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	@Column(name = "item_order", nullable = false)
	public byte getItemOrder() {
		return this.itemOrder;
	}

	public void setItemOrder(byte itemOrder) {
		this.itemOrder = itemOrder;
	}

	@Column(name = "item_reviewer_comment", length = 65535)
	public String getItemReviewerComment() {
		return this.itemReviewerComment;
	}

	public void setItemReviewerComment(String itemReviewerComment) {
		this.itemReviewerComment = itemReviewerComment;
	}

	@Column(name = "item_taker_comment", length = 65535)
	public String getItemTakerComment() {
		return this.itemTakerComment;
	}

	public void setItemTakerComment(String itemTakerComment) {
		this.itemTakerComment = itemTakerComment;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionItem")
	public Set<QuestionItemInfo> getQuestionItemInfos() {
		return this.questionItemInfos;
	}

	public void setQuestionItemInfos(Set<QuestionItemInfo> questionItemInfos) {
		this.questionItemInfos = questionItemInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionItem")
	public Set<FillableElement> getFillableElements() {
		return this.fillableElements;
	}

	public void setFillableElements(Set<FillableElement> fillableElements) {
		this.fillableElements = fillableElements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionItemByItemId")
	public Set<TakersolutionComponent> getTakersolutionComponentsForItemId() {
		return this.takersolutionComponentsForItemId;
	}

	public void setTakersolutionComponentsForItemId(Set<TakersolutionComponent> takersolutionComponentsForItemId) {
		this.takersolutionComponentsForItemId = takersolutionComponentsForItemId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionItemByQueItemId")
	public Set<TakersolutionComponent> getTakersolutionComponentsForQueItemId() {
		return this.takersolutionComponentsForQueItemId;
	}

	public void setTakersolutionComponentsForQueItemId(
			Set<TakersolutionComponent> takersolutionComponentsForQueItemId) {
		this.takersolutionComponentsForQueItemId = takersolutionComponentsForQueItemId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionItemByNextItemId")
	public Set<QsolutionComponent> getQsolutionComponentsForNextItemId() {
		return this.qsolutionComponentsForNextItemId;
	}

	public void setQsolutionComponentsForNextItemId(Set<QsolutionComponent> qsolutionComponentsForNextItemId) {
		this.qsolutionComponentsForNextItemId = qsolutionComponentsForNextItemId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionItemByCurItemId")
	public Set<QsolutionComponent> getQsolutionComponentsForCurItemId() {
		return this.qsolutionComponentsForCurItemId;
	}

	public void setQsolutionComponentsForCurItemId(Set<QsolutionComponent> qsolutionComponentsForCurItemId) {
		this.qsolutionComponentsForCurItemId = qsolutionComponentsForCurItemId;
	}

}
