package com.ysr.api;

/**
 * Created by yangshirong on 2017/3/6 9:30.
 * 邮箱 ysr200808@163.com
 */

public class ApiConstants {

    public static final String BASE_URL = "http://c.m.163.com/";

    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.TYPE_LOGIN:
                host = BASE_URL;
                break;
            case HostType.TYPE_UPDATE:
                host = BASE_URL;
                break;
            case HostType.TYPE_COMMIT:
                host = BASE_URL;
                break;
            default:
                host = "";
                break;
        }
        return host;
    }

}
