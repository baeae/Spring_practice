package sample07;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
////@ToString
//@ToString(exclude = {"subject"})
@NoArgsConstructor
@AllArgsConstructor
//@Data
@Component //생성
@Scope("prototype")
@RequiredArgsConstructor
public class BoardDTO {

    @NonNull
    private int no;

    @Value("제목~~")
    private String subject;

    private String content;

}
