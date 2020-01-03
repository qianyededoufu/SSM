package com.pxtech.lian.entity;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import java.util.Date;
import java.util.List;

public class Product {
    private Long productId;
    private String productName;
    //商品描述
    private String productDesc;
    //简略图
    private String imgAddr;
    //正常价格
    private String normalPrice;
    //折扣价
    private String promotionPrice;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //状态标志位 -1不可用 0下架 1在前端展示
    private Integer enableStatus;
    //商品详情图像列表
    private List<ProductImg> productImgList;
    //商品分类
    private ProductCategory productCategory;
    //商品是由哪个店铺发布的
    private Shop shop;

    //GET

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public Integer getPriority() {
        return priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public Shop getShop() {
        return shop;
    }

    //SET


    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
