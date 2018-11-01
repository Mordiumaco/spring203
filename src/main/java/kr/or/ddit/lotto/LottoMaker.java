package kr.or.ddit.lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoMaker {
	
	
	
	public int[] lottoMaker(int randomBallsMaxnum, int needBallsMaxNum) {
		
		Lotto lotto = new Lotto(randomBallsMaxnum, needBallsMaxNum);
		
		Set<Integer> needBallSet = new HashSet<>();
		
		int[] lottoResults = lotto.getNeedballs();
		
		while(needBallSet.size() < needBallsMaxNum) {
		
			int random = (int)(Math.random()*(randomBallsMaxnum)+1);
			
			if(!needBallSet.contains(random)) {
				
				lottoResults[needBallSet.size()] = random;
				needBallSet.add(random);
			}
		}
		
		return lottoResults;
	}
	
}
