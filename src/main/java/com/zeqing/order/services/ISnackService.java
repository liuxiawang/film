package com.zeqing.order.services;

import com.zeqing.order.dto.SnackOrder;

import java.util.List;

public interface ISnackService {

    List<SnackOrder> querySnackOrder(Long openId);

    boolean insertSnackOrder(SnackOrder ticket);

    boolean deleteBySnackOrderId(Long id);
}
