package StateMashine;

import java.util.HashMap;




import Entities.EntityInterface;
import Entities.Human;
import StateMashine.States.StateInterface;

public class StateMashine implements StateInterface
{
    protected EntityInterface player;
    protected String defaultState = "";
    protected String currentState = "";
    protected HashMap<String, StateInterface> states = new HashMap<String, StateInterface>();
    protected StateMashine sm = null;
    
   //special attributes
   // private Human hunter;
    
    public StateMashine(EntityInterface e)
    {
        this.player = e;
    }
    
    public void changeToState(String stateID)
    {
        if(!currentState.isEmpty())
        {
            this.states.get(this.currentState).exitState();
            this.currentState = "";
        }
        if(this.states.containsKey(stateID))
        {
            this.states.get(stateID).enterState();
            this.currentState = stateID;
        }
        else
        {
            if(this.sm != null)
            {
                this.sm.changeToState(stateID);
            }
        }
       /* this.states.get(this.currentState).exitState();
        this.states.get(stateID).enterState();
        this.currentState = stateID; */
    }
    
    @Override
    public void update(double deltaTime)
    {
        if(this.currentState.isEmpty())
            this.changeToState(this.defaultState);
        this.states.get(this.currentState).update(deltaTime);
        
    }
    
    public EntityInterface getEntity()
    {
        return this.player;
    }
    
    public void addState(String name, StateInterface state)
    {
        if(this.defaultState.isEmpty())
            this.defaultState = name;
        
        this.states.put(name, state);
    }

    @Override
    public void enterState()
    {
        if(this.currentState.isEmpty())
            this.changeToState(this.defaultState);
            
        
    }

    @Override
    public void exitState()
    {
        // TODO Auto-generated method stub
        
    }
    
 // Methods to detect cow enemies
 /*   public void setHunter(Human h)
    {
        this.hunter = h;
    }
    
    public Human getHunter()
    {
        return this.hunter;
    } */
    

}
