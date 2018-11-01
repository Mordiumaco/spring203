package kr.or.ddit.lotto;

public class Lotto {
	
	private int randomBallsMaxnum;
	private int needBallMaxNum;
	private int[] needballs;
	
	
	public Lotto(int randomBallsMaxnum, int needBallMaxNum) {
		this.randomBallsMaxnum = randomBallsMaxnum;
		this.needBallMaxNum = needBallMaxNum;
		this.needballs = new int[needBallMaxNum];
	}
	
	public int getRandomBallsMaxnum() {
		return randomBallsMaxnum;
	}
	public void setRandomBallsMaxnum(int randomBallsMaxnum) {
		this.randomBallsMaxnum = randomBallsMaxnum;
	}
	public int getNeedBallMaxNum() {
		return needBallMaxNum;
	}
	public void setNeedBallMaxNum(int needBallMaxNum) {
		this.needBallMaxNum = needBallMaxNum;
	}
	public int[] getNeedballs() {
		return needballs;
	}
	public void setNeedballs(int[] needballs) {
		this.needballs = needballs;
	}
	
	
}
