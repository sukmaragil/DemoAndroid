package com.icehousecorp.android.test.functional.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginEntity {
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("is_legacy")
    @Expose
    private Boolean isLegacy;
    @SerializedName("created_at")
    @Expose
    private Integer createdAt;
    @SerializedName("updated_at")
    @Expose
    private Integer updatedAt;
    @SerializedName("is_activated")
    @Expose
    private Boolean isActivated;
    @SerializedName("firebase_token")
    @Expose
    private String firebaseToken;
    @SerializedName("is_white_list_user")
    @Expose
    private Boolean isWhiteListUser;
    @SerializedName("privileges")
    @Expose
    private List<String> privileges = null;
    @SerializedName("subscribe_error")
    @Expose
    private Object subscribeError;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Boolean getIsLegacy() {
        return isLegacy;
    }

    public void setIsLegacy(Boolean isLegacy) {
        this.isLegacy = isLegacy;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public Boolean getIsWhiteListUser() {
        return isWhiteListUser;
    }

    public void setIsWhiteListUser(Boolean isWhiteListUser) {
        this.isWhiteListUser = isWhiteListUser;
    }

    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    public Object getSubscribeError() {
        return subscribeError;
    }

    public void setSubscribeError(Object subscribeError) {
        this.subscribeError = subscribeError;
    }
}
