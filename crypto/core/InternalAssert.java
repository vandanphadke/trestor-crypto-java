package com.trestor.android.protocol.crypto.core;


public class InternalAssert {
    public static void Assert(Boolean condition, String string) throws Exception {
        if (!condition)
            throw new Exception("An assertion in Punisher.NaCl failed " + string);
    }
}
