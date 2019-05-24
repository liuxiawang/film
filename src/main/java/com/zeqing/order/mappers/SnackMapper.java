package com.zeqing.order.mappers;


import com.zeqing.order.dto.SnackOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SnackMapper {

    List<SnackOrder> querySnackOrder(@Param("openId") Long openId);

    boolean insertSnackOrder(@Param("snack") SnackOrder snack);

    boolean deleteBySnackOrderId(@Param("id") Long id);

}
