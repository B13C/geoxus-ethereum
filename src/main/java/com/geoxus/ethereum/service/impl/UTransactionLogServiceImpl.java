package com.geoxus.ethereum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.geoxus.ethereum.entity.UTransactionLogEntity;
import com.geoxus.ethereum.mapper.UTransactionLogMapper;
import com.geoxus.ethereum.service.UTransactionLogService;
import org.springframework.stereotype.Service;

@Service
public class UTransactionLogServiceImpl extends ServiceImpl<UTransactionLogMapper, UTransactionLogEntity> implements UTransactionLogService {
}
