package jmu.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmu.hw.dao.EditorMapper;
import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;
import jmu.hw.service.EditorService;

@Service("editorService")
public class EditorServiceImpl implements EditorService {

	@Autowired
	private EditorMapper editorMapper;
	@Override
	public List<Editor> selectByExampleWithWriter(EditorExample example) {
		
		return editorMapper.selectByExampleWithWriter(example);
	}

}
