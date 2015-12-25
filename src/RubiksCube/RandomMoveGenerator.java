package RubiksCube;

import java.util.ArrayList;

public class RandomMoveGenerator {
    final int u = 0;
    final int d = 1;
    final int r = 2;
    final int l = 3;
    final int f = 4;
    final int b = 5;
    public RandomMoveGenerator(){
        
    }
    public String generateMoveSequence(int sequenceLength){
        String returnString = "";
        for(int i= 0; i<sequenceLength; i++){
            returnString+=" "+randomMove();
        }
        return returnString;
    }
    private char randomMove(){
        int move = randomIntInclusive(0,5);
        switch(move){
            case u:
                return 'u';
            case d:
                return 'd';
            case r:
                return 'r';
            case l:
                return 'l';
            case f:
                return 'f';
            case b:
                return 'b';
            default:
                return ' ';
        }
    }
    private int randomIntInclusive(int l, int h){
        return (int)(Math.random()*(h-l+1))+l;
    }
}
