package hello.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class HelloLombok {

    //롬복 테스트

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("aaa");
        System.out.println(helloLombok.getName());
        System.out.println(helloLombok);
    }
}
