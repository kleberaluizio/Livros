package org.example.template_method;

import java.util.List;

public class Square extends Polygon {
    private final Long side;

    public Square(Long side) {
        this.side = side;
    }

    @Override
    public List<Long> getSideLengths() {
        return List.of(side*4);
    }
}
