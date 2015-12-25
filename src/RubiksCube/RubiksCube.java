package RubiksCube;

public class RubiksCube {
    EdgePiece rg = new EdgePiece("Red","Green");
    EdgePiece rb = new EdgePiece("Red","Blue");
    EdgePiece rw = new EdgePiece("Red","White");
    EdgePiece ry = new EdgePiece("Red","Yellow");
    EdgePiece og = new EdgePiece("Orange","Green");
    EdgePiece ob = new EdgePiece("Orange","Blue");
    EdgePiece ow = new EdgePiece("Orange","White");
    EdgePiece oy = new EdgePiece("Orange","Yellow");
    EdgePiece bw = new EdgePiece("Blue","White");
    EdgePiece by = new EdgePiece("Blue","Yellow");
    EdgePiece gw = new EdgePiece("Green","White");
    EdgePiece gy = new EdgePiece("Green","Yellow");
    
    CornerPiece rgw = new CornerPiece("Red","Green","White");
    CornerPiece rgy = new CornerPiece("Red","Green","Yellow");
    CornerPiece rbw = new CornerPiece("Red","Blue","White");
    CornerPiece rby = new CornerPiece("Red","Blue","Yellow");
    CornerPiece ogw = new CornerPiece("Orange","Green","White");
    CornerPiece ogy = new CornerPiece("Orange","Green","Yellow");
    CornerPiece obw = new CornerPiece("Orange","Blue","White");
    CornerPiece oby = new CornerPiece("Orange","Blue","Yellow");
    
    public RubiksCube(){
        
    }
}
