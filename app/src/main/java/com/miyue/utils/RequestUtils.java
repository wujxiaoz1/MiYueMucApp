package com.miyue.utils;


import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangzhendong on 17/5/18.
 */

public class RequestUtils {
    public static final String ACTION_SET_CONTENT = "set_content";
    public static final String ACTION_SET_NEXT_CONTENT = "set_next_content";
    public static final String ACTION_PAUSE = "com.android.onemedia.pause";
    public static final String ACTION_PLAY = "com.android.onemedia.play";
    public static final String ACTION_REW = "com.android.onemedia.rew";
    public static final String ACTION_FFWD = "com.android.onemedia.ffwd";
    public static final String ACTION_PREV = "com.android.onemedia.prev";
    public static final String ACTION_NEXT = "com.android.onemedia.next";

    public static final String EXTRA_KEY_SOURCE = "source";
    public static final String EXTRA_KEY_METADATA = "metadata";
    public static final String EXTRA_KEY_HEADERS = "headers";

    private RequestUtils() {
    }

    public static class ContentBuilder {
        private Bundle mBundle;

        public ContentBuilder() {
            mBundle = new Bundle();
        }

        public ContentBuilder setSource(String source) {
            mBundle.putString(EXTRA_KEY_SOURCE, source);
            return this;
        }

        /**
         * @see MediaItemMetadata
         * @param metadata The metadata for this item
         */
        public ContentBuilder setMetadata(Bundle metadata) {
            mBundle.putBundle(EXTRA_KEY_METADATA, metadata);
            return this;
        }

        public ContentBuilder setHeaders(HashMap<String, String> headers) {
            mBundle.putSerializable(EXTRA_KEY_HEADERS, headers);
            return this;
        }

        public Bundle build() {
            return mBundle;
        }
    }
}
