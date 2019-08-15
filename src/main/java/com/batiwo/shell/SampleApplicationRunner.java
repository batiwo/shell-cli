package com.batiwo.shell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.shell.Shell;
import org.springframework.stereotype.Component;

@Order(0)
@Component
public class SampleApplicationRunner implements ApplicationRunner {

    private final Shell shell;

    @Autowired
    public SampleApplicationRunner(Shell shell) {
        this.shell = shell;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (args.getSourceArgs().length > 0) {
            String commandLine = String.join(" ", args.getSourceArgs());
            Object result = shell.evaluate(() -> commandLine);
            if (result instanceof Throwable) {
                System.out.println(((Exception) result).getMessage());
                System.exit(result.hashCode());
            }

            if (result != null) {
                System.out.println(result.toString());
            }
            System.exit(0);
        }
    }
}
