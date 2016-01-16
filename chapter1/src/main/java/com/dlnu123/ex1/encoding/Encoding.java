package com.dlnu123.ex1.encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(URLEncoder.encode("/", "ISO-8859-1"));     //%2F
		System.out.println(URLEncoder.encode("/", "UTF-8"));          //%2F
		System.out.println(URLEncoder.encode("/", "BIG5"));           //%2F
		System.out.println(URLEncoder.encode("/"));                   //%2F

		System.out.println(URLEncoder.encode("林", "ISO-8859-1"));    //%3F
		System.out.println(URLEncoder.encode("林", "UTF-8"));         //%E6%9E%97
		System.out.println(URLEncoder.encode("林", "BIG5"));          //%AA%4C
		System.out.println(URLEncoder.encode("林"));                  //%C1%D6

		System.out.println(URLDecoder.decode("%3F", "ISO-8859-1"));   //?
		System.out.println(URLDecoder.decode("%E6%9E%97", "UTF-8"));  //林
		System.out.println(URLDecoder.decode("%AA%4C", "BIG5"));      //林
		System.out.println(URLDecoder.decode("%C1%D6"));              //林

		System.out.println(URLDecoder.decode("%E6%9E%97", "BIG5"));   //??
		System.out.println(URLDecoder.decode("%AA%4C", "UTF-8"));     //?L
	}
}
