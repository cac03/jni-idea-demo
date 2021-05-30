#include "ru_hse_jnidemo_Native.h"

#ifdef __cplusplus
extern "C" {
#endif

void Java_ru_hse_jnidemo_Native_sayHelloWorld
  (JNIEnv * env, jclass clazz) {
  printf("Hello from native method\n");
}

#ifdef __cplusplus
}
#endif
