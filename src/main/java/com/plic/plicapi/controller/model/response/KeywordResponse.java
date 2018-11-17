package com.plic.plicapi.controller.model.response;

import com.plic.plicapi.domain.Keyword;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class KeywordResponse {
    private Long id;
    private String userId;
    private String word;
    private String nowDate;

    public static KeywordResponse of(Keyword keyword) {
        return KeywordResponse.builder()
                .id(keyword.getId())
                .userId(keyword.getUserId())
                .word(keyword.getWord())
                .nowDate(keyword.getNowDate())
                .build();
    }

}
