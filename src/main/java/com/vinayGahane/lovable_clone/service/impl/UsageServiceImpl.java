package com.vinayGahane.lovable_clone.service.impl;

import com.vinayGahane.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.vinayGahane.lovable_clone.dto.subscription.UsageTodayResponse;
import com.vinayGahane.lovable_clone.service.UsageService;

public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
