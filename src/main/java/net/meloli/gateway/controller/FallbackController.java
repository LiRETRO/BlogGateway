package net.meloli.gateway.controller;

import net.meloli.gateway.entity.ErrorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName FallbackController
 * @Description TODO
 * @Author LiRETRO
 * @Date 2019/10/21 11:34 上午
 * @Version 1.0
 **/
@RestController
public class FallbackController {

    /**
     * 失败调用方法
     * @return
     */
    @RequestMapping(value = "/fallback")
    public ErrorInfo fallback() {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(HttpStatus.NOT_ACCEPTABLE.value());
        errorInfo.setMessage("请求失败，服务降级！");
        return errorInfo;
    }
}