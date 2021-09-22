package com.android.kotlin.newsappmvvm.util

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun apiKey(): String
}