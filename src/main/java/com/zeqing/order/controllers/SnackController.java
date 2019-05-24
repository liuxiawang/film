package com.zeqing.order.controllers;

import com.zeqing.order.dto.SnackOrder;
import com.zeqing.order.services.ISnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 根据用户查询小吃订单
// 新增一条小吃订单
// 删除一条小吃订单

@RestController
@RequestMapping(value = "/v1/snack")
public class SnackController {

    @Autowired
    private ISnackService snackService;

    @RequestMapping(value = "/queryByOpenId", method = RequestMethod.GET)
    public List<SnackOrder> queryTicketOrder(@RequestParam("openId") Long openId) {
        return snackService.querySnackOrder(openId);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean insertTicketOrder(@RequestBody SnackOrder snack) {
        return snackService.insertSnackOrder(snack);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public boolean deleteByTicketOrderId(@RequestParam("id") Long id) {
        return snackService.deleteBySnackOrderId(id);
    }
}
