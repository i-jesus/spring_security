package com.lzj.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证成功后逻辑处理
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getAuthorities());
        WebAuthenticationDetails authenticationDetails= (WebAuthenticationDetails) authentication.getDetails();
        System.out.println(authenticationDetails.getRemoteAddress() + authenticationDetails.getSessionId());
        //System.out.println(authentication.getPrincipal());
        UserDetails userDetails= (UserDetails) authentication.getPrincipal();
        System.out.println(userDetails.getUsername() + userDetails.getPassword() + userDetails.isEnabled());
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/success");
    }
}
