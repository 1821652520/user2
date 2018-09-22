package demo.service.impl;


import demo.bean.Items;
import demo.dao.ItemsDao;
import demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao dao;

    public Items findById(Integer id) {
        return dao.findById(id);
    }
}
