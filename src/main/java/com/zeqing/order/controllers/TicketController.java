package com.zeqing.order.controllers;

import com.zeqing.order.dto.TicketOrder;
import com.zeqing.order.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 根据用户查询电影票订单
// 新增一条电影票订单
// 删除一条电影票订单

@RestController
@RequestMapping(value = "/v1/ticket")
public class TicketController {

    @Autowired
    private ITicketService ticketService;

    @RequestMapping(value = "/queryByOpenId", method = RequestMethod.GET)
    public List<TicketOrder> queryTicketOrder(@RequestParam("openId") Long openId) {
        return ticketService.queryTicketOrder(openId);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean insertTicketOrder(@RequestBody TicketOrder ticket) {
        return ticketService.insertTicketOrder(ticket);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public boolean deleteByTicketOrderId(@RequestParam("id") Long id) {
        return ticketService.deleteByTicketOrderId(id);
    }

}
