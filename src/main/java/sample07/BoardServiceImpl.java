package sample07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service //<bean class="" id="boardServiceImpl"/>
public class BoardServiceImpl implements BoardService {

    @Autowired //byType 기준 -> 2개면 byName
    private BoardDAO boardMyBatisDAOImpl;

    @Autowired //byType 기준
    @Qualifier("boardOracleDAOImpl")
    private BoardDAO boardOracleDao;

    public BoardServiceImpl () {
        System.out.println("BoardServiceImpl 생성자...");
    }
    @PostConstruct
    public void init() {
        System.out.println("boardMyBatisDAOImpl = " + boardMyBatisDAOImpl);
        System.out.println("boardOracleDao = " + boardOracleDao);
    }

    @Override
    public void select() {
        System.out.println("BoardServiceImpl select call");
        boardMyBatisDAOImpl.select();
        boardOracleDao.select();

    }


}
