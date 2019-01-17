package com.icehousecorp.android.test.functional.models;

import lombok.Builder;
import lombok.Data;

@Builder
public class RequestBody {
    String title;
    String body;
    Integer userId;
}
