package org.xinghe.spi;

import org.xinghe.spi.provider.ProjectInfoProvider;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 描述
 *
 * @author 星河君❀❀ 2023/4/14 18:16
 * @see [相关类/方法]
 * @since [版本号]
 */
public class Test {
    public static void main(String[] args) {
        ServiceLoader<ProjectInfoProvider> load = ServiceLoader.load(ProjectInfoProvider.class);
        Iterator<ProjectInfoProvider> iterator = load.iterator();
        while (iterator.hasNext()) {
            ProjectInfoProvider provider = iterator.next();
            String projectName = provider.getProjectName();
            System.out.println(projectName);
        }
    }
}
