package com.cqfae.pmo.talentlib.web;

import com.cqfae.pmo.talentlib.dto.AppointExecution;
import com.cqfae.pmo.talentlib.dto.Result;
import com.cqfae.pmo.talentlib.entity.Book;
import com.cqfae.pmo.talentlib.enums.AppointStateEnum;
import com.cqfae.pmo.talentlib.exception.NoNumberException;
import com.cqfae.pmo.talentlib.exception.RepeatAppointException;
import com.cqfae.pmo.talentlib.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/question/repository")
public class QuestionRepositoryController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	private String list(Model model) {
		List<Book> list = bookService.getList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}

}
