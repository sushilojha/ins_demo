package com.tcs.dews.lobintegration;

import com.tcs.dews.lobintegration.to.BundleItemData;
import com.tcs.dews.lobintegration.to.ProductDetailsRequestTO;

public interface LobIntegration {

	BundleItemData retrieveProductDetails(ProductDetailsRequestTO productDetailsRequestTO) ;
}
