package com.rideo.app.oauth2.service;

import com.rideo.app.oauth2.domain.OauthClientDetails;

public interface OauthService
{

    OauthClientDetails loadOauthClientDetails(String clientId);
}