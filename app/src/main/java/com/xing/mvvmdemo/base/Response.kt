package com.xing.mvvmdemo.base


data class Response<T>(val data: T, val errorCode: Int, val errMsg: String?)