package cc.wdcy.domain.oauth;

import cc.wdcy.domain.shared.Repository;

/**
 * @author Shengzhao Li
 */
public interface OauthRepository extends Repository {

    OauthClientDetails findOauthClientDetails(String clientId);
}