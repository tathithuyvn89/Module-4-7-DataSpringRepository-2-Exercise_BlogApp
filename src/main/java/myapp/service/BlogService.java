package myapp.service;

import myapp.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    void saveBlog( Blog model);
    Blog findBlog(long id);
//    Iterable<Blog> findAll();
    Page<Blog> findAll(Pageable pageable);
    void updateBlog(Blog blog);
    void deleteBlog(long id);
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
}
