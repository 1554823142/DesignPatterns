// 创建命令接口

public interface Command {
    public void execute();

    // 新加入的方法
    public void undo();
}
