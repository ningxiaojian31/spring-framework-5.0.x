package cn.zdxh.test;

import cn.zdxh.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(IndexDao.class);
		context.refresh();

		IndexDao indexDao = (IndexDao) context.getBean("indexDao");
		indexDao.query();
	}
}
