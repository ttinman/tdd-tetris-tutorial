// Copyright (c) 2008-2011  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.
package tetris;

/**
 * User: qlmvt_Trungnt42
 * Date: 4/29/11
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Block {

    private char c;

    private int positionX=1;

    private int positionY=0;

    public Block(char c){
        this.c = c;
    }

    public boolean matchPosition(int x,int y){
        if(x==positionX && y==positionY){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return ""+this.c;
    }

    public int fallIn(Board contextBoard){

        if(contextBoard.isEnoughSpaceToMove(positionX,positionY+1)){
           positionY++;
           return positionY;
        }else{
            return -1;
        }

    }

}
