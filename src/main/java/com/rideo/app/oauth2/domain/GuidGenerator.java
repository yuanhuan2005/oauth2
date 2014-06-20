package com.rideo.app.oauth2.domain;

import java.util.UUID;

/**
 * @author Shengzhao Li
 */
public abstract class GuidGenerator
{

    public static String generate()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}