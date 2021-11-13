package org.telegram_ig21.tgnet;

public interface RequestDelegateTimestamp {
    void run(TLObject response, TLRPC.TL_error error, long responseTime);
}
