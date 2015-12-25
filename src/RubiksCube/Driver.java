package RubiksCube;

public class Driver {
    public static void main(String[] args){
        RandomMoveGenerator rmg = new RandomMoveGenerator();
        CubeView cv = new CubeView();
        System.out.println(rmg.generateMoveSequence(10));
    }
}
