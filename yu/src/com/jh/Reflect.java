package com.jh;

import java.util.ArrayList;

public class Reflect {

	public static void main(String[] args) {
		
		//String str="���������ر�_���1������Ը澯-���׼�ظ澯_YQ11983755-3279";
		String str="���1������Ը澯-���׼�ظ澯:��ǰ�¼��ر�,11�������¼��ر�,YQ11983825-886,YQ11983886-8503,YQ11984102-3376,YQ11984200-5245,YQ11984335-7115,YQ11984448-6820,YQ11984600-1180,YQ11984768-9015,YQ11984901-6528,YQ11985055-497,YQ11985196-243";
		int str_index =str.indexOf("YQ");
	     String closeinfo=str.substring(str_index); 
	     //System.out.println(closeinfo);
	     String[] arrList= closeinfo.split(",");
	     ArrayList lists =new ArrayList();
	     
	     for(int i=0;i<arrList.length;i++) {
	    	String arrStr =arrList[i];
	    	lists.add(arrStr);
	     }
	     System.out.println(lists);

	}

}
