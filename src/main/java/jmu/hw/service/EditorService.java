package jmu.hw.service;

import java.util.List;

import jmu.hw.po.Editor;
import jmu.hw.po.EditorExample;

public interface EditorService {

	 List<Editor> selectByExampleWithWriter(EditorExample example);
}
