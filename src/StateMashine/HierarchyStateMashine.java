package StateMashine;

import Entities.EntityInterface;


public class HierarchyStateMashine extends StateMashine
{
    private StateMashine sm;

    public HierarchyStateMashine(EntityInterface e, StateMashine sm)
    {
        super(e);
        this.sm = sm;
    }
    
    @Override
    public void enterState()
    {
        System.out.println("Enter HuntAndGater State");
        
        if(this.currentState.isEmpty())
            this.changeToState(this.defaultState);
        else
            this.states.get(this.currentState).enterState();
    }
    
    @Override
    public void update(double deltaTime)
    {
        int test = 0;
        if(test == 0)
            this.sm.changeToState("GetSleep");
        else
            super.update(deltaTime); 
        if(test != 0) 
            this.sm.changeToState("EmptyInventory");
        else
            super.update(deltaTime);
    }
    
    @Override
    public void exitState(){}

}
