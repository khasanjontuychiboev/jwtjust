package com.just.jwtjust.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum Permission {

    DOC_READ("doc:read"),
    DOC_UPDATE("doc:update"),
    DOC_CREATE("doc:create"),
    DOC_DELETE("doc:delete"),
    ;

    private final String permission;

}