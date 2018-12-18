package net.meloli.gateway.global.handler;

import net.meloli.gateway.config.SpringHolder;
import net.meloli.gateway.entity.ErrorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler
    public ErrorInfo exceptionHandler(Exception e) {
        ErrorInfo<Exception> errorInfo = new ErrorInfo<>();
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setData(e);
        errorInfo.setMessage(e.getMessage());
        errorInfo.setUrl("");
        return errorInfo;
    }
}
