package cn.rideo.app.oauth2.service.impl;

import cn.rideo.app.oauth2.domain.OauthClientDetails;
import cn.rideo.app.oauth2.domain.OauthRepository;
import cn.rideo.app.oauth2.service.OauthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Shengzhao Li
 */
@Service("oauthService")
public class OauthServiceImpl implements OauthService {

    @Autowired
    private OauthRepository oauthRepository;

    @Override
    public OauthClientDetails loadOauthClientDetails(String clientId) {
        return oauthRepository.findOauthClientDetails(clientId);
    }
}