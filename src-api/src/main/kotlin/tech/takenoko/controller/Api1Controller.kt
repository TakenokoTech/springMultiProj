package tech.takenoko.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import tech.takenoko.dao.UserDao
import tech.takenoko.entity.*

@RestController
@RequestMapping("api")
class Api1Controller: BaseController() {

	override val logger: Logger = LoggerFactory.getLogger(this::class.java);

	@Autowired
	lateinit var userDao: UserDao

    @GetMapping("/a")
    fun path1(
        @RequestParam(value = "name", required = false, defaultValue = "aaabbb") name: String
    ): ResponseEntity<List<Api1ControllerPath1Response>> {
		logger.info("path1 called.");

		val list: List<Map<String, Any>>? = userDao.findAll()

        val response: MutableList<Api1ControllerPath1Response> = ArrayList()
		response.add(Api1ControllerPath1Response( 1, "aaa", "bbb"))

		val headers: HttpHeaders  = HttpHeaders();
        headers.add("header1", "heaer1-value");
        return ResponseEntity(response, headers, HttpStatus.OK);
    }

}