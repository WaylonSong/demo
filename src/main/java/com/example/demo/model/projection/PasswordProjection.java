package com.example.demo.model.projection;

import com.example.demo.model.User;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by song on 2017/10/30.
 */
@Projection(name = "passwords", types = { User.class })
interface PasswordProjection {
    String getPassword();
}
