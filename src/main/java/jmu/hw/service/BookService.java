package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Book;
import jmu.hw.po.BookExample;

public interface BookService {

	    int deleteByPrimaryKey(Integer bookId);

	    int insert(Book record);

	    int insertSelective(Book record);

	    List<Book> selectByExample(BookExample example);

	    Book selectByPrimaryKey(Integer bookId);
	    
	    int updateByPrimaryKey(Book record);

}
