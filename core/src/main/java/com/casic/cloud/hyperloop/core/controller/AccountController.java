package com.casic.cloud.hyperloop.core.controller;

import com.casic.cloud.hyperloop.common.model.result.ApiResult;
import com.casic.cloud.hyperloop.core.annotation.WithAccess;
import com.casic.cloud.hyperloop.core.constants.UrlMapping;
import com.casic.cloud.hyperloop.core.model.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Description:用户相关接口
 * @Author: LDC
 * @Date: 2020/02/20 13:17
 * @version: V1.0
 */
@Slf4j
@RestController
@Api(tags = {"AccountController"}, value = "用户相关接口")
public class AccountController {

    /***
     * @Description:用户登录
     * @Author: LDC
     * @Date: 2020/2/20 13:18
     */
    @ApiOperation(value = "用户登录-GET请求", httpMethod = "GET")
    @GetMapping(UrlMapping.LOGINS)
    public ApiResult login(@ApiIgnore @WithAccess User user) {

        //测试WithAccess
        log.info("【测试WithAccess】,userName={}", user.getUserName());

        //TODO 自定义参数解析器 自定义日志注解
        //拉取菜单信息
        //记录最后登录时间
        //log.info("【用户登录】成功，userId", userId);
        return ApiResult.addSuccess();
    }


}
