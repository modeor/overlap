package com.ingram.overlap.domain.user;

import com.ingram.overlap.infrastructure.utils.CryptUtils;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

/**
 * @author yjm
 */
@Data
@Entity(name = "User")
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    private String salt;
    private UserStatusEnum status;
    private OffsetDateTime registryTime;

    public boolean checkPassword(String inputPassword) {
        String encryptedPassword = CryptUtils.encryptWithSalt(inputPassword, salt);
        return password.equals(encryptedPassword);
    }
}
