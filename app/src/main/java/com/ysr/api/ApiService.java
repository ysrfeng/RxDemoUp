package com.ysr.api;


import com.ysr.api.bean.User;
import com.ysr.api.http.HttpResult;
import com.ysr.common.basebean.BaseRespose;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by yangshirong on 2017/3/6 9:09.
 * 邮箱 ysr200808@163.com
 */

public interface ApiService {

    @GET("login")
    Observable<BaseRespose<User>> login(@Query("username") String username, @Query("password") String password);

    @GET("nc/video/list/{type}/n/{startPage}-10.html")
    Observable<Map<String, List<VideoData>>> getVideoList(
            @Header("Cache-Control") String cacheControl,
            @Path("type") String type,
            @Path("startPage") int startPage);

    @GET("top250")
    Observable<HttpResult<List<Subject>>> getTopMovie(@Query("start") int start, @Query("count") int count);
}