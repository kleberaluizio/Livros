package org.example.template_method;

import java.util.List;

public class Triangle extends Polygon{
    private final Long aLength;
    private final Long bLength;
    private final Long cLength;

    public Triangle(Long aLength, Long bLength, Long cLength) {
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    @Override
    public List<Long> getSideLengths() {
        return List.of(aLength, bLength, cLength);
    }
}
