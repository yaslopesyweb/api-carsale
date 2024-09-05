package br.com.fiap.apicarsale.domain.user.dto;

import br.com.fiap.apicarsale.domain.user.User;

public record UserRequest(
        String name,
        String username,
        String password,
        String role
) {
    public User toModel() {
        return User.builder()
                .name(name)
                .username(username)
                .password(password)
                .role(role)
                .build();
    }
}
