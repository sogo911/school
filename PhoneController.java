package com.phone.jes.domain;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean calPhone = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean android = null;
		while(true) {
			switch(JOptionPane.
					showInputDialog(
							"[메뉴] 0.종료 "
							+ "1.유선전화"
							+ "2.무선전화"
							+ "3.아이폰"
							+ "4.안드로이드폰")) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				// 어디 제품 ? -> 금성 전화기
				// 누구에게 겁니까? 홍길동
				// [금성 전화기] 으로, [홍길동]에게 전화를 걸다.
				phone = new PhoneBean();
				phone.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				phone.setCall(JOptionPane.showInputDialog("who ?"));
				JOptionPane.showMessageDialog(null,
						phone.toString());
				//		phone.getCompany()+"제품을 가지고,"+phone.getCall());
				break;
			case "2":
				// 휴대폰이 맞습니까? (맞으면 1, 틀리면 0)
				// 어디 제품? > 노키아 휴대폰
				// 누구에게 겁니까?
				// [이동] 상태에서 [노키아휴대폰] 으로 [홍길동]에게 전화를 걸다.
				calPhone = new CelPhoneBean();
				calPhone.setMove(
						(JOptionPane.showInputDialog(
						"휴대폰이 맞습니까?(맞으면 y, 틀리면 n)")
						.equals("y"))
						? "이동" : "정지");
				calPhone.setCompany(JOptionPane.showInputDialog("어디 제품?"));
				calPhone.setCall(JOptionPane.showInputDialog("who?"));
				JOptionPane.showMessageDialog(null,
						calPhone.toString());
				/*String flag = JOptionPane.showInputDialog("휴대폰이 맞습니까? (맞으면 y, 틀리면 n)");
				if(flag.equals("y")) {
					calPhone.setPortable(true);
				}else {
					calPhone.setPortable(false);
				}
				 calPhone.setMove((flag.equals("y")) ? "이동" : "정지");*/
				
			// [ () ? : ; 삼항 연산자 ] - 컨디션 퀘스찬마크 콜론 세미콜론
				
			 //(flag.equals("y")) ? "이동" : "정지" ;  // 삼항연산자 식
				
			//	 (JOptionPane.showInputDialog("휴대폰이 맞나요 ? (맞으면 y 틀리면 n)").equals("y")) ? "이동":"정지" ; 
				
				break;
			case "3":
				//누구에게 문자를 보냅니까?
				//뭐라고 보낼까요?
				//[스마트폰]이기 때문에 [이동] 상태에서 [아이폰] 으로 [홍길동]에게
				//[안녕] 이라고 문자를 보냄
				iPhone = new IPhoneBean();
				iPhone.setData(
						JOptionPane.showInputDialog("뭐라고 보낼까요?"),
						JOptionPane.showInputDialog("누구?"));
				JOptionPane.showMessageDialog(null,
						iPhone.toString());
				break;
			case "4":
				android = new AndroidPhoneBean();
				android.setData(
						JOptionPane.showInputDialog("뭐라고 보낼까요?"),
						JOptionPane.showInputDialog("누구?")
						);
				JOptionPane.showMessageDialog(null,
						android.toString());
				//누구에게 문자를 보냅니까?
				//뭐라고 보낼까요?
				//[7인치] 화면사이즈로 [이동] 상태에서 [겔럭시 노트] 으로 [홍길동]에게
				//[안녕] 이라고 문자를 보냄
				break;
			}
		}	
	}	
}