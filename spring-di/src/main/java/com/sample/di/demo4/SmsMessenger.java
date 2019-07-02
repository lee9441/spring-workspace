package com.sample.di.demo4;

public class SmsMessenger implements Messenger {

		public void sendMessage(String to, String text) {
			System.out.println("받는 사람 전화번호 :" + to);
			System.out.println("SMS 단문 메시지 보내기 :" + text);
		}
		
		public String receiveMessage() {
			System.out.println("SMS 단문 메세지 받기");
			return "안녕하세요";
		}
}
