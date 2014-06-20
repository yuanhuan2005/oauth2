package com.rideo.app.oauth2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rideo.app.oauth2.domain.OauthClientDetails;
import com.rideo.app.oauth2.domain.OauthRepository;
import com.rideo.app.oauth2.service.OauthService;

/**
 * @author Shengzhao Li
 */
@Service("oauthService")
public class OauthServiceImpl implements OauthService
{

    @Autowired
    private OauthRepository oauthRepository;

    @Override
    public OauthClientDetails loadOauthClientDetails(String clientId)
    {
        return oauthRepository.findOauthClientDetails(clientId);
    }
}