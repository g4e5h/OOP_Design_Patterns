package com.coffeepoweredcrew.simplefactory;

public class Client {

	public static void main(String[] args) {
		Post post=PostFactory.getPost("blog");
		System.out.println(((BlogPost)post).getAuthor());
		System.out.println(post);
	}

}
