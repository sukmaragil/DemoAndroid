package com.icehousecorp.android.test.functional.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataObject<P> {

    @SerializedName("data")
    @Expose
    private P data;

    public P getData() {
        return data;
    }

    public void setData(P data) {
        this.data = data;
    }

}