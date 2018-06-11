package com.example.android.news_app_stage1;

import java.util.Date;

public class NewsItem {

    //new header
    private String mHeader;
    //news time and date

    private String mTitle;

    private Date mTimeAndDate;
    //author of publication
    private String mAuthor;
    //URL to that contains the news data
    private String mUrl;

    /**
     * constructs an new object
     *
     * @param title           is the title of the news article
     * @param sectionName     is the header of the news article
     * @param authorfullName  is the authors who erote the news article
     * @param publicationDate is the timedate the news article was published
     * @param url
     */
    public NewsItem(String title, String sectionName, String authorfullName, Date publicationDate, String url) {

        mHeader = title;
        mTitle = sectionName;
        mAuthor = authorfullName;
        mTimeAndDate = publicationDate;
        mUrl = url;
    }

    public String getHeader() {
        return mHeader;
    }

    public String getmTitle() {
        return mTitle;
    }

    public Date getmTimeAndDate() {
        return mTimeAndDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmUrl() {
        return mUrl;
    }
}
