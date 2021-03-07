package home.note;

public class BoardManager {

	private int seq;
	private int hitcount;
	private Board bd[]; 

	public BoardManager() {

		bd = new Board[10];

	}

	public BoardManager(int seq, int hitcount) {
		super();
		this.seq = seq;
		this.hitcount = hitcount;
	}
	
	

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	public Board[] getBd() {
		return bd;
	}

	public void setBd(Board[] bd) {
		this.bd = bd;
	}
///////////////////////////
	public void addBoard(String title, String writer, String contents) {
		
		bd[seq++] = new Board(title, writer, contents);
	}
	
	public Board[] allPrint() {
		
		Board newBoard[] = new Board[seq];
		System.arraycopy(bd, 0, newBoard, 0, seq);
	return newBoard;
	}

}
