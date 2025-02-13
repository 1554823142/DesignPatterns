public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("light");      // 初始化装置(为请求的接受者)

        // 创建命令, 并将接受者传递给命令
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);     // 将命令传递给调用者
        remote.buttonWasPressed();
    }
}
