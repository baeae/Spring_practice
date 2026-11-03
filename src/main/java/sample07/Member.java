package sample07;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Member {
    private String id;
    private String pwd;
    private int age;
    private String phone;
}
