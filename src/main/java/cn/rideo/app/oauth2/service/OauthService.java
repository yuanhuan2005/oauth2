package cn.rideo.app.oauth2.service;

import cn.rideo.app.oauth2.domain.oauth.OauthClientDetails;

/**
 * @author Shengzhao Li
 */

public interface OauthService {

    OauthClientDetails loadOauthClientDetails(String clientId);
}