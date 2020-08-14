package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import com.xkcoding.properties.property.MyProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @package: com.xkcoding.properties.controller
 * @description: 测试Controller
 * @author: yangkai.shen
 * @date: Created in 2018/9/29 10:49 AM
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@RestController
public class PropertyController {
	private final ApplicationProperty applicationProperty;
	private final DeveloperProperty developerProperty;
    private final MyProperty myProperty;

	@Autowired
	public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty, MyProperty myProperty, MyProperty myProperty1) {
		this.applicationProperty = applicationProperty;
		this.developerProperty = developerProperty;
        this.myProperty = myProperty1;
	}


	@GetMapping("/property")
	public Dict index() {
        System.out.println("applicationProperty:  " + applicationProperty);
        System.out.println("developerProperty:  " + developerProperty);
        System.out.println("myProperty:  " + myProperty);
		return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);

	}
}
