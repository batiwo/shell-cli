package com.batiwo.shell;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ShellCliApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ShellCliApplication.class);
        if (args.length > 0) {
            builder.bannerMode(Banner.Mode.OFF);
        }
        builder.run(args);
    }
}
