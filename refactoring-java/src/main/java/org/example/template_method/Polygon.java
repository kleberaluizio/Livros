package org.example.template_method;

import java.util.List;

public abstract class Polygon {
    public Long getPerimeter() {
        return getSideLengths().stream().reduce(0L, Long::sum);
    }

    public abstract List<Long> getSideLengths();
}
