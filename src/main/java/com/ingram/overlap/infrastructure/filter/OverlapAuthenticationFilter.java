package com.ingram.overlap.infrastructure.filter;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Description: 请求过滤器
 * date: 2019-08-01 16:38
 *
 * @author: hx
 * @version: 1.0
 **/
public class OverlapAuthenticationFilter extends FormAuthenticationFilter {
    private Logger log = LoggerFactory.getLogger(OverlapAuthenticationFilter.class);

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        //log.debug("登录校验："+request.getLocalAddr());
        boolean isLogin = false;
        System.out.println("登录校验："+request.getLocalAddr());
        return true;
    }
}
