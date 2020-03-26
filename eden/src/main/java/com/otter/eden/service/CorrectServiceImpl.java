package com.otter.eden.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service

public class CorrectServiceImpl implements CorrectServic{

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,
            rollbackFor=Exception.class)
    public String checkTickets() {
        return "success";
    }
}
