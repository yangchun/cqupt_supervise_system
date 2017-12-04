package com.supervise.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/11/17 0017.
 */
public class JwtFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("拦截token开始");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String authHeader = request.getHeader("Authorization");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            chain.doFilter(req, res);
        }else{
            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                throw new ServletException("不合法的Authorization header");
            }
            // 取得token
            String token = authHeader.substring(7);
            System.out.println("token="+token);
            try {
                Claims claims = Jwts.parser().setSigningKey("base64EncodedSecretKey").parseClaimsJws(token).getBody();
                request.setAttribute("claims", claims);
            } catch (Exception e) {
                throw new ServletException("Invalid Token");
            }
            chain.doFilter(req, res);
        }
    }
}
