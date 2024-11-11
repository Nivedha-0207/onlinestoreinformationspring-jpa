package com.onlineStoreInformation.db_demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OnlineStoreInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeName;
    private String storeDetails;
    private String phoneNumber;

    public OnlineStoreInformation() {
    }

    public OnlineStoreInformation(String storeName, String storeDetails, String phoneNumber) {
        this.storeName = storeName;
        this.storeDetails = storeDetails;
        this.phoneNumber = phoneNumber;
    }

    @Override
   public String toString() {
        return "OnlineStoreInformation{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
             ", storeDetails='" + storeDetails + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(String storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
