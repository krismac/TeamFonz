package com.example.PDATool.controllers;

        import com.example.PDATool.models.Module;
        import com.example.PDATool.repository.answers.AnswerRepository;
        import com.example.PDATool.repository.modules.ModuleRepository;
        import com.example.PDATool.repository.questions.QuestionRepository;
        import com.example.PDATool.repository.students.StudentRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;


        import javax.transaction.Transactional;
        import java.util.List;

@RestController
@RequestMapping(value="/modules")
public class ModuleController {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ModuleRepository moduleRepository;


  @GetMapping(value = "/{student_id}/{question_id}")
    public List<Module> getModuleForStudentWithQuestionId(@PathVariable long student_id, @PathVariable long question_id) {
      return moduleRepository.getModuleForStudentWithQuestionId(student_id, question_id);
  }




}
