// Copyright (c) 2008-2011  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.
package tetris;

/**
 * User: qlmvt_Trungnt42
 * Date: 5/6/11
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Piece {

    private String pieceStr;

    public Piece(String piece){
        this.pieceStr = piece;
    }

    public Piece rotateRight(){
        return null;
    }

    public String toString(){
        return pieceStr;
    }
}
