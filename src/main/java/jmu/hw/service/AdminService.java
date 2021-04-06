package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Admin;
import jmu.hw.po.AdminExample;
import jmu.hw.po.Book;
import jmu.hw.po.BookDesc;
import jmu.hw.po.Borrow;
import jmu.hw.po.Fine;
import jmu.hw.po.FineDetail;

public interface AdminService {
	
    Admin selectByPrimaryKey(String adminId);
    
    List<Admin> selectByExample(AdminExample example);
    
    //修改实体图书信息，实体图书各个状态发生变化，图书描述管藏书、可供借出的数也要变化
    void updateRealBook(Book book,BookDesc bookDesc);
    
    //删除某本具体的图书，同时图书描述中可供借出的数和馆藏数也要修改。
    int deleteRealBook(Integer bookId,BookDesc bookDesc);
    
    //删除读者，同时将读者的借阅信息删除   
    int deleteReader(String readerId);
    
    //读者借阅图书
    int readerBorrowBook(Book book,BookDesc bookDesc,Borrow borrow);
    
    //读者归还图书
    int readerReturnBook(Book book,BookDesc bookDesc,Borrow borrow,Integer days);
    
    //管理员添加图书
    int adminAddBook(BookDesc bookDesc,String writers);
    
    //管理员修改图书
    int adminUpdateBook(BookDesc bookDesc,String writers);
    
    //管理员处理罚款（添加罚款明细）
    
    int adminHandelFine(Fine fine,FineDetail fineDetail);
    
    //管理员处理罚款（添加罚款）
    int adminAddFine(Fine fine,FineDetail fineDetail);
}
