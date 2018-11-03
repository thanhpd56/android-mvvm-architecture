

package com.mindorks.framework.mvvm.data.model.others;

import com.mindorks.framework.mvvm.data.model.db.Option;
import com.mindorks.framework.mvvm.data.model.db.Question;

import java.util.List;

/**
 * Created by amitshekhar on 09/07/17.
 */

public class QuestionCardData {

    public boolean mShowCorrectOptions;

    public List<Option> options;

    public Question question;

    public QuestionCardData(Question question, List<Option> options) {
        this.question = question;
        this.options = options;
    }
}
