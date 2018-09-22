package demo.dao;


import demo.bean.Items;
import org.springframework.stereotype.Repository;

@Repository("dao")
public interface ItemsDao {
    public Items findById(Integer id);
}
