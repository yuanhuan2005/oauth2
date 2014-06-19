package cn.rideo.app.oauth2.domain;

/**
 * @author Shengzhao Li
 */
public interface OauthRepository {

    OauthClientDetails findOauthClientDetails(String clientId);
}