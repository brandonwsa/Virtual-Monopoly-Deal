package Objects;

public class Bot extends Player{
    
    private int difficultyLevel;
    private Card cardPlayed;
    private Actions action;
    
    public Bot(){
        super.init();
        
       // difficultyLevel = playScreen.getDifficultyLevel();
       action = new Actions();
    }
    
    public void setDifficulty(int diffLevel){
        difficultyLevel = diffLevel;
    }
    
    public int getDifficulty(){
        return difficultyLevel;
    }
    
    public int performAction(){
        //the bot will select an aciton to perform here using action.[whatever action]
        
        return 0; //returns a value to represent if action was performed correctly.
    }
    
}
