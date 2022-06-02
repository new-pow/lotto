package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class lottoView {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		lottoController l1 = new lottoController();
		
		int money = 5000;
		int count = (int)money/1000;
		
		l1.lottoMaker(count);
		
		// 당첨 번호 생성
		List<Integer> lottoList = new ArrayList<Integer>();
		for (int i=1; i<46; i++) {
				lottoList.add(i);	
		}
			List<Integer> lottoNum = new ArrayList<Integer>();
		while(lottoNum.size() == 6) {
			int result = lottoList.get(r.nextInt(45)+1);
			lottoNum.add(result);
		} 
		
		try {
		// 번호 입력
		List<Integer> inputNum = new ArrayList<Integer>();
		System.out.println("당첨 예상 번호를 입력하세요. (1~45까지 6개)");
		for (int i=0; i<6; i++) {
			
			inputNum.add(sc.nextInt());
		}
		
		System.out.println("보너스 번호를 제출하시오.");
		int inputBonus = sc.nextInt();
		
		} catch (Exception e) {}
		
		
		// 예외처리
//		

		
		// 숫자 몇개 맞췄나 확인
		
		// 보너스 번호 있나 확인
		
		// 등수계산
		
		// 5등 안에 들었으면 맞춘 개수 추가

	}
	
public void buyLotto (int money) {

	}




}
