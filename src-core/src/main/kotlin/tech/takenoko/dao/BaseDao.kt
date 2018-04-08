package tech.takenoko.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate

abstract class BaseDao {

	@Autowired
	lateinit var template: JdbcTemplate
}