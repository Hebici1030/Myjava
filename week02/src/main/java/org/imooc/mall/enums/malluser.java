package org.imooc.mall.enums;

public enum malluser {
    AMDIN(0),
    CUSTOM(1),
    ;

    malluser(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    Integer code;
}
