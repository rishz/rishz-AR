#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_rishz_arandroid_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from Rohan";
    return env->NewStringUTF(hello.c_str());
}
