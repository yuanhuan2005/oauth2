package cn.rideo.app.oauth2.service;

import cn.rideo.app.oauth2.domain.OauthClientDetails;

/**
 * @author Shengzhao Li
 */

public interface OauthService {

    OauthClientDetails loadOauthClientDetails(String clientId);
}