package netgloo.controllers;

import netgloo.models.Post;
import netgloo.models.PostDao;
import netgloo.models.User;
import netgloo.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by apple on 9/7/16.
 */
@Controller
public class PostController {

    @RequestMapping(value="/post/create")
    @ResponseBody
    public String create(int id) {
        try {
            Post post = new Post(id);
            postDao.create(post);
        }
        catch (Exception ex) {
            return "Error creating the post: " + ex.toString();
        }
        return "User succesfully created!";
    }


    // Wire the UserDao used inside this controller.
    @Autowired
    private PostDao postDao;

}
