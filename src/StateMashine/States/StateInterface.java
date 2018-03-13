package StateMashine.States;

public interface StateInterface
{
    public void enterState();
    public void update(double deltaTime);
    public void exitState();
}
