package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.web.model.Chat;
import com.eliteams.quick4j.web.model.Report;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 15-3-2
 * Time: 下午1:56
 * To change this template use File | Settings | File Templates.
 */
public interface ChatMapper extends GenericDao<Chat, Long> {
}
