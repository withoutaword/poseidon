package com.yoke.poseidon.cart.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Yoke
 * @Date 2019/01/11 下午8:48
 */
public class ItemCartDto implements Serializable {

	private static final long serialVersionUID = 1808627743375856813L;

	private Long itemCartId;

	private Long memberId;

	private Date createDate;

	private Date modifyDate;

	private String remark;

	private Integer itemCartStatus;

	/**
	 * 数量
	 */
	private Integer quantity;

	private String itemId;

	private BigDecimal price;

	private Long itemCatId;

	private String memberNickname;

	private String itemImage;

	private String itemSellPoint;

	private String itemName;

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getItemSellPoint() {
		return itemSellPoint;
	}

	public void setItemSellPoint(String itemSellPoint) {
		this.itemSellPoint = itemSellPoint;
	}

	public Long getItemCartId() {
		return itemCartId;
	}

	public void setItemCartId(Long itemCartId) {
		this.itemCartId = itemCartId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getItemCartStatus() {
		return itemCartStatus;
	}

	public void setItemCartStatus(Integer itemCartStatus) {
		this.itemCartStatus = itemCartStatus;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getItemCatId() {
		return itemCatId;
	}

	public void setItemCatId(Long itemCatId) {
		this.itemCatId = itemCatId;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
