package com.vinayGahane.lovable_clone.dto.member;

import com.vinayGahane.lovable_clone.entity.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}