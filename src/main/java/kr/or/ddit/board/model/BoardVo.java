package kr.or.ddit.board.model;

public class BoardVo {
	
	private int boardId;
	private String boardName;
	private String regId;
	
	public BoardVo() {
		
	}
	
	public BoardVo(int boardId, String boardName, String regId) {
		super();
		this.boardId = boardId;
		this.boardName = boardName;
		this.regId = regId;
	}
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	
}
