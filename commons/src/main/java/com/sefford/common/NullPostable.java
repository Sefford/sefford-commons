package com.sefford.common;

import com.sefford.common.interfaces.Postable;

/**
 * NullPostable is a dummy implementation of a Postable using Null-Object. It does nothing at all
 * when a element is received.
 *
 * @author Saul Diaz <sefford@gmail.com>
 */
public class NullPostable implements Postable {

    /**
     * Single instance of NullPostable, it is not necessary to use more memory than required.
     */
    public static final NullPostable INSTANCE = new NullPostable();

    private NullPostable() {
    }

    @Override
    public void post(Object event) {

    }
}