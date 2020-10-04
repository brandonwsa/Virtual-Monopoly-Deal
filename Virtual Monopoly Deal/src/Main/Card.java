/* Card.Java */
public class Card{
    
    private String name;
    private String type;
    private int value;
    private String color_1;
    private String color_2;
    
    public void createCard(String cardName){
        name = cardName;
}
    public String getName(){
        return name;
   }
    
    public String getType(){
        return type;
    }
    
    public int getValue(){
        return value;
    }
    
    public String getColor_1(){
        return color_1;
    }
    
    public String getColor_2(){
        return color_2;
    }
}