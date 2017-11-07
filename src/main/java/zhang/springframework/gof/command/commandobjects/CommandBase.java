package zhang.springframework.gof.command.commandobjects;


public interface CommandBase {
    void execute();
    void undo();
}
