package com.future.config;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.future.utils.ContentResultForm;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright (C) 2020
 * <p>
 * 版权所有。
 * <p>
 * 类名　　  :AjaxAccessDeniedHandler
 * 功能概要  :无权访问的处理逻辑
 * 做成日期  :2020-11-26  huangsl
 */
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        ContentResultForm<Object> contentResultForm = new ContentResultForm<>(false, null, "USER_NO_ACCESS");
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(JSONUtil.toJsonStr(contentResultForm));
    }

}
