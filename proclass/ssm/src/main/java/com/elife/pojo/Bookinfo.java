package com.elife.pojo;

public class Bookinfo {
    private Integer id;

    private String bookName;

    private String bookImg;

    private String bookNowPrice;

    private String bookPrePrice;

    private String bookDiscount;

    private String bookAuthor;

    private String bookPublish;

    private String bookPublishDate;

    private String bookDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg == null ? null : bookImg.trim();
    }

    public String getBookNowPrice() {
        return bookNowPrice;
    }

    public void setBookNowPrice(String bookNowPrice) {
        this.bookNowPrice = bookNowPrice == null ? null : bookNowPrice.trim();
    }

    public String getBookPrePrice() {
        return bookPrePrice;
    }

    public void setBookPrePrice(String bookPrePrice) {
        this.bookPrePrice = bookPrePrice == null ? null : bookPrePrice.trim();
    }

    public String getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(String bookDiscount) {
        this.bookDiscount = bookDiscount == null ? null : bookDiscount.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish == null ? null : bookPublish.trim();
    }

    public String getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(String bookPublishDate) {
        this.bookPublishDate = bookPublishDate == null ? null : bookPublishDate.trim();
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail == null ? null : bookDetail.trim();
    }
}