package cc.wdcy.service;

import cc.wdcy.domain.oauth.OauthClientDetails;

/**
 * @author Shengzhao Li
 */

public interface OauthService {

    OauthClientDetails loadOauthClientDetails(String clientId);
}