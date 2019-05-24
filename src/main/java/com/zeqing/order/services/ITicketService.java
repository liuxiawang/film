package com.zeqing.order.services;

import com.zeqing.order.dto.TicketOrder;

import java.util.List;

public interface ITicketService {

    List<TicketOrder> queryTicketOrder(Long openId);

    boolean insertTicketOrder(TicketOrder ticket);

    boolean deleteByTicketOrderId(Long id);
}
