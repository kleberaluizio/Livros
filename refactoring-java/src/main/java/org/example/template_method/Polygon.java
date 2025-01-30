package org.example.template_method;

import java.util.List;

public abstract class Polygon {
    public Long getPerimeter() {
        Long perimeter = 0L;
        return getSideLengths().stream().mapToLong(sideLength -> perimeter + sideLength).sum();
    }

    public abstract List<Long> getSideLengths();
}
