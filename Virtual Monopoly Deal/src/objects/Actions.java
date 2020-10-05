package Objects;

public class Actions{
    
    private String lastPerformedAction;
  //  private int diffLevel;
    
    public Actions(){
    //    init();
    }
    
 //   private void init(){
 //       diffLevel = Bot.getDifficulty();
 //   }
    
    public int playRentCard(Card card/*, int diffLevel*/){
        //will do logic here about rent card and know what card it is being played on, what type of rent card, etc.
        return 0; //returns value passed on success or not.
    }
    
    public int playPropertyCard(Card card/*, int diffLevel*/){
        return 0;
    }
    
    public int playActionCard(Card card){
        return 0;
    }
    
    public int playMoneyCard(Card card){
        return 0;
    }
    
    public String getLastPerformedAction(){
        return lastPerformedAction;
    }
    
}
