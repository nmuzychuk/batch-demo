package com.nmuzychuk.batchdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.util.StringUtils;

public class UserItemProcessor implements ItemProcessor<User, User> {
    private static final Logger log = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(User item) throws Exception {
        User user = new User(StringUtils.capitalize(item.getFirstName()), StringUtils.capitalize(item.getLastName()));

        log.info("Processing " + item + " into " + user);

        return user;
    }
}
