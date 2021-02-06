package com.nykj.dataconversion.conf.Swagger;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger使用的配置文件
 * @URL http://localhost:8999/swagger-ui.html#
 * @author payne
 */
@Slf4j
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI  //第三方swagger增强API注解
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        log.info("Swagger初始化");
        Docket docket =  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
//        docket.alternateTypeRules(AlternateTypeRules.newMapRule(String.class, List.class));
//        docket.alternateTypeRules(AlternateTypeRules.newMapRule(List.class, Model.class));
        return docket;
    }

    /**
     * 基本信息的配置，信息会在api文档上显示
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("互联网医院接口文档-Swagger")
                .description("互联网医院接口文档")
                .version("1.0")
                .build();
    }
}