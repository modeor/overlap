package com.ingram.overlap.interfaces.api;

import com.ingram.overlap.application.service.UserService;
import com.ingram.overlap.domain.user.User;
import com.ingram.overlap.interfaces.assembler.UserAssembler;
import com.ingram.overlap.interfaces.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:用户
 * date: 2019-07-16 11:26
 *
 * @author: hx
 * @version: 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{name}")
    public ResponseEntity<UserDto> findUserByName(@PathVariable("name") String userName) {
        User user = userService.findUserByName(userName);
        UserDto userDto = UserAssembler.toUserDto(user);
        return ResponseEntity.ok(userDto);
    }
}
