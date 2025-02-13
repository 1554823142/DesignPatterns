// 使用命令对象: 如遥控器

public class SimpleRemoteControl {
    Command slot;       // 遥控器的一个插槽持有命令, 此命令控制着一个装置(如Light)

    public SimpleRemoteControl() {}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
