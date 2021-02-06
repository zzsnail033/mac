package com.nykj.dataconversion.sys.service.impl;

import com.nykj.dataconversion.sys.entity.Prescription;
import com.nykj.dataconversion.sys.mapper.PrescriptionMapper;
import com.nykj.dataconversion.sys.service.IPrescriptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电子处方 服务实现类
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@Service
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionMapper, Prescription> implements IPrescriptionService {

}
