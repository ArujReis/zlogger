package zlogger.logic.services;

import zlogger.logic.models.Post;

import javax.ws.rs.core.Response;
import java.util.List;

public interface PostService {
    public void addPost(Post contact);

    public List<Post> listPosts();

    public void removePost(Long id);
}
