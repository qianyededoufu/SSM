package com.pxtech.lian.entity;
import java.util.Date;

public class ProductImg {
    private Long productImgId;
    private String imgAdddr;
    private String imgDESC;
    private Integer priroity;
    private Date createTime;
    private Long productId;
    
    //GET

    public Long getProductImgId() {
        return productImgId;
    }

    public String getImgAdddr() {
        return imgAdddr;
    }

    public String getImgDESC() {
        return imgDESC;
    }

    public Integer getPriroity() {
        return priroity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getProductId() {
        return productId;
    }


    //SET

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public void setImgAdddr(String imgAdddr) {
        this.imgAdddr = imgAdddr;
    }

    public void setImgDESC(String imgDESC) {
        this.imgDESC = imgDESC;
    }

    public void setPriroity(Integer priroity) {
        this.priroity = priroity;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
