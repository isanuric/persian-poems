package com.isanuric.aws.poem;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hafez")
public class HafezPoemController {

    Logger logger = LoggerFactory.getLogger(HafezPoemController.class);

    private PoemRepository poemRepository;

    @Autowired
    public HafezPoemController(PoemRepository poemRepository) {
        this.poemRepository = poemRepository;
    }

    @GetMapping("/status")
    public String awsStart() {
        logger.info("in: you are in");
        return "Ok";
    }

    @GetMapping("/")
    public String getHafez() {
        return "hafez";
    }

    @GetMapping("/poem/{id}")
    public String getPoemAll(@PathVariable Long id, Model model) {
        logger.info("id: [{}]", id);
        final Optional<Poem> poem = this.poemRepository.findById(id);
        model.addAttribute("poem", this.poemRepository.findById(id).orElse(null).getPoem());
        return "hafez-result";
    }
}
