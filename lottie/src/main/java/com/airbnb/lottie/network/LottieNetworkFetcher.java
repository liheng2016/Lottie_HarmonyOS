package com.airbnb.lottie.network;

import java.io.IOException;


/**
 * Implement this interface to handle network fetching manually when animations are requested via url. By default, Lottie will use an
 * {@link java.net.HttpURLConnection} under the hood but this enables you to hook into your own network stack. By default, Lottie will also handle caching the
 * animations but if you want to provide your own cache directory, you may implement {@link LottieNetworkCacheProvider}.
 *
 * @see
 */
public interface LottieNetworkFetcher {

    LottieFetchResult fetchSync(String url) throws IOException;
}
