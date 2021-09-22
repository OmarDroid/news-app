#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_android_kotlin_newsappmvvm_util_Keys_apiKey(JNIEnv *env, jobject object) {
    std::string api_key = "API_KEY";
    return env->NewStringUTF(api_key.c_str());
}
