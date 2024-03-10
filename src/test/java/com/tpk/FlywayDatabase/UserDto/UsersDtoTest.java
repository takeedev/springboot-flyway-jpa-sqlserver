package com.tpk.FlywayDatabase.UserDto;

import lombok.Builder;

@Builder
public record UsersDtoTest(
        int userID,

        String username,

        String password,

        String email
) { }
