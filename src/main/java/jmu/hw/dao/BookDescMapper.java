package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.BookDesc;
import jmu.hw.po.BookDescExample;
import org.apache.ibatis.annotations.Param;

public interface BookDescMapper {
    long countByExample(BookDescExample example);

    int deleteByExample(BookDescExample example);

    int deleteByPrimaryKey(String bookCallno);

    int insert(BookDesc record);

    int insertSelective(BookDesc record);

    List<BookDesc> selectByExample(BookDescExample example);
    
    List<BookDesc> selectByExampleWithPress(BookDescExample example);
    
    List<BookDesc> selectByCallnoPart(String callno);
    
    List<BookDesc> selectByContentPart(String callno);
    
    List<BookDesc> selectByISBNPart(String callno);

    List<BookDesc> selectByNamePart(String callno);
    
    BookDesc selectByPrimaryKey(String bookCallno);

    int updateByExampleSelective(@Param("record") BookDesc record, @Param("example") BookDescExample example);

    int updateByExample(@Param("record") BookDesc record, @Param("example") BookDescExample example);

    int updateByPrimaryKeySelective(BookDesc record);

    int updateByPrimaryKey(BookDesc record);

	BookDesc selectByPrimaryKeyBranch(String bookCallno);
    
}