/*
 * Copyright (c) 2008, Esko Luontola. All Rights Reserved.
 *
 * This program and its source code may be freely used for personal
 * non-commercial educational purposes. Usage as course material
 * is not allowed without prior permission.
 */

package tetris;

/**
 * @author orfjackal
 * @since Jun 13, 2008
 */
public interface Table {

    int rows();

    int columns();

    char cellAt(int row, int col);
}