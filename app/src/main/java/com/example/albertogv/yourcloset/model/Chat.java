package com.example.albertogv.yourcloset.model;

import android.net.Uri;

import java.util.Date;

public class Chat {
    public String productPhotoUrl;
    public String productName;
    public String lastMessage;
    public String sellerPhotoUrl;
    public String sellerDispalyName;
    public String sellerUid;
    public String dateCreation;
    public String buyerUid;
    public String getPhotoBuyer() {
        return photoBuyer;
    }

    public void setPhotoBuyer(String photoBuyer) {
        this.photoBuyer = photoBuyer;
    }

    public String photoBuyer;
    public String buyerDisplayName;



}
