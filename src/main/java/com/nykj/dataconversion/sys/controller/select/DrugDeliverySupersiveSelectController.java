package com.nykj.dataconversion.sys.controller.select;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nykj.dataconversion.sys.entity.DrugDeliverySupersive;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 处方流转监管信息 前端控制器
 * </p>
 *
 * @author zhangchao
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/api/select/drug-delivery-supersive")
public class DrugDeliverySupersiveSelectController {

	@PostMapping(value = "/select")
	public DrugDeliverySupersive select(){
		DrugDeliverySupersive drugDeliverySupersive = new DrugDeliverySupersive();
		drugDeliverySupersive = (DrugDeliverySupersive) drugDeliverySupersive.selectOne(new QueryWrapper<DrugDeliverySupersive>().eq("id", 2));
		return drugDeliverySupersive;
	}
	
}
