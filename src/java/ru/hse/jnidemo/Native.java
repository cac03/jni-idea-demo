package ru.hse.jnidemo;

public class Native {

    // TODO: 5/30/21 Поменять на свой путь
    public static final String LIBRARY_FILENAME = "/home/caco3/IdeaProjects/jni-idea-demo/src/c/cmake-build-debug/libjnitests.so";

    static {
        System.load(LIBRARY_FILENAME);
    }

    public static native void sayHelloWorld();
}
