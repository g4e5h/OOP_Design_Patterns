package com.coffeepoweredcrew.simplefactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post getPost(String type){
        switch (type) {
            case "blog":
                BlogPost post= new BlogPost();
                post.setAuthor("Deepesh");
                return post;
            case "product":
                return new ProductPost();
            case"news":
                return new NewsPost();
            default:
                throw new IllegalArgumentException("Unsupported type: "+type);
        }
    }

}
