package com.vinayGahane.lovable_clone.service;

import com.vinayGahane.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}