/*
 * Copyright (c) 2008-2009  Esko Luontola, www.orfjackal.net
 *
 * You may use and modify this source code freely for personal non-commercial use.
 * This source code may NOT be used as course material without prior written agreement.
 */

package tetris;

import net.orfjackal.nestedjunit.NestedJUnit4;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * @author Esko Luontola
 */
@RunWith(NestedJUnit4.class)
public class RotatingPiecesTest extends Assert {

    private RotatablePiece piece;

    public class A_piece_with_preconfigured_orientations {

        @Before
        public void createPiece() {
            piece = new RotatablePiece(
                    "" +
                            ".X\n" +
                            "XX\n",
                    "" +
                            "X.\n" +
                            "XX\n",
                    "" +
                            "XX\n" +
                            "X.\n",
                    "" +
                            "XX\n" +
                            ".X\n"
            );
        }

        @Test
        public void starts_from_the_first_orientation() {
            assertEquals("" +
                    ".X\n" +
                    "XX\n", piece.toString());
        }

        @Test
        public void rotating_it_clockwise_switches_to_the_next_orientation() {
            piece = piece.rotateClockwise();
            assertEquals("" +
                    "X.\n" +
                    "XX\n", piece.toString());
        }

        @Test
        public void rotating_it_counterclockwise_switches_to_the_previous_orientation() {
            piece = piece.rotateCounterClockwise();
            assertEquals("" +
                    "XX\n" +
                    ".X\n", piece.toString());
        }

        @Test
        public void rotating_it_around_returns_to_the_first_orientation() {
            String initial = piece.toString();

            piece = piece
                    .rotateClockwise()
                    .rotateClockwise()
                    .rotateClockwise()
                    .rotateClockwise();
            assertEquals(initial, piece.toString());

            piece = piece
                    .rotateCounterClockwise()
                    .rotateCounterClockwise()
                    .rotateCounterClockwise()
                    .rotateCounterClockwise();
            assertEquals(initial, piece.toString());
        }
    }
}
