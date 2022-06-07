package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class lottoView {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("로또를 살 금액을 입력하세요.");
		int money = sc.nextInt();
		int count = (int)money/1000;
		int winLotto=0;
		
		for(int j=0; j<count; j++){
		
		// 로또번호 후보 45개 생성
		List<Integer> lottoList = new ArrayList<Integer>();
		for (int i=1; i<46; i++) {
				lottoList.add(i); }
	
		// 로또번호 6개 추첨
		Set<Integer> winNum = new HashSet<Integer>();
		while (winNum.size() <7) {
			int index = r.nextInt(45)+1;
			winNum.add(lottoList.get(index));
		}
		
		// 보너스 번호 1개 추첨 & 로또번호 중복 방지
		int bonusNum;
		do {
			bonusNum = lottoList.get(r.nextInt(45)+1);
		} while (winNum.contains(bonusNum));	// 왜 오류나는 지 모르겠어 ㅠ
		
		// 로또 번호 입력
		List<Integer> inputNum = new ArrayList<Integer>();
		System.out.println("당첨 예상 번호를 입력하세요. (1~45까지 6개)");
		for (int i=0; i<6; i++) {	
			inputNum.add(sc.nextInt());
		}
		
		// 보너스 번호 입력
		System.out.println("보너스 번호를 제출하시오.");
		int inputBonus = sc.nextInt();
	
		// 예외처리
		// 일단 생략
		
		int win = 0;
		// 숫자 몇개 맞췄나 확인
		for (int i=0; i<inputNum.size(); i++) {
			if (winNum.contains(inputNum.get(i))==true) {
				win++;
				}
		}
		
		// 보너스 번호 있나 확인
		boolean bonus = false;
		if (bonusNum == inputBonus) {bonus = true;} else {bonus=false;};
		
		// 등수계산
		switch (win) {
		case 1 : 
		case 2 : 
		case 3 : 
			break;
		case 4 : if(bonus==true) winLotto++;
			break;
		case 5 :
		case 6 : winLotto++;
			break;}
	}
		// 로또 당첨 횟수 출력
		System.out.println("로또 당첨 횟수 : "+ winLotto);

	}
}
