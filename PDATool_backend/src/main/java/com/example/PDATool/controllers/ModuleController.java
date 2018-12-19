package com.example.PDATool.controllers;

        import com.example.PDATool.models.Answer;
        import com.example.PDATool.models.Module;
        import com.example.PDATool.models.Question;
        import com.example.PDATool.repository.answers.AnswerRepository;
        import com.example.PDATool.repository.questions.QuestionRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Optional;


@RestController
@RequestMapping(value="/api/modules")
public class ModuleController {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuestionRepository questionRepository;


  @GetMapping(value = "/student/{student_id}/question/{question_id}")
    public Module getModuleForStudentWithQuestionId(@PathVariable long student_id, @PathVariable long question_id) {

      Optional<Question> question = questionRepository.findById(question_id);
      Answer answer = answerRepository.findDistinctByQuestionId(question_id);

      return new Module(question.get(), answer);

  }

  @GetMapping(value = "/student/{student_id}")
    public List<Module> getAllModulesForAStudent(@PathVariable long student_id) {

      List<Question> allQuestions = questionRepository.findAll();

      List<Long> questionIDList = new ArrayList<>();
      allQuestions.forEach(question -> {
          questionIDList.add(question.getId());
      });

      List<Module> moduleList = new ArrayList<>();
      questionIDList.forEach(questionID -> {
          moduleList.add(getModuleForStudentWithQuestionId(student_id, questionID));
      });

      return moduleList;

  }



}
