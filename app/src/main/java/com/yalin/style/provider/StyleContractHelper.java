package com.yalin.style.provider;

import android.net.Uri;

/**
 * YaLin 2017/1/3.
 */

public class StyleContractHelper {

  private static final String QUERY_PARAMETER_CALLER_IS_SYNC_ADAPTER = "callerIsSyncAdapter";

  public static Uri setUriAsCalledFromSyncAdapter(Uri uri) {
    return uri.buildUpon().appendQueryParameter(QUERY_PARAMETER_CALLER_IS_SYNC_ADAPTER, "true")
        .build();
  }
}
