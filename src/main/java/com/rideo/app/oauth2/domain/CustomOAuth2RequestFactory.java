package com.rideo.app.oauth2.domain;

import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;

/**
 * 
 * 
 * @author yuanhuan 2014年6月19日 下午4:26:13
 */
public class CustomOAuth2RequestFactory extends DefaultOAuth2RequestFactory
{

    public CustomOAuth2RequestFactory(ClientDetailsService clientDetailsService)
    {
        super(clientDetailsService);
    }

}
