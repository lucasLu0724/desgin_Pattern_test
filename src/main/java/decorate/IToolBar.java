package decorate;
//抽象的工具栏

import java.util.List;

/**使用装饰器模式实现一个可根据权限动态扩展功能的导航条。
 * 写好基本类型toolbar,根据不同用户角色赋予不同toolBar
 *
 */

public interface IToolBar {
    List<String> getToolBar();
}
