package org.telegram_ig21.tgnet;

public interface RequestDelegateInternal {
    void run(long response, int errorCode, String errorText, int networkType, long timestamp);
}
