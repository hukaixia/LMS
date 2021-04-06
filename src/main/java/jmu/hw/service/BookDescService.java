package jmu.hw.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.hw.po.BookDesc;
import jmu.hw.po.BookDescExample;

public interface BookDescService {
    int deleteByPrimaryKey(String bookCallno);

    int insert(BookDesc record);

    int insertSelective(BookDesc record);

    List<BookDesc> selectByExample(BookDescExample example);
    
    List<BookDesc> selectByExampleWithPress(BookDescExample example);
    
    List<BookDesc> selectByCallnoPart(String callno);
    
    BookDesc selectByPrimaryKeyBranch(String bookCallno);
    
    BookDesc selectByPrimaryKey(String bookCallno);

    int updateByExampleSelective(@Param("record") BookDesc record, @Param("example") BookDescExample example);

    int updateByExample(@Param("record") BookDesc record, @Param("example") BookDescExample example);

    int updateByPrimaryKeySelective(BookDesc record);

    int updateByPrimaryKey(BookDesc record);
    
    List<BookDesc> selectByContentPart(String callno);
    
    List<BookDesc> selectByISBNPart(String callno);

    List<BookDesc> selectByNamePart(String callno);
    
    public void BookDescJob();
}
