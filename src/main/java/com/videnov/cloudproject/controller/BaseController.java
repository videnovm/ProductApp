package com.videnov.cloudproject.controller;

import com.videnov.cloudproject.property.ApiUrlProperties;
import com.videnov.cloudproject.util.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaseController {
    @Autowired
    private ApiUrlProperties apiUrlProperties;

    protected String getApiUrl() {
        String apiUrl = apiUrlProperties.getApiUrl();
        if (apiUrl == null || apiUrl.isEmpty()) {
            apiUrl = UrlUtil.getBaseEnvLinkURL();
        }
        return apiUrl;
    }
}
