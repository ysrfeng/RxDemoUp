package com.ysr.api.subscribers;

/**
 * Created by yangshirong on 2017/3/6 9:14.
 * 邮箱 ysr200808@163.com
 */

public interface SubscriberOnNextListener<T> {
    void onNext(T t);
}
