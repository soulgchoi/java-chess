package chess.domain.piece;

import chess.domain.board.Direction;
import java.util.List;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, true);
        this.type = Type.QUEEN;
    }

    @Override
    public List<Direction> direction() {
        return Direction.everyDirection();
    }
}
