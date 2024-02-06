package com.just.jwtjust.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.just.jwtjust.user.Permission.*;

@Getter
@RequiredArgsConstructor
public enum Role {


    USER(Collections.emptySet()),
    ADMIN(
            Set.of(
                    DOC_READ,
                    DOC_CREATE,
                    DOC_UPDATE,
                    DOC_DELETE
            )
    ),
    MANAGER(
            Set.of(
                    DOC_READ
            )
    );

    private final Set<Permission> permissions;
    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}
