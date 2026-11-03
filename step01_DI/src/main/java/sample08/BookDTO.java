package sample08;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@Component
@Scope("prototype")
public class BookDTO {
    private String subject;
    private String writer;
    private int price;
    private String date;
}
