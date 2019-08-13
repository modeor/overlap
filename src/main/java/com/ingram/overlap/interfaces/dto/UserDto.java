package com.ingram.overlap.interfaces.dto;

import com.ingram.overlap.domain.user.UserStatusEnum;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class UserDto {

    private String id;

    private String userName;

    private UserStatusEnum status;

    private OffsetDateTime registryTime;
}
