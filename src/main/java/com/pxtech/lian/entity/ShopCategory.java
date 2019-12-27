package com.pxtech.lian.entity;
import java.util.Date;
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //这玩意看着这么像指针内东西
    private ShopCategory parent;

    //GET方法构造

    public Long getShopCategoryId() {

        return shopCategoryId;
    }

    public String getShopCategoryName() {

        return shopCategoryName;
    }

    public String getShopCategoryDesc() {

        return shopCategoryDesc;
    }

    public String getShopCategoryImg() {

        return shopCategoryImg;
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

    public ShopCategory getParent() {

        return parent;
    }
    //SET方法构造

    public void setShopCategoryId(Long shopCategoryId) {

        this.shopCategoryId = shopCategoryId;
    }

    public void setShopCategoryName(String shopCategoryName) {

        this.shopCategoryName = shopCategoryName;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {

        this.shopCategoryDesc = shopCategoryDesc;
    }

    public void setShopCategoryImg(String shopCategoryImg) {

        this.shopCategoryImg = shopCategoryImg;
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

    public void setParent(ShopCategory parent) {

        this.parent = parent;
    }
}
