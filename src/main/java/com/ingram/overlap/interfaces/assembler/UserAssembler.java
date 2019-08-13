package com.ingram.overlap.interfaces.assembler;

import com.ingram.overlap.domain.user.User;
import com.ingram.overlap.interfaces.dto.UserDto;

public class UserAssembler {

    public static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setStatus(user.getStatus());
        userDto.setRegistryTime(user.getRegistryTime());
        return userDto;
    }
}
