package cc.wdcy.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * 
 * 
 * @author yuanhuan 2014年6月19日 下午5:48:39
 */
public class Test
{

    @SuppressWarnings({ "deprecation", "resource" })
    public static void sendGetRequest(String getUrl)
    {
        int httpCode = 0;
        String responseMessage = "";

        try
        {
            HttpGet httpGet = new HttpGet(getUrl);
            httpGet.addHeader("Content-Type", "text/html;charset=UTF-8");
            HttpResponse response = new DefaultHttpClient().execute(httpGet);

            HttpEntity entity = response.getEntity();
            httpCode = response.getStatusLine().getStatusCode();
            if (entity != null)
            {
                InputStream instream = entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(instream, "utf-8"));
                responseMessage = reader.readLine();
            }
        }
        catch (MalformedURLException e)
        {
            responseMessage = e.toString();
        }
        catch (IOException e)
        {
            responseMessage = e.toString();
        }

        System.out.println("******************  TEST httpCode=" + httpCode);
        System.out.println("******************  TEST responseMessage=" + responseMessage);
    }

    public static void main(String[] args)
    {
        Test.sendGetRequest("http://localhost:8080/oauth2/oauth/token?client_id=unity-client&client_secret=unity&grant_type=password&scope=read+write&username=admin&password=admin");
    }

}
