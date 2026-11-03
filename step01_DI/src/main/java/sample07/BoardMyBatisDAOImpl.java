package sample07;

import org.springframework.stereotype.Repository;

@Repository // xml에서 <bean class="BoardMyBatisDAOImpl" id ="dao"/>
public class BoardMyBatisDAOImpl implements BoardDAO {

    public BoardMyBatisDAOImpl() {
        System.out.println("BoardMyBatisDAOImpl 생성자 호출");
    }

    @Override
    public void select() {
        System.out.println("BoardMyBatisDAOImpl select call");
    }
}
