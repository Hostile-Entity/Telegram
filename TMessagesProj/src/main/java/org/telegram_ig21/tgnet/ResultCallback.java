package org.telegram_ig21.tgnet;

public interface ResultCallback<T> {

    void onComplete(T result);

    default void onError(TLRPC.TL_error error) {}

    default void onError(Throwable throwable) {}
}
