package com.zeqing.order.services.impl;

import com.zeqing.order.dto.TicketOrder;
import com.zeqing.order.mappers.TicketMapper;
import com.zeqing.order.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements ITicketService {

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public List<TicketOrder> queryTicketOrder(Long openId) {
        return ticketMapper.queryTicketOrder(openId);
    }

    @Override
    public boolean insertTicketOrder(TicketOrder ticket) {
        return ticketMapper.insertTicketOrder(ticket);
    }

    @Override
    public boolean deleteByTicketOrderId(Long id) {
        return ticketMapper.deleteByTicketOrderId(id);
    }
}
