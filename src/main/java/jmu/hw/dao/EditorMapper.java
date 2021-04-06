package jmu.hw.dao;

import java.util.List;
import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;
import jmu.hw.po.EditorKey;
import org.apache.ibatis.annotations.Param;

public interface EditorMapper {
    long countByExample(EditorExample example);

    int deleteByExample(EditorExample example);

    int deleteByPrimaryKey(EditorKey key);

    int insert(Editor record);

    int insertSelective(Editor record);

    List<Editor> selectByExample(EditorExample example);

    Editor selectByPrimaryKey(EditorKey key);
    
    List<Editor> selectByExampleWithWriter(EditorExample example);

    int updateByExampleSelective(@Param("record") Editor record, @Param("example") EditorExample example);

    int updateByExample(@Param("record") Editor record, @Param("example") EditorExample example);

    int updateByPrimaryKeySelective(Editor record);

    int updateByPrimaryKey(Editor record);
}