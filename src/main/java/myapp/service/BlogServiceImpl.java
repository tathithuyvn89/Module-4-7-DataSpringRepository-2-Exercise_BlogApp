package myapp.service;

import myapp.model.Blog;
import myapp.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public void saveBlog(Blog model) {
        blogRepository.save(model);

    }

    @Override
    public Blog findBlog(long id) {
       Blog blog= blogRepository.findOne(id);
       return blog;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

//    @Override
//    public Iterable<Blog> findAll() {
//        return blogRepository.findAll();
//    }

    @Override
    public void updateBlog(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void deleteBlog(long id) {
        blogRepository.delete(id);

    }

    @Override
    public Page<Blog> findAllByNameContaining(String name, Pageable pageable) {
        return blogRepository.findAllByNameContaining(name,pageable);
    }
}
