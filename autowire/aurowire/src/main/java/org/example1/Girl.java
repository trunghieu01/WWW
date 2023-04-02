package org.example1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Girl {
    private String name;
    @Autowired
    @Qualifier(value = "style")
    private Style style;
}
