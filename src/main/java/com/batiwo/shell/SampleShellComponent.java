package com.batiwo.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class SampleShellComponent {

    @ShellMethod("Display the string")
    public void echo(String value, @ShellOption(value = {"-v", "--verbose"}, defaultValue = "false") boolean verbose) {
        if (verbose) {
            System.out.println(String.format("Received command echo with param %s", value));
        }
        System.out.println(value);
    }
}
