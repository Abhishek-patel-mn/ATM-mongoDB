package com.abhi.atm.repository.config;

import com.abhi.atm.dao.entity.ConfigParam;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigParamRepository extends MongoRepository<ConfigParam, Integer> {

	ConfigParam findByParamName(String paramName);
}
