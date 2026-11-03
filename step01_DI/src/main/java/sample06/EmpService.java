package sample06;

public class EmpService {
    public EmpService () {
        System.out.println("EmpService 기본생성자 호출됨,,");
    }

    public void test (EmpDTO dto) {
        System.out.println("EmpServicedml test call");
        System.out.println("EmpDTO = " + dto);//dto.toString()
    }
}
