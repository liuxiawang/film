package com.zeqing.order.services.impl;

import com.zeqing.order.dto.SnackOrder;
import com.zeqing.order.mappers.SnackMapper;
import com.zeqing.order.services.ISnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnackServiceImpl implements ISnackService {

    @Autowired
    private SnackMapper snackMapper;

    @Override
    public List<SnackOrder> querySnackOrder(Long openId) {
        return snackMapper.querySnackOrder(openId);
    }

    @Override
    public boolean insertSnackOrder(SnackOrder snack) {
        snackMapper.insertSnackOrder(snack);
        return true;
    }

    @Override
    public boolean deleteBySnackOrderId(Long id) {
        snackMapper.deleteBySnackOrderId(id);
        return true;
    }
}
