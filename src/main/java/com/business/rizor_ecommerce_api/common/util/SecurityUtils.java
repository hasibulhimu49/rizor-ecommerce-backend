package com.business.rizor_ecommerce_api.common.util;

import com.business.rizor_ecommerce_api.common.exception.UnauthorizedException;
import com.business.rizor_ecommerce_api.security.UserPrincipal;
import com.business.rizor_ecommerce_api.user.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {

    private SecurityUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof UserPrincipal) {
            return ((UserPrincipal) authentication.getPrincipal()).getUser();
        }
        throw new UnauthorizedException("User not authenticated");
    }
}
