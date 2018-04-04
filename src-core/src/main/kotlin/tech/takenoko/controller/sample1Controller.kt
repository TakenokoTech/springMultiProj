package tech.takenoko.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("sample")
class sample1Controller {

    @GetMapping("/a")
    fun path1(
        @RequestParam(value = "name", required = false, defaultValue = "aaabbb") name: String,
        model: Model
    ): String {
        model.addAttribute("name", name)
        return "sample"
    }
}

