package chapter6.remote;

import chapter6.Command;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
