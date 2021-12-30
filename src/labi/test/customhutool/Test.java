package labi.test.customhutool;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.text.StrSplitter;

import java.util.Calendar;
import java.util.List;

/**
 * @program: JavaBasicTest
 * @description:
 * @author: dzp
 * @create: 2021-12-22 16:00
 **/
public class Test {
    public static void main(String[] args) {

        TimeInterval timer = DateUtil.timer();

        DateTime date = DateUtil.date(Calendar.getInstance());
        System.out.println(date);

        DateTime date1 = DateUtil.date();
        System.out.println(date1);

        System.out.println(timer.intervalMs());

        List<TreeNode<String>> nodeList = CollUtil.newArrayList();

        List<String> objects = CollUtil.newArrayList();

        nodeList.add(new TreeNode<>("1", "0", "系统管理", 5));
        nodeList.add(new TreeNode<>("11", "1", "用户管理", 222222));
        nodeList.add(new TreeNode<>("111", "11", "用户添加", 0));
        nodeList.add(new TreeNode<>("2", "0", "店铺管理", 1));
        nodeList.add(new TreeNode<>("21", "2", "商品管理", 44));
        nodeList.add(new TreeNode<>("221", "2", "商品管理2", 2));

        List<Tree<String>> treeList = TreeUtil.build(nodeList, "0");
        Console.log(treeList);

        String str1 = "a, ,efedsfs,   ddf";
        //参数：被切分字符串，分隔符逗号，0表示无限制分片数，去除两边空格，忽略空白项
        List<String> split = StrSplitter.split(str1, ',', 2, true, true);
        Console.log(split);

        //是否为有效的端口
        boolean result = NetUtil.isValidPort(6379);
        Console.log(result);
    }
}
