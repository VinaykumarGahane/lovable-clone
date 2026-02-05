package com.vinayGahane.lovable_clone.service;

import com.vinayGahane.lovable_clone.dto.subscription.CheckoutRequest;
import com.vinayGahane.lovable_clone.dto.subscription.CheckoutResponse;
import com.vinayGahane.lovable_clone.dto.subscription.PortalResponse;
import com.vinayGahane.lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
