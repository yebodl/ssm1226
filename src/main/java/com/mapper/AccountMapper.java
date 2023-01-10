package com.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
    public int update(@Param("aname") String aname, @Param("money") Double money);
}
