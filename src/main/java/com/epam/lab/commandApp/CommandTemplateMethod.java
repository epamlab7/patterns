package com.epam.lab.commandApp;

import java.io.IOException;

public class CommandTemplateMethod extends CommandAbstract implements Command {

    public CommandTemplateMethod(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() throws IOException {
        executor.templateMethodExample();
    }
}
