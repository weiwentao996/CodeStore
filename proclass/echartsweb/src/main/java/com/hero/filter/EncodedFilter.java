package com.hero.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "EncodedFilter",value = "*.do",initParams = {@WebInitParam(name="charset",value = "utf-8")})
public class EncodedFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        req.setCharacterEncoding(charset);
        resp.setCharacterEncoding(charset);
        resp.setContentType("text/html;charset=" + charset);
        chain.doFilter(req, resp);
    }
    String charset = "GBK";
    public void init(FilterConfig config) throws ServletException {
        String parameter = config.getInitParameter("charset");
        if (null != parameter){
            charset = parameter;
        }
    }

}
