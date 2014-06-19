package cc.wdcy.infrastructure.mybatis;

import cc.wdcy.domain.oauth.OauthClientDetails;
import cc.wdcy.domain.oauth.OauthRepository;
import cc.wdcy.infrastructure.AbstractRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;

/**
 * @author Shengzhao Li
 */
public class OauthRepositoryMyBatisTest extends AbstractRepositoryTest {


    @Autowired
    private OauthRepository oauthRepositoryMyBatis;


    @Test
    public void findOauthClientDetails() {
        OauthClientDetails oauthClientDetails = oauthRepositoryMyBatis.findOauthClientDetails("unity-client");
        assertNull(oauthClientDetails);

    }

}