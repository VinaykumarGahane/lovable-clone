package com.vinayGahane.lovable_clone.service.impl;

import com.vinayGahane.lovable_clone.dto.subscription.CheckoutRequest;
import com.vinayGahane.lovable_clone.dto.subscription.CheckoutResponse;
import com.vinayGahane.lovable_clone.dto.subscription.PortalResponse;
import com.vinayGahane.lovable_clone.dto.subscription.SubscriptionResponse;
import com.vinayGahane.lovable_clone.service.SubscriptionService;

public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
