package com.service.impl;

import com.mapper.AccountMapper;
import com.service.AccountServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class AccountServcieImpl implements AccountServcie {
    @Autowired
    private AccountMapper am;
    @Autowired
    private PlatformTransactionManager  tm ;


    @Override
    public boolean transfor(String fromName, String toName, Double money) {
        TransactionStatus status = tm.getTransaction(new DefaultTransactionDefinition());
        try {
            am.update(toName, money);
            am.update(fromName, money * -1);
            tm.commit(status);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            tm.rollback(status);
            return false;
        }
    }

    @Override
    @Transactional
    public boolean transfor2(String fromName, String toName, Double money) {
        am.update(toName, money);
        am.update(fromName, money * -1);
        return true;
    }
}
