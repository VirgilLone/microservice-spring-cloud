package com.lw.cloud;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: luo.wen
 * @createTime: 2019/5/20
 */
public class PreZuulFilter extends ZuulFilter {

    Logger LOGGER= LoggerFactory.getLogger(PreZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 3;//执行顺序，越大越靠后
    }

    @Override
    public boolean shouldFilter() {
        // true表示经过Zuul的filter
        return false;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String remoteHost = request.getRemoteHost();
        LOGGER.info("请求的Host：{}",remoteHost);
        return null;
    }
}
