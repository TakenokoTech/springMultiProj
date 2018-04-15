package tech.takenoko.dao

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Component
import tech.takenoko.entity.UserDto

@Component
class UserDao () : BaseDao() {

	val logger: Logger = LoggerFactory.getLogger(UserDao::class.java);

	private final val CREATE_SQL	= "INSERT INTO users (name, password) values (?, ?)"
	private final val FIND_ALL_SQL	= "SELECT * FROM users"
	private final val COUNT_SQL	= "SELECT COUNT(*) FROM users"

	fun create(name: String, password: String) {
		logger.info("create called.");
		template.update(CREATE_SQL, name, password)

	}

	fun findAll(): List<Map<String, Any>>? {
		logger.info("findAll called.");
		val list:	List<Map<String, Any>> = template.queryForList(FIND_ALL_SQL)
		for(map: Map<String, Any> in list) {
			map.forEach {
				logger.info("key=${it.key}, value=${it.value::class.java.name}");
			}
		}

//		val mapper: RowMapper<UserDto> = BeanPropertyRowMapper(UserDto::class.java);
//		val a:	List<UserDto> = template.query(FIND_ALL_SQL, mapper)
//		logger.info("size = " + a.size)
//		for(user: UserDto in a) {
//			logger.info("name=${user.getName()}, password=${user.getPassword()}");
//		}

		return null;
	}

	fun count(): Long? {
		return template.queryForObject(COUNT_SQL, Long::class.java);
	}

}