package com.vinayGahane.lovable_clone.dto.member;

import com.vinayGahane.lovable_clone.entity.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}