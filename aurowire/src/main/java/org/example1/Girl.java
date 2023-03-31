package org.example1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Girl {
    @Autowired
    @Qualifier(value = "style")
    private Style style;
}
