package com.rideo.app.oauth2.domain;

public interface OauthRepository
{

    OauthClientDetails findOauthClientDetails(String clientId);
}