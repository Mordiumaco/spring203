package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import kr.or.ddit.lotto.LottoMaker;

public class LottoTest {

	@Test
	public void lottoTest() {
		
		//필요한 공의 갯수
		int randomBallsMaxnum = 45;
		//추첨 공의 갯수
		int needBallsMaxNum = 6;
		
		int[] lottoResults =  new LottoMaker().lottoMaker(randomBallsMaxnum, needBallsMaxNum);
		
		assertNotNull(lottoResults);
		
		System.out.println(Arrays.toString(lottoResults));
		
	}

}
