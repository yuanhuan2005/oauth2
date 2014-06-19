package cc.wdcy.domain.oauth;

/**
 * @author Shengzhao Li
 */
public interface OauthRepository {

    OauthClientDetails findOauthClientDetails(String clientId);
}