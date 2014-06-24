package com.rideo.app.oauth2.domain;

import java.io.Serializable;
import java.util.Date;

public class OauthClientDetails implements Serializable
{

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private Date createTime = new Date();
    private boolean archived = false;

    private String clientId;
    private String resourceIds;

    private String clientSecret;
    /**
     * Available values: read,write
     */
    private String scope;

    /**
     * grant types include "authorization_code", "password", "assertion", and
     * "refresh_token". Default value is "authorization_code,refresh_token".
     */
    private String authorizedGrantTypes = "authorization_code,refresh_token";

    /**
     * The re-direct URI(s) established during registration (optional, comma
     * separated).
     */
    private String webServerRedirectUri;

    /**
     * Authorities that are granted to the client (comma-separated). Distinct
     * from the authorities granted to the user on behalf of whom the client is
     * acting.
     * <p/>
     * For example: ROLE_USER
     */
    private String authorities;

    /**
     * The access token validity period in seconds (optional). If unspecified a
     * global default will be applied by the token services.
     */
    private Integer accessTokenValidity;

    /**
     * The refresh token validity period in seconds (optional). If unspecified a
     * global default will be applied by the token services.
     */
    private Integer refreshTokenValidity;

    // optional
    private String additionalInformation;

    /**
     * The client is trusted or not. If it is trust, will skip approve step
     * default false.
     */
    private boolean trusted = false;

    public OauthClientDetails()
    {
    }

    public boolean trusted()
    {
        return trusted;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public boolean isArchived()
    {
        return archived;
    }

    public void setArchived(boolean archived)
    {
        this.archived = archived;
    }

    public String getClientId()
    {
        return clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getResourceIds()
    {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds)
    {
        this.resourceIds = resourceIds;
    }

    public String getClientSecret()
    {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret)
    {
        this.clientSecret = clientSecret;
    }

    public String getScope()
    {
        return scope;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
    }

    public String getAuthorizedGrantTypes()
    {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes)
    {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public String getWebServerRedirectUri()
    {
        return webServerRedirectUri;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri)
    {
        this.webServerRedirectUri = webServerRedirectUri;
    }

    public String getAuthorities()
    {
        return authorities;
    }

    public void setAuthorities(String authorities)
    {
        this.authorities = authorities;
    }

    public Integer getAccessTokenValidity()
    {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity)
    {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity()
    {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity)
    {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation()
    {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation)
    {
        this.additionalInformation = additionalInformation;
    }

    public boolean isTrusted()
    {
        return trusted;
    }

    public void setTrusted(boolean trusted)
    {
        this.trusted = trusted;
    }

}