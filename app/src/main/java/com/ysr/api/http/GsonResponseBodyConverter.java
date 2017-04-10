package com.ysr.api.http;

import android.util.Log;

import com.google.gson.Gson;
import com.ysr.api.ApiException;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by yangshirong on 2017/3/6 9:06.
 * 邮箱 ysr200808@163.com
 */

public class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string();
        Log.e("Network", "response>>" + response);
        //httpResult 只解析result字段
        HttpResult httpResult = gson.fromJson(response, HttpResult.class);
        //
        if (httpResult.getCount() == 0) {
            throw new ApiException(100);
        }
        return gson.fromJson(response, type);


    }
}