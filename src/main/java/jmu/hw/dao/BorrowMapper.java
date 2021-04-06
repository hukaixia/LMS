package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Borrow;
import jmu.hw.po.BorrowExample;
import jmu.hw.po.BorrowKey;
import org.apache.ibatis.annotations.Param;

public interface BorrowMapper {
    long countByExample(BorrowExample example);

    int deleteByExample(BorrowExample example);

    int deleteByPrimaryKey(BorrowKey key);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    List<Borrow> selectByExample(BorrowExample example);
    
    List<Borrow> selectByExampleWithReader(String part);
    
    //获取借阅信息
    List<Borrow> selectByExampleWithBook(BorrowExample example);
    
    //处理某时间段个人报表打印
    List<Borrow> selectByExampleWithIdPartDate(@Param("readerId")String readerId,@Param("startDate")String startDate,@Param("endDate")String endDate);
   
    List<Borrow> selectByExampleWithIdPart(@Param("readerId")String readerId);
    
    //获取读者借阅信息
    List<Borrow> selectByExampleWithReaderDetail(@Param("readerId")String readerId);
    //处理以某段时间内学院为单位的报表打印
    List<Borrow> selectByExampleWithUnitPartDate(@Param("unitId")String unitId,@Param("startDate")String startDate,@Param("endDate")String endDate);
   
    //处理普通查询 单位
    List<Borrow> selectByExampleWithUnitPart(@Param("unitId")String unitId);
    
    long readerBorrowBookNumber(@Param("readerId")String readerId,@Param("borrowTypeId")String borrowTypeId);
    
    Borrow selectByPrimaryKey(BorrowKey key);
    
    List<Borrow> selectByExampleBorrowWithReaderId(@Param("readerId")String readerId);
    
    List<Borrow> selectByExampleBorrowWithBookName(@Param("bookName")String bookName);
    
    List<Borrow> selectByExampleBorrowWithBookId(@Param("bookId")String bookId);
    
    

    int updateByExampleSelective(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByPrimaryKeySelective(Borrow record);

    int updateByPrimaryKey(Borrow record);
}