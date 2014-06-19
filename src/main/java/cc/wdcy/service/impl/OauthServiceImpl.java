package cc.wdcy.service.impl;

import cc.wdcy.domain.oauth.OauthClientDetails;
import cc.wdcy.domain.oauth.OauthRepository;
import cc.wdcy.service.OauthService;
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