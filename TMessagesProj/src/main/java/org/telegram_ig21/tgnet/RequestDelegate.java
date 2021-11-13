package org.telegram_ig21.tgnet;

public interface RequestDelegate {
    void run(TLObject response, TLRPC.TL_error error);
}
