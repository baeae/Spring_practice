package sample06;

import org.springframework.beans.factory.annotation.Value;

public class EmpDTO {

    //@Value("100")
    private int empno;
    @Value("희정")
    private String ename;
    @Value("${driverName}")
    private String job;

    public EmpDTO() {
        System.out.println("EmpDTO 기본생성자");
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getEmpno() {
        return empno;
    }

    //    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("EmpDTO{");
//        sb.append("empno=").append(empno);
//        sb.append(", ename='").append(ename).append('\'');
//        sb.append(", job='").append(job).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}
