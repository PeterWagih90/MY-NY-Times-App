#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_peter_android_nytimes_utility_Constant_baseUrl(JNIEnv *env, jclass type) {
    return env->NewStringUTF("http://api.nytimes.com/svc/");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_peter_android_nytimes_utility_Constant_getApiKey(JNIEnv *env, jclass type) {
    return env->NewStringUTF("AlpOwSYKJjFx3nCMHKaKmo8svWW6bTYc");
}
