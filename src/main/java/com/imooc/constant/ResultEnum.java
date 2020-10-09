package com.imooc.constant;

import lombok.Getter;

/**
 * @author zhulongkun20@163.com
 * @since 2020/10/7 12:17 上午
 */
@Getter
public enum ResultEnum {

    // command + shift + u 大写快捷键
    PRODUCT_NOT_EXIST(10, "商品不存在"),

    PRODUCT_NOT_ENOUGH(20, "商品库存不足"),

    ORDER_MASTER_NOT_EXIST(30, "订单不存在"),

    ORDER_DETAIL_NOT_EXIST(40, "订单详情不存在"),

    ORDER_STATUS_ERROR(50, "订单状态异常"),

    ORDER_UPDATE_FAIL(60, "订单状态更新异常");


    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
