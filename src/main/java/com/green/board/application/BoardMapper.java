package com.green.board.application;

import com.green.board.application.model.BoardGetRes;
import com.green.board.application.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
BoardMapper 인터페이스와 BoardMapper.xml 파일을 연결한다.
연결은 xml 파일에서 namespace에 인터페이스의 풀네임으로 작성한다.

@Mapper 애노테이션은 두 파일(인터페이스,xml)의 내용으로 인터페이스를 implements한
클래스를 만들고 그 클래스를 빈 등록한다. 빈 등록을 하면 스프링 컨테이너가 해당 클래스를 싱글톤으로
객체화하고 주소값을 가지고 있는다. 그리고 주소값을 달라고하면 DI해준다.

insert, update, delete 즉, select를 제외하고는 리턴타입을 int로 하면 된다.
int 값이 affectedRows 값이다. 즉 영향받은 행의 값이다.
*/
@Mapper // 인터페이스를 MyBatis mapper로 지정하는 데 사용
public interface BoardMapper {
    int save(BoardPostReq req);

    List<BoardGetRes> findAll();
}
