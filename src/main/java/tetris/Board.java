package tetris;

import java.util.ArrayList;

public class Board {

    private final int rows;
    private final int columns;
    private Block dropBlock;
    private ArrayList<Block> fallBlocks = new ArrayList<Block>();
    private boolean hasFalling;


    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public void drop(Block dropBlock) throws IllegalStateException{
        if(this.dropBlock==null){
           hasFalling = true;
           this.dropBlock = dropBlock;
           fallBlocks.add(dropBlock);
        }else{
            throw new IllegalStateException("already falling");
        }
    }

    public boolean isEnoughSpaceToMove(int x,int y){
          if(y<rows){
              for(Block block:fallBlocks){
                  if(block.matchPosition(x,y)){
                     return false;
                  }
              }
              return true;
          }
          return false;
    }

    public boolean hasFalling(){
        return hasFalling;
    }

    public void tick(){
        int currentPositionY = dropBlock.fallIn(this);
        if(currentPositionY<0){
            dropBlock = null;
            hasFalling = false;
        }else{
            hasFalling = true;
        }
    }

    public String toString() {
        String s = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                Block matchBlock = null;
                for(Block block:fallBlocks){
                    if(block.matchPosition(col,row)){
                        matchBlock = block;
                        break;
                    }
                }
                if(matchBlock!=null){
                    s+=matchBlock.toString();
                }else{
                    s+=".";
                }
            }
            s += "\n";
        }
        return s;
    }

}
