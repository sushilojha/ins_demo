package com.tcs.dews.lobintegration.server;

import com.tcs.dews.lobintegration.to.BundleItemData;
import com.tcs.dews.lobintegration.to.ProductDetailsRequestTO;

public interface LobIntegrationServer {

	BundleItemData retrieveProductDetails(ProductDetailsRequestTO productDetailsRequestTO);
}
