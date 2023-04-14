package org.xinghe.spi.mysql;


import org.xinghe.spi.provider.ProjectInfoProvider;

/**
 * 描述
 *
 * @author 星河君❀❀ 2023/4/14 16:08
 * @see [相关类/方法]
 * @since [版本号]
 */
public class MySqlProjectInfoProvider implements ProjectInfoProvider {
    /**
     * 获取项目名称
     *
     * @return 项目名称
     */
    public String getProjectName() {
        System.out.println("Mysql project ...");
        return "project-mysql";
    }
}
