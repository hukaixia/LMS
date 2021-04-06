package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.BookMapper;
import jmu.hw.po.Book;
import jmu.hw.po.BookExample;
import jmu.hw.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	@Override
	public int deleteByPrimaryKey(Integer bookId) {
		
		return bookMapper.deleteByPrimaryKey(bookId);
	}

	@Override
	public int insert(Book record) {
		
		return bookMapper.insert(record);
	}

	@Override
	public int insertSelective(Book record) {
		
		return bookMapper.insertSelective(record);
	}

	@Override
	public List<Book> selectByExample(BookExample example) {
	
		return bookMapper.selectByExample(example);
	}

	@Override
	public Book selectByPrimaryKey(Integer bookId) {
	
		return bookMapper.selectByPrimaryKey(bookId);
	}

	@Override
	public int updateByPrimaryKey(Book record) {
		return bookMapper.updateByPrimaryKey(record);
	}

}
