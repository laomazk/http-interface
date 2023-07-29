package com.magic.httpinterface.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChuckNorrisVO {
    private String value;
    private String url;
    private String id;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("create_at")
    private String createAt;
    @JsonProperty("update_at")
    private String updateAt;
}
