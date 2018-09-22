package demo.controller;


import demo.bean.Items;
import demo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("findDetail")
    public String findDetail(Model model){
        System.out.println("表现层接收到请求!!");
        Items    items = service.findById(1);
        System.out.println("表现层查询出来的数据为:"+items);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
