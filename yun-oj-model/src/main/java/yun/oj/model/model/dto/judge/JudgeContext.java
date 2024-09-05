package yun.oj.model.model.dto.judge;

import lombok.Builder;
import lombok.Data;
import yun.oj.model.model.dto.question.JudgeCase;
import yun.oj.model.model.entity.Question;
import yun.oj.model.model.entity.QuestionSubmit;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: __yun
 * @Date: 2024/09/03/19:16
 * @Description:
 */
@Data
@Builder
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> input;

    private List<String> output;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
