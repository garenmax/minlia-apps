package com.qianyi.dao;

import com.minlia.cloud.dao.BatisDao;
import com.qianyi.domain.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by will on 8/2/17.
 */
@Mapper
public interface PersonDao extends BatisDao {

    public Person findById(Long id);

    public int deleteById(Long id);
}
