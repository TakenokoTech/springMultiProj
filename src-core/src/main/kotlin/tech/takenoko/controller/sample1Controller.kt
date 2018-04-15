package tech.takenoko.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import tech.takenoko.dao.UserDao


@Controller
@RequestMapping("sample")
class sample1Controller : BaseController() {

	override val logger: Logger = LoggerFactory.getLogger(this::class.java);

	@Autowired
	lateinit var userDao: UserDao

    @GetMapping("/a")
    fun path1(
        @RequestParam(value = "name", required = false, defaultValue = "aaabbb") name: String,
        model: Model
    ): String {
		logger.info("path1 called.");

		userDao.create("xxxxxxx", "XXXXXXX");
		userDao.findAll();
		val count: Long = userDao.count()?:0;
        model.addAttribute("name", count)
        return "sample"
    }
}

