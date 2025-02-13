public class RemoteLoader {
    public static void main(String[] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();          // 更改

        // 将装置设置在合适的位置
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("kitchen");
        
        // 设置开关命令
        LightOnCommand livingRoomLightOn = 
            new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = 
            new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = 
            new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = 
            new LightOffCommand(kitchenLight);
        
        // 将命令加载到遥控器的插槽中
        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl);      // 打印toString()

        // 按下遥控器的开关
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();       /// new add
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);   
        remoteControl.undoButtonWasPushed();       /// new add 
    }
}
