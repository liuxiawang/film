package com.zeqing.order.mappers;


import com.zeqing.order.dto.TicketOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketMapper {

    List<TicketOrder> queryTicketOrder(@Param("openId") Long openId);

    boolean insertTicketOrder(@Param("ticket") TicketOrder ticket);

    boolean deleteByTicketOrderId(@Param("id") Long id);

}
