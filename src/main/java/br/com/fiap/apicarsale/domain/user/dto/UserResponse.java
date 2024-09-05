package br.com.fiap.apicarsale.domain.user.dto;

import br.com.fiap.apicarsale.domain.user.User;

public record UserResponse (
        Long id,
        String name,
        String username,
        String role

) {
    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getUsername(),
                user.getRole()
        );
    }
}