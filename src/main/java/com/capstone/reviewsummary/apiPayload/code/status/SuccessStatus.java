package com.capstone.reviewsummary.apiPayload.code.status;

import com.capstone.reviewsummary.apiPayload.code.BaseCode;
import com.capstone.reviewsummary.apiPayload.code.ReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {

    // 일반적인 응답
    _OK(HttpStatus.OK, "COMMON2000", "성공입니다."),

    // 크롤링 성공 관련 응답
    SUCCESS_CRAWLING(HttpStatus.OK, "COMMON2001", "리뷰 가져오기 성공"),
    SUCCESS_SUMMARY(HttpStatus.OK, "COMMON2002", "리뷰 요약 성공"),
    FAIL_CRAWLING(HttpStatus.BAD_REQUEST, "MEMBER4001", "크롤링 실패했어용용 힝구리.");

    // ~~~ 관련 응답

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build()
                ;
    }
}