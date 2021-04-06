package jmu.hw.po;

public class Editor extends EditorKey {
    private String editorRole;
    
    private Writer writer;

    public String getEditorRole() {
        return editorRole;
    }

    public void setEditorRole(String editorRole) {
        this.editorRole = editorRole == null ? null : editorRole.trim();
    }

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Editor [editorRole=" + editorRole + ", writer=" + writer + ", getWriterId()=" + getWriterId()
				+ ", getBookCallno()=" + getBookCallno() + ", toString()=" + super.toString() + "]";
	}
    
    
}