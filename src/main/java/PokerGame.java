public class PokerGame {

    public PokerGame(){

    }

    public boolean checkIfFlush(String[] cards){
//        write code here

        for (int i = 0; i < cards.length-1 ; i++) {
            char lastLetterComp1 = cards[i].charAt(cards[i].length() - 1);
            char lastLetterComp2 = cards[i+1].charAt(cards[i+1].length() - 1);

            if (lastLetterComp1 != lastLetterComp2){
                return false;
            }
        }
        return true;
    }

}
